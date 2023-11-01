package com.example.simpletextsaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpletextsaver.databinding.ActivitySplashBinding
import com.example.simpletextsaver.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    lateinit var binding :ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}