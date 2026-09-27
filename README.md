# Thaumaturgic-Integrations

A bridge between Thaumaturge and other magic mods, now for 1.21.1!

## Current support

| Mod            | State        | Additions                                                                                                   |
|----------------|--------------|-------------------------------------------------------------------------------------------------------------|
| Astral Sorcery | 🔴 (planned) | -                                                                                                           |
| Botania        | 🔴 (planned) | Manasteel, terrasteel, elementium wands and gear ( + extra support), gate botania progression to researches |
| Occultism      | 🔴 (planned) | -                                                                                                           |
| Neo Vitae      | 🔴 (planned) | Bloody wands, (probably extra altar tier after Thaumic Tinkerer is ported?)                                 |
| Ars Nouveau    | 🔴 (planned) | -                                                                                                           |

## Build

Use the Gradle wrapper from this directory:

```powershell
.\gradlew.bat build
.\gradlew.bat runClient
.\gradlew.bat runServer
```

The project uses a Java 21 toolchain. `spotlessApply` formats Java sources. Release jars are written to `build/libs`.
