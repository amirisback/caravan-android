/*
 * Created by faisalamir on 19/09/21
 * FrogoRecyclerView
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

object ProjectSetting {

    // ---------------------------------------------------------------------------------------------

    // Project settings

    const val BASE_DOMAIN = "com"
    const val BASE_PLAY_CONSOLE = "frogobox"

    const val MODULE_COMPOSE_NAME = "compose"
    const val MODULE_COMPOSE_PACKAGE_NAME = "compose"

    const val MODULE_COROUTINES_NAME = "coroutines"
    const val MODULE_COROUTINES_PACKAGE_NAME = "coroutines"

    const val MODULE_DAGGER_NAME = "dagger"
    const val MODULE_DAGGER_PACKAGE_NAME = "dagger"

    const val MODULE_FIREBASE_NAME = "firebase"
    const val MODULE_FIREBASE_PACKAGE_NAME = "firebase"

    const val MODULE_KOIN_NAME = "koin"
    const val MODULE_KOIN_PACKAGE_NAME = "koin"

    const val MODULE_TESTING_NAME = "testing"
    const val MODULE_TESTING_PACKAGE_NAME = "testing"

    const val MODULE_UI_NAME ="ui"
    const val MODULE_UI_PACKAGE_NAME = "ui"

    const val MODULE_VIEWMODEL_NAME = "viewmodel"
    const val MODULE_VIEWMODEL_PACKAGE_NAME = "viewmodel"


    const val VERSION_MAJOR = 1
    const val VERSION_MINOR = 0
    const val VERSION_PATCH = 0

    // ---------------------------------------------------------------------------------------------

    // Key Store
    const val PLAYSTORE_STORE_FILE = "frogoboxmedia.jks"
    const val PLAYSTORE_STORE_PASSWORD = "amirisback"
    const val PLAYSTORE_KEY_ALIAS = "frogoisback"
    const val PLAYSTORE_KEY_PASSWORD = "amirisback"

    // ---------------------------------------------------------------------------------------------
    // Default Setting - Do Not Change
    // ---------------------------------------------------------------------------------------------

    const val PROJECT_COMPILE_SDK = 31
    const val PROJECT_MIN_SDK = 21
    const val PROJECT_TARGET_SDK = PROJECT_COMPILE_SDK

    // ---------------------------------------------------------------------------------------------

    const val PROJECT_COMPOSE_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_COMPOSE_PACKAGE_NAME"
    const val PROJECT_COROUTINES_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_COROUTINES_PACKAGE_NAME"
    const val PROJECT_DAGGER_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_DAGGER_PACKAGE_NAME"
    const val PROJECT_FIREBASE_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_FIREBASE_PACKAGE_NAME"
    const val PROJECT_KOIN_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_KOIN_PACKAGE_NAME"
    const val PROJECT_TESTING_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_TESTING_PACKAGE_NAME"
    const val PROJECT_UI_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_UI_PACKAGE_NAME"
    const val PROJECT_VIEWMODEL_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_VIEWMODEL_PACKAGE_NAME"

    const val PROJECT_VERSION_CODE = (VERSION_MAJOR * 100) + (VERSION_MINOR * 10) + (VERSION_PATCH * 1)
    const val PROJECT_VERSION_NAME = "$VERSION_MAJOR.$VERSION_MINOR.$VERSION_PATCH"

    // ---------------------------------------------------------------------------------------------

    // Declaration apps name debug mode
    const val DEBUG_ATTRIBUTE = "Development"
    const val NAME_APP_DEBUG = "$MODULE_COMPOSE_NAME $DEBUG_ATTRIBUTE"

    // Constant Variable
    val NAME_APK = MODULE_COMPOSE_NAME.toLowerCase().replace(" ", "-")
    val NAME_SETTING_LOWERCASE = MODULE_COMPOSE_NAME.toLowerCase().replace(" ", "_")
    val NAME_SETTING_UPERCASE = MODULE_COMPOSE_NAME.toUpperCase().replace(" ", "_")
    val DB = "db_$NAME_SETTING_LOWERCASE.db"
    val PREF_NAME = "PREF_GAME_$NAME_SETTING_UPERCASE"

    // Declaration admob id for debug
    const val DEBUG_ADMOB_APP_ID = "ca-app-pub-3940256099942544~3347511713"

}