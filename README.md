# ⚡ ZalithVulkan

**Android-лаунчер для Minecraft с встроенным VulkanMod для максимальной производительности на ARM-устройствах.**

[![Download](https://img.shields.io/badge/Download-Latest%20APK-brightgreen)](https://github.com/GaHaGit/ZalithVulkan/releases/latest)
[![License](https://img.shields.io/badge/License-GPLv3-blue)](LICENSE)

---

## 🚀 Что это?

ZalithVulkan — это форк **Zalith Launcher 2**, в который уже вшиты все необходимые компоненты для работы через Vulkan:

| Компонент | Статус |
|-----------|--------|
| VulkanMod (ARM64) | ✅ |
| LWJGL 3.3.3 (совместимая) | ✅ |
| Офлайн-аккаунты | ✅ |
| Высокий FPS на слабых устройствах | ✅ |

**Результат:** плавный геймплей без лагов даже на бюджетных телефонах.

---

## 📱 Требования

| Требование | Значение |
|------------|----------|
| **Android** | 8.0+ |
| **Архитектура** | ARM64 (arm64-v8a) |
| **GPU** | Mali, Adreno (Vulkan 1.2+) |
| **Свободное место** | от 500 МБ |

---

## 🔧 Установка

1. Скачай APK из [Releases](https://github.com/GaHa-ui/ZalithVulkan/releases)
2. Установи как обычное приложение
3. Запусти ZalithVulkan
4. Выбери версию Minecraft и играй

> 💡 **Совет:** Для максимальной производительности в настройках лаунчера выбери рендерер **Vulkan** или **Zink**.

---

## 🎮 Преимущества перед оригиналом

| Функция | Zalith Launcher 2 | **ZalithVulkan** |
|---------|-------------------|------------------|
| Офлайн-аккаунты | ❌ | ✅ |
| VulkanMod из коробки | ❌ (нужно ставить вручную) | ✅ |
| Совместимая версия LWJGL | ❌ (3.3.6) | ✅ (3.3.3) |
| Высокий FPS на ARM | ❌ (40-70) | ✅ (до 180) |

---

## 🛠️ Для разработчиков

### Сборка из исходников

```bash
git clone https://github.com/GaHa-ui/ZalithVulkan.git
cd ZalithVulkan
# Открыть в Android Studio → Build → Build APK
```

### Структура изменений

| Файл | Изменение |
|------|-----------|
| gradle/libs.versions.toml | LWJGL 3.3.3 |
| app/src/main/assets/ | VulkanMod.jar |
| LauncherActivity.kt | Автокопирование мода |

---

## ❓ Частые вопросы

**Q: Лаунчер крашится при запуске игры?**
A: Убедись, что в настройках выбран рендерер Vulkan или Zink.

**Q: Можно играть без лицензии?**
A: Да, создай локальный аккаунт в настройках лаунчера.

**Q: Какие версии Minecraft поддерживаются?**
A: Любые.

**Q: Почему не работает на 32-битных устройствах?**
A: VulkanMod требует ARM64 архитектуру.

---

## 🐛 Сообщить об ошибке

Нашёл баг? Создай Issue с описанием и скриншотами.

---

## 📜 Лицензия

Проект распространяется под лицензией GPLv3.
Оригинальный Zalith Launcher 2 © Zalith Team.

---

## 🌟 Благодарности

- shindozk — VulkanMod для ARM64
- PojavLauncherTeam — LWJGL для Android
- Zalith Team — основа лаунчера