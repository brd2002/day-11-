package com.example.day11

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        val name = binding.getName
//        val number = binding.getPhonenumber
//        binding.goToNext.setOnClickListener {
//            val intent = Intent(this , MainActivity2::class.java)
//            intent.putExtra("name" , name.text.toString())
//            intent.putExtra("number" , number.text.toString())
//            startActivity(intent)
//        }

        binding.CallButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + binding.getPhonenumber.text.toString()))
            startActivity(intent)
        }
        binding.GoToWeb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            startActivity(intent)
        }

    }
}