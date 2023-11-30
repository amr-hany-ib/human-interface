import org.apache.tools.ant.taskdefs.condition.Os
@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.kotlin.android).apply(false)
    alias(libs.plugins.google.services).apply(false)
    alias(libs.plugins.devtools)
    alias(libs.plugins.dagger.hilt.android).apply(false)
    kotlin(libs.plugins.serialization.get().pluginId).version(libs.versions.serializationPlugin)
    alias(libs.plugins.android.library).apply(false)
    alias(libs.plugins.ktlint).apply(true)
}

allprojects {
    tasks.create("copyGitHooks", Copy::class.java) {
        var suffix = "macos"
        if (Os.isFamily(Os.FAMILY_WINDOWS)) {
            suffix = "windows"
        }
        description = "Copies the git hooks from /git-hooks to the .git folder."
        group = "git hooks"
        from("$rootDir/scripts/pre-commit-$suffix")
        into("$rootDir/.git/hooks/")
        rename("pre-commit-$suffix", "pre-commit")
        fileMode = 0b111101101
    }

    // afterEvaluate {
    tasks.getByPath(":app:preBuild").dependsOn(":copyGitHooks")
    // }
}
