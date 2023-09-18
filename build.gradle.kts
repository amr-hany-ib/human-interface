import org.apache.tools.ant.taskdefs.condition.Os

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.10" apply false
    id("org.jlleitschuh.gradle.ktlint") version "11.5.1" apply true
    alias(libs.plugins.com.android.library) apply false
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
