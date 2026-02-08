## TemplateDevEnv
_For Kotlin see [TemplateDevEnvKt](https://github.com/CleanroomMC/TemplateDevEnvKt)_

Template workspace for modding Minecraft 1.12.2. Licensed under MIT, it is made for public use.

This template runs on **Java 25**, **Gradle 9.2.1** + **[RetroFuturaGradle](https://github.com/GTNewHorizons/RetroFuturaGradle) 2.0.2** + **Forge 14.23.5.2847**.

With **coremod and mixin support** that is easy to configure.

### Instructions:

1. Click `use this template` at the top.
2. Clone the repository that you have created with this template to your local machine.
3. Make sure IDEA is using Java 25 for Gradle before you sync the project. Verify this by going to IDEA's `Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM`.
4. Open the project folder in IDEA. When prompted, click "Load Gradle Project" as it detects the `build.gradle`, if you weren't prompted, right-click the project's `build.gradle` in IDEA, select `Link Gradle Project`, after completion, hit `Refresh All` in the gradle tab on the right.
5. Run gradle tasks such as `runClient` and `runServer` in the IDEA gradle tab, or use the auto-imported run configurations like `1. Run Client`.

### Configuration
The mod can be configured via the in-game UI or the `darkness.cfg` file.

#### Minimum Darkness
You can set a minimum darkness level for each dimension. This prevents the mod from making things darker than the specified level.
- **Default Minimum**: Sets the default minimum light level (0-15) for all dimensions.
- **Minimum by ID**: Sets the minimum light level for specific dimension IDs. Format: `ID:Level` (e.g., `0:5` for Overworld level 5).
- **Minimum by Name**: Sets the minimum light level for specific dimension names. Format: `Name:Level` (e.g., `overworld:5`).

### Notes:
- Dependencies script in [gradle/scripts/dependencies.gradle](gradle/scripts/dependencies.gradle), explanations are commented in the file.
- Publishing script in [gradle/scripts/publishing.gradle](gradle/scripts/publishing.gradle).
- When writing Mixins on IntelliJ, it is advisable to use latest [MinecraftDev Fork for RetroFuturaGradle](https://github.com/eigenraven/MinecraftDev/releases).
