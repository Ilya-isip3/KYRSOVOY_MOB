package com.example.kyrsovoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kyrsovoy.databinding.ActivityBasicsSyntaxBinding
import com.example.kyrsovoy.databinding.ActivityMainMenuBinding

class Basics_syntax : AppCompatActivity() {

    private lateinit var binding : ActivityBasicsSyntaxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicsSyntaxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.VaDT.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("amogus123", 1)
            startActivity(intent)
        }

        binding.IOD.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("amogus123", 2)
            startActivity(intent)
        }
        binding.OaV.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("amogus123", 3)
            startActivity(intent)
        }

        binding.IfSwitch.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("amogus123", 4)
            startActivity(intent)
        }
        binding.For.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("amogus123", 5)
            startActivity(intent)
        }
        binding.Mass.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("amogus123", 6)
            startActivity(intent)
        }
        binding.IaAC.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("amogus123", 7)
            startActivity(intent)
        }
    }
}