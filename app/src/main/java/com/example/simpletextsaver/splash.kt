package com.example.simpletextsaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simpletextsaver.databinding.ActivityMainBinding

class splash : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}