#!/usr/bin/env python3
"""Generate Classic (non-Islands) theme variants from the Islands theme sources."""

import json
from pathlib import Path

THEMES_DIR = Path("src/main/resources/themes")

PARENT_THEME_MAP = {
    "Islands Dark": "Darcula",
    "Islands Light": "IntelliJ",
}

SOURCES = [
    "kanagawa_wave",
    "kanagawa_dragon",
    "kanagawa_lotus",
]


def generate_classic(source_name: str) -> None:
    src = THEMES_DIR / f"{source_name}.theme.json"
    dst = THEMES_DIR / f"{source_name}_classic.theme.json"

    data = json.loads(src.read_text())

    data["name"] = data["name"] + " (Classic)"
    data["parentTheme"] = PARENT_THEME_MAP[data["parentTheme"]]
    data["ui"].pop("Island", None)

    dst.write_text(json.dumps(data, indent=2, ensure_ascii=False) + "\n")
    print(f"  {src.name} -> {dst.name}")


if __name__ == "__main__":
    print("Generating Classic theme variants...")
    for source in SOURCES:
        generate_classic(source)
    print("Done.")
