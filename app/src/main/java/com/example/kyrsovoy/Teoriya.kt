package com.example.kyrsovoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.kyrsovoy.databinding.ActivityMainMenuBinding
import com.example.kyrsovoy.databinding.ActivityTeoriyaBinding

class Teoriya : AppCompatActivity() {

    private lateinit var binding : ActivityTeoriyaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTeoriyaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var arguments = getIntent().getExtras()
        var name = arguments?.getInt("amogus123").toString()
        Log.d("f1",name);
        var a = name.toInt()
        loadFun(a)

        binding.Tema.setOnClickListener {
            val intent = Intent(this@Teoriya, Basics_syntax::class.java)
            startActivity(intent)
        }

        binding.next.setOnClickListener{
            when(a){
                1 ->{
                    binding.textView.setText(R.string.teoriya2)
                    binding.image1.visibility = View.INVISIBLE
                    binding.image2.visibility = View.VISIBLE
                    a = 2
                }
                2 ->{binding.textView.setText(R.string.teoriya3)
                    binding.image2.visibility = View.INVISIBLE
                    binding.image3.visibility = View.VISIBLE
                    a = 3
                }
                3 ->{binding.textView.setText(R.string.teoriya4)
                    binding.image3.visibility = View.INVISIBLE
                    binding.image4.visibility = View.VISIBLE
                    a = 4
                }
                4 ->{binding.textView.setText(R.string.teoriya5)
                    binding.image4.visibility = View.INVISIBLE
                    binding.image5.visibility = View.VISIBLE
                    a = 5
                }
                5 ->{binding.textView.setText(R.string.teoriya6)
                    binding.image5.visibility = View.INVISIBLE
                    binding.image6.visibility = View.VISIBLE
                    a = 6
                }
                6 ->{binding.textView.setText(R.string.teoriya7)
                    binding.image6.visibility = View.INVISIBLE
                    binding.image7.visibility = View.VISIBLE
                    a = 7
                }
                7 ->{binding.textView.setText(R.string.teoriya8)
                    binding.image7.visibility = View.INVISIBLE
                    binding.image8.visibility = View.VISIBLE
                    a = 8
                }
            }
        }
        binding.back.setOnClickListener{
            when(a){
                2 ->{binding.textView.setText(R.string.teoriya1)
                    binding.image1.visibility = View.VISIBLE
                    binding.image2.visibility = View.INVISIBLE
                    a--
                }
                3 ->{binding.textView.setText(R.string.teoriya2)
                    binding.image2.visibility = View.VISIBLE
                    binding.image3.visibility = View.INVISIBLE
                    a--
                }
                4 ->{binding.textView.setText(R.string.teoriya3)
                    binding.image3.visibility = View.VISIBLE
                    binding.image4.visibility = View.INVISIBLE
                    a--
                }
                5 ->{binding.textView.setText(R.string.teoriya4)
                    binding.image4.visibility = View.VISIBLE
                    binding.image5.visibility = View.INVISIBLE
                    a--
                }
                6 ->{binding.textView.setText(R.string.teoriya5)
                    binding.image5.visibility = View.VISIBLE
                    binding.image6.visibility = View.INVISIBLE
                    a--
                }
                7 ->{binding.textView.setText(R.string.teoriya6)
                    binding.image6.visibility = View.VISIBLE
                    binding.image7.visibility = View.INVISIBLE
                    a--
                }
                8 ->{binding.textView.setText(R.string.teoriya7)
                    binding.image7.visibility = View.VISIBLE
                    binding.image8.visibility = View.INVISIBLE
                    a--
                }
            }
        }


    }

    fun loadFun (a: Int){
        when(a){
            1 ->{
                binding.textView.setText(R.string.teoriya1)
                binding.image1.visibility = View.VISIBLE
            }
            2 ->{binding.textView.setText(R.string.teoriya2)
                binding.image2.visibility = View.VISIBLE
            }
            3 ->{binding.textView.setText(R.string.teoriya3)
                binding.image3.visibility = View.VISIBLE
            }
            4 ->{binding.textView.setText(R.string.teoriya4)
                binding.image4.visibility = View.VISIBLE
            }
            5 ->{binding.textView.setText(R.string.teoriya5)
                binding.image5.visibility = View.VISIBLE
            }
            6 ->{binding.textView.setText(R.string.teoriya6)
                binding.image6.visibility = View.VISIBLE
            }
            7 ->{binding.textView.setText(R.string.teoriya7)
                binding.image7.visibility = View.VISIBLE
            }
        }
    }
}