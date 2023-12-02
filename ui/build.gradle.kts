import com.github.gradle.node.npm.task.NpmTask

plugins {
    id("com.github.node-gradle.node") version "7.0.1"
}

node {
    version = "20.10.0"
    download = true
}

val npmBuild = task("npmBuild", NpmTask::class) {
    dependsOn("npmInstall")
    args.set(listOf("run", "build"))
}

task("assemble").dependsOn(npmBuild)
