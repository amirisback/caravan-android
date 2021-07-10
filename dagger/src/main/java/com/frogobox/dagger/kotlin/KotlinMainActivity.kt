package com.frogobox.dagger.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.dagger.R

class KotlinMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)

        val car = DaggerCarComponent.create().car
        car?.drive()

    }
}
