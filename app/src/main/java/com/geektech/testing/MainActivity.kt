package com.geektech.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.testing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initeClickers()
    }

    private fun initeClickers() {
        with(binding){
            btnCalculate.setOnClickListener {
                tvResult.text = Math().add(etFirstNum.text.toString(), etSecondNum.text.toString())
            }
            btnCalculate.setOnClickListener {
                tvResult.text = Math().divide(etFirstNum.text.toString(), etSecondNum.text.toString())
            }
        }
    }
}