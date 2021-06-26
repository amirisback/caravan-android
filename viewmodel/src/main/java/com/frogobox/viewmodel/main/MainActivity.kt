package com.frogobox.viewmodel.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.frogobox.viewmodel.calculator.CalculatorActivity
import com.frogobox.viewmodel.databinding.ActivityMainBinding
import com.frogobox.viewmodel.greeting.GreetingActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            btnGreetingApp.setOnClickListener {
                startActivity(Intent(this@MainActivity, GreetingActivity::class.java))
            }
            btnCalculatorApp.setOnClickListener {
                startActivity(Intent(this@MainActivity, CalculatorActivity::class.java))
            }
        }
    }
}