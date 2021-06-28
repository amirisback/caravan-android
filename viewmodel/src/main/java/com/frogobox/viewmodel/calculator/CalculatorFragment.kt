package com.frogobox.viewmodel.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frogobox.viewmodel.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {

    private var binding: FragmentCalculatorBinding? = null
    private lateinit var mActivity: CalculatorActivity
    private lateinit var viewModel: CalculatorViewModel

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mActivity = (activity as CalculatorActivity)
        binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewModel()
        setupUI()
    }

    private fun setupUI() {
        binding?.apply {
            viewModel.apply {
                btnPlus.setOnClickListener {
                    sum(numbers())
                    tvResult.text = "Result : $result"
                }
                btnMinus.setOnClickListener {
                    minus(numbers())
                    tvResult.text = "Result : $result"
                }
                btnMultiple.setOnClickListener {
                    multiple(numbers())
                    tvResult.text = "Result : $result"
                }
                btnDivide.setOnClickListener {
                    division(numbers())
                    tvResult.text = "Result : $result"
                }
            }
        }
    }

    private fun numbers(): com.frogobox.viewmodel.model.Number {
        val x = if (binding?.numberX?.text.toString() != "") {
            binding?.numberX?.text.toString().toInt()
        } else {
            0
        }
        val y = if (binding?.numberY?.text.toString() != "") {
            binding?.numberY?.text.toString().toInt()
        } else {
            0
        }
        return com.frogobox.viewmodel.model.Number(x, y)
    }

    private fun setupViewModel() {
        viewModel = mActivity.obtainViewModel()
    }

}