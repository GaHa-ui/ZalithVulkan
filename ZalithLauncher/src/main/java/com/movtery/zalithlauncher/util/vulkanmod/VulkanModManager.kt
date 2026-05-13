package com.movtery.zalithlauncher.util.vulkanmod

import android.content.Context
import com.movtery.zalithlauncher.game.version.installed.VersionFolders
import com.movtery.zalithlauncher.path.PathManager
import com.movtery.zalithlauncher.setting.AllSettings
import com.movtery.zalithlauncher.utils.logging.Logger.lInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.apache.commons.io.FileUtils
import java.io.File

const val VULKANMOD_JAR_NAME = "VulkanMod-Android-ARM64.jar"
const val VULKANMOD_REPO = "shindozk/VulkanMod-Android-ARM64"

object VulkanModManager {
    private var dialogShown = false

    fun isVulkanModInstalled(): Boolean {
        val minecraftDir = File(PathManager.DIR_GAME, ".minecraft")
        val modsDir = File(minecraftDir, VersionFolders.MOD.folderName)
        val modFile = File(modsDir, VULKANMOD_JAR_NAME)
        return modFile.exists()
    }

    fun hasDialogBeenShown(): Boolean = dialogShown

    fun markDialogShown() {
        dialogShown = true
    }

    suspend fun copyVulkanModToMods(context: Context): Boolean = withContext(Dispatchers.IO) {
        try {
            val minecraftDir = File(PathManager.DIR_GAME, ".minecraft")
            val modsDir = File(minecraftDir, VersionFolders.MOD.folderName).apply { mkdirs() }
            val destFile = File(modsDir, VULKANMOD_JAR_NAME)

            context.assets.open(VULKANMOD_JAR_NAME).use { input ->
                destFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            lInfo("VulkanMod copied to mods: ${destFile.absolutePath}")
            AllSettings.vulkanmodArm64LibsInstalled.save(true)
            true
        } catch (e: Exception) {
            lInfo("Failed to copy VulkanMod: ${e.message}")
            false
        }
    }
}