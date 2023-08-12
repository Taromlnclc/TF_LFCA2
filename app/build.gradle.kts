plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.lc_td_final"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.lc_td_final"
        minSdk = 27
        targetSdk = 33
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
}
dependencies {

        implementation ("androidx.core:core-ktx:1.10.1")
        implementation ("androidx.appcompat:appcompat:1.6.1")
        implementation ("com.google.android.material:material:1.9.0")
        implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation ("androidx.navigation:navigation-fragment-ktx:2.6.0")
        implementation ("androidx.navigation:navigation-ui-ktx:2.6.0")
        testImplementation ("junit:junit:4.13.2")
        androidTestImplementation ("androidx.test.ext:junit:1.1.5")
        androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")




        //Retrofit
        implementation ("com.squareup.retrofit2:retrofit:2.9.0")
        implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

        // Retrofit with Scalar Converter
        implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")

        // Glide
        implementation ("com.github.bumptech.glide:glide:4.13.0")
        annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")


        //ROOM
        implementation ("androidx.room:room-runtime:2.5.2")
        annotationProcessor ("androidx.room:room-compiler:2.5.2")
        testImplementation ("androidx.room:room-testing:2.5.2")

        implementation ("androidx.room:room-ktx:2.5.2")
        //  kapt ("androidx.room:room-compiler:2.5.2")

        // ciclo de vida
        implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")






        // Optional -- Mockito framework
        testImplementation ("org.mockito:mockito-core:1.10.19")

        // dependencias de mockWebserver
        // Dependencia de OkHttp
        implementation ("com.squareup.okhttp3:okhttp:4.9.3")
        // Dependencia de OkHttp MockWebServer (para pruebas)
        // testImplementation "(com.squareup.okhttp3:mockwebserver:4.9.3")



// For Robolectric tests.
        testImplementation("com.google.dagger:hilt-android-testing:2.44")
        // ...with Kotlin.
        //kaptTest("com.google.dagger:hilt-android-compiler:2.44")
        // ...with Java.
        testAnnotationProcessor("com.google.dagger:hilt-android-compiler:2.44")

        // For instrumented tests.
        androidTestImplementation("com.google.dagger:hilt-android-testing:2.44")
        // ...with Kotlin.
        //kaptAndroidTest("com.google.dagger:hilt-android-compiler:2.44")
        // ...with Java.
        androidTestAnnotationProcessor("com.google.dagger:hilt-android-compiler:2.44")
}
