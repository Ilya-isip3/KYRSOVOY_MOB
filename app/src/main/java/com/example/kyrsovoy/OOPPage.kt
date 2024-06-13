package com.example.kyrsovoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kyrsovoy.databinding.ActivityMainMenuBinding
import com.example.kyrsovoy.databinding.ActivityOoppageBinding

class OOPPage : AppCompatActivity() {

    private lateinit var binding : ActivityOoppageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOoppageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Tema.setOnClickListener {
            val intent = Intent(this@OOPPage, main_menu::class.java)
            startActivity(intent)
        }
    }
}