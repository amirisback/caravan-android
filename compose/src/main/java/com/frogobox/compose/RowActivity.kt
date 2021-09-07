package com.frogobox.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/*
 * Created by faisalamir on 07/09/21
 * CaravanAndroid
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */
class RowActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowActivityUI()
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RowActivityUI() {
    Row() {
        Text(text = "Learning Jetpack Compose")
        Text(text = "Hello Jetpack Compose")
    }
}