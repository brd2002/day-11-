package com.example.day11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.day11.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding:ActivityMain2Binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intent = intent
        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")
//        binding.
        Log.d("name", "onCreate: ${name}")

    }
}