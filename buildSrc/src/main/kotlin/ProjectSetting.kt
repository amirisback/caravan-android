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

    const val MODULE_COMPOSE_NAME = "Frogo Piano Tiles"
    const val MODULE_COMPOSE_PACKAGE_NAME = "pianogames"

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

    const val PROJECT_APP_ID = "$BASE_DOMAIN.$BASE_PLAY_CONSOLE.$MODULE_COMPOSE_PACKAGE_NAME"





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