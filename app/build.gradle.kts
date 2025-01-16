plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.google.services)
}

android {
    namespace = "com.enes.harrypotter"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.enes.harrypotter"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    sourceSets {
        getByName("debug").java.srcDirs("$rootDir/navigation/src/main/sharedRes")
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(projects.common.data)
    implementation(projects.common.domain)
    implementation(projects.common.presentation)

    implementation(projects.feature.login.data)
    implementation(projects.feature.login.domain)
    implementation(projects.feature.login.presentation)

    implementation(projects.feature.home.data)
    implementation(projects.feature.home.domain)
    implementation(projects.feature.home.presentation)

    implementation(projects.feature.detail.data)
    implementation(projects.feature.detail.domain)
    implementation(projects.feature.detail.presentation)

    implementation(projects.navigation)
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.auth)
    implementation(libs.firebase.analytics)
    //  Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
}