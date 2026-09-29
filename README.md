# Thaumaturgic-Integrations

A bridge between Thaumaturge and other magic mods, now for 1.21.1!

## Current support

| Mod            | State                   | Additions                                                                                                               |
|----------------|-------------------------|-------------------------------------------------------------------------------------------------------------------------|
| Astral Sorcery | 🔴 (planned)            | [Planning Doc](https://docs.google.com/document/d/1bkAWQZY6FOhyOHPANEMzp3_9m8ah3WvlNZGEJy6csuo/edit?tab=t.rrhjdo5eyf9)  |
| Botania        | 🔴 (planned after port) | [Planning Doc](https://docs.google.com/document/d/1bkAWQZY6FOhyOHPANEMzp3_9m8ah3WvlNZGEJy6csuo/edit?tab=t.8eucnv4lw7pb) |
| Occultism      | 🔴 (planned)            | [Planning Doc](https://docs.google.com/document/d/1bkAWQZY6FOhyOHPANEMzp3_9m8ah3WvlNZGEJy6csuo/edit?tab=t.bvnl8l5x7mwe) |
| Neo Vitae      | 🔴 (planned)            | [Planning Doc](https://docs.google.com/document/d/1bkAWQZY6FOhyOHPANEMzp3_9m8ah3WvlNZGEJy6csuo/edit?tab=t.wfqdzfgynhmv) |
| Ars Nouveau    | 🔴 (planned)            | [Planning Doc](https://docs.google.com/document/d/1bkAWQZY6FOhyOHPANEMzp3_9m8ah3WvlNZGEJy6csuo/edit?tab=t.cz6ycaqmk10e) |
| Malum          | 🔴 (planned)            | [Planning Doc](https://docs.google.com/document/d/1bkAWQZY6FOhyOHPANEMzp3_9m8ah3WvlNZGEJy6csuo/edit?tab=t.kbcyo5ijoe43) |
| Iron's Spells  | 🔴 (planned)            | [Planning Doc](https://docs.google.com/document/d/1bkAWQZY6FOhyOHPANEMzp3_9m8ah3WvlNZGEJy6csuo/edit?tab=t.pua9z3ybdq88) |

## Build

Use the Gradle wrapper from this directory:

```powershell
.\gradlew.bat build
.\gradlew.bat runClient
.\gradlew.bat runServer
```

The project uses a Java 21 toolchain. `spotlessApply` formats Java sources. Release jars are written to `build/libs`.
