pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "HarryPotter"
include(":app")
include(":common")
include(":feature")
include(":common:data")
include(":common:domain")
include(":common:presentation")
include(":feature:login")
include(":feature:detail")
include(":feature:home")
include(":feature:detail:data")
include(":feature:detail:domain")
include(":feature:detail:presentation")
include(":feature:home:data")
include(":feature:home:domain")
include(":feature:home:presentation")
include(":feature:login:data")
include(":feature:login:domain")
include(":feature:login:presentation")
include(":navigation")
