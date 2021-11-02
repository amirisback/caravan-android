package com.frogobox.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.frogobox.api.core.ConsumeApiResponse
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.api.news.model.Article
import com.frogobox.api.news.response.ArticleResponse
import com.frogobox.api.news.util.NewsConstant.CATEGORY_HEALTH
import com.frogobox.api.news.util.NewsConstant.COUNTRY_ID
import com.frogobox.api.news.util.NewsUrl

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
            ActivityContent()
        }
    }

    private fun setupData(): MutableList<ExampleData> {
        val data = mutableListOf<ExampleData>()
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        data.add(ExampleData("Amir, Is Back", "Android Programmer"))
        return data
    }

}

@Composable
fun ActivityContent() {

    var newsState: List<Article> by remember {
        mutableStateOf(emptyList())
    }

    val consumeNewsApi = ConsumeNewsApi(NewsUrl.API_KEY)
    consumeNewsApi.usingChuckInterceptor(LocalContext.current) // Using Chuck Interceptor
    consumeNewsApi.getTopHeadline( // Adding Base Parameter on main function
        null,
        null,
        CATEGORY_HEALTH,
        COUNTRY_ID,
        null,
        null,
        object : ConsumeApiResponse<ArticleResponse> {
            override fun onSuccess(data: ArticleResponse) {
                // Your Ui or data
                newsState = data.articles!!
            }

            override fun onFailed(statusCode: Int, errorMessage: String?) {
                // Your failed to do
            }

            override fun onShowProgress() {
                // Your Progress Show
            }

            override fun onHideProgress() {
                // Your Progress Hide
            }

        })

    Lazy(newsState)

}

@Composable
fun Lazy(data: List<Article>) {
    LazyColumn {
        items(data.size) { index ->
            ListMessage(data[index])
        }

    }
}

@Composable
fun ListMessage(data: Article) {
    Column() {
        data.title?.let { Text(text = "- $it") }
    }
}
