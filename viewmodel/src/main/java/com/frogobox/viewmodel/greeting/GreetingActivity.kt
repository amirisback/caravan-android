package com.frogobox.viewmodel.greeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.frogobox.viewmodel.databinding.ActivityGreetingBinding
import com.frogobox.viewmodel.utils.Constant
import com.frogobox.viewmodel.model.People

class GreetingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGreetingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGreetingBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Greeting Apps"
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            btnGreeting.setOnClickListener {
                val name = etName.text.toString()
                var gender = ""
                if (optMan.isChecked) {
                    gender = Constant.GENDER_MAN
                } else if (optWoman.isChecked) {
                    gender = Constant.GENDER_WOMAN
                }
                val people = People(name, gender)
                setupViewModel(people)
            }
        }
    }

    private fun setupViewModel(people: People) {
        val viewModel = ViewModelProvider(this).get(GreetingViewModel::class.java)
        viewModel.apply {
            greeting(people)
            binding.tvGreeting.apply {
                text = greetingPeople
                visibility = View.VISIBLE
            }

        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}