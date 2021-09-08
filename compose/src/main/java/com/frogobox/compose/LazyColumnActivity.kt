package com.frogobox.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

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
            Lazy(setupData())
        }
    }

    private fun setupData() : MutableList<ExampleData> {
        val data = mutableListOf<ExampleData>()
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        return data
    }


}

@Composable
fun Lazy(data: List<ExampleData>, ) {
    LazyColumn {

        items(data.size) { index ->
            ListMessage(data[index])
        }

    }
}

@Composable
fun ListMessage(data: ExampleData) {
    Column() {
        Text(text = data.name)
        Text(text = data.role)
    }
}
