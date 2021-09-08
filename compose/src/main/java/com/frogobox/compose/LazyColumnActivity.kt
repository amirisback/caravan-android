package com.frogobox.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/*
 * Created by faisalamir on 08/09/21
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
class LazyColumnActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lazy()
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Lazy() {
    LazyColumn {

        // Add 5 items
        items(5) { index ->
            Text(text = "Item: $index")
        }
    }
}
