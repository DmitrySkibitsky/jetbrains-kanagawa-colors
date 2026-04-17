<div align="center">

<img src="src/main/resources/META-INF/pluginIcon.svg" width="120" height="120" alt="Kanagawa Colors">

# Kanagawa Colors Theme

A JetBrains IDE color theme inspired by [kanagawa.nvim](https://github.com/rebelot/kanagawa.nvim) — the iconic palette of *The Great Wave off Kanagawa* by Katsushika Hokusai.

[![JetBrains Plugin](https://img.shields.io/jetbrains/plugin/v/com.github.followlemmi.kanagawa?label=Marketplace&color=7E9CD8&style=flat-square)](https://plugins.jetbrains.com/plugin/com.github.followlemmi.kanagawa)
[![License: MIT](https://img.shields.io/badge/License-MIT-DCA561?style=flat-square)](LICENSE)

</div>

---

## Wave — Dark Default

Deep ocean tones with warm foreground colors. Rich contrast for everyday use.

<p>
  <img src="screenshots/wave_1.png" width="49%" alt="Wave — editor">
  <img src="screenshots/wave_2.png" width="49%" alt="Wave — completion">
</p>

## Dragon — Dark Muted

Earthy, subdued palette with lower contrast. Easy on the eyes for long sessions.

<p>
  <img src="screenshots/dragon_1.png" width="49%" alt="Dragon — editor">
  <img src="screenshots/dragon_2.png" width="49%" alt="Dragon — completion">
</p>

## Lotus — Light

Warm parchment backgrounds with rich, saturated syntax colors.

<p>
  <img src="screenshots/lotus_1.png" width="49%" alt="Lotus — editor">
  <img src="screenshots/lotus_2.png" width="49%" alt="Lotus — completion">
</p>

---

## Installation

### From JetBrains Marketplace

1. Open **Settings** > **Plugins** > **Marketplace**
2. Search for **Kanagawa Colors Theme**
3. Click **Install** and restart the IDE

### From Disk

1. Download the latest `.zip` from [Releases](https://github.com/followLemmi/jetbrains-kanagawa-colors/releases)
2. **Settings** > **Plugins** > gear icon > **Install Plugin from Disk...**
3. Select the `.zip` and restart

### Activate

**Settings** > **Appearance & Behavior** > **Appearance** > **Theme** and choose:

| Theme                         | UI                   |
|-------------------------------|----------------------|
| **Kanagawa Wave**             | Islands UI (2024.2+) |
| **Kanagawa Dragon**           | Islands UI (2024.2+) |
| **Kanagawa Lotus**            | Islands UI (2024.2+) |
| **Kanagawa Wave (Classic)**   | Classic UI           |
| **Kanagawa Dragon (Classic)** | Classic UI           |
| **Kanagawa Lotus (Classic)**  | Classic UI           |

The **Islands UI** variants are designed for the modern JetBrains UI introduced in 2024.2.
The **Classic** variants target the legacy UI and do not inherit from Islands.

## Compatibility

- IntelliJ IDEA 2024.2+
- All JetBrains IDEs based on IntelliJ Platform 2024.2+ (WebStorm, PyCharm, GoLand, CLion, etc.)

## Building from Source

```bash
./gradlew buildPlugin
```

The plugin `.zip` will be in `build/distributions/`.

The Classic theme variants (`*_classic.theme.json`) are generated automatically during the build from their Islands counterparts via `generate_classic_themes.py`. Do not edit them by hand — edit the source themes instead.

To regenerate Classic themes manually:

```bash
python3 generate_classic_themes.py
```

To launch a sandboxed IDE for testing:

```bash
./gradlew runIde
```

## Credits

- Color palette by [rebelot/kanagawa.nvim](https://github.com/rebelot/kanagawa.nvim)
- Inspired by *The Great Wave off Kanagawa* by Katsushika Hokusai

## License

[MIT](LICENSE)
