plugins {
    id("idea")
}

idea {
    module {
        generatedSourceDirs.add(file("src/main/gen"))
        sourceDirs.add(file("src/main/ui"))
    }
}
