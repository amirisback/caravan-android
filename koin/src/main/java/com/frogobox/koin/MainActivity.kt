package com.frogobox.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.frogobox.koin.databinding.ActivityMainBinding
import com.frogobox.koin.presenter.HelloPresenter
import com.frogobox.koin.viewmodel.HelloViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // Lazy injected HelloPresenter
    private val helloPresenter: HelloPresenter by inject()

    // Lazy injected HelloViewModel
    private val helloViewModel: HelloViewModel by viewModel()

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.tvViewModel.text = helloViewModel.sayHello()

    }

}