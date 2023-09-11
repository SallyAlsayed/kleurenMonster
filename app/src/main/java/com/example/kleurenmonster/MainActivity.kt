package com.example.kleurenmonster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnEmotion:Button= findViewById(R.id.buttonEmotion);
        btnEmotion.setOnClickListener(){
            runEmotion();
        }

    }

    fun runEmotion(){
        var num= (1..7).random()
        var ivEmotion: ImageView= findViewById(R.id.imageViewEmotion);
        var tVEmotion: TextView= findViewById(R.id.textViewEmotion);
        var btnEmotion:Button= findViewById(R.id.buttonEmotion); 

        when(num){
            1-> {
                ivEmotion.setImageResource(R.drawable.cm_01)
                tVEmotion.text= "Im Calm:-)";
                btnEmotion.setBackgroundcolor(color.parsecolor)
            }
            2-> {
                ivEmotion.setImageResource(R.drawable.cm_02)
                tVEmotion.text= "Im Happy";
            }
            3-> {
                ivEmotion.setImageResource(R.drawable.cm_03)
                tVEmotion.text= "Im Angry";
            }
            4-> {
                ivEmotion.setImageResource(R.drawable.cm_04)
                tVEmotion.text= "Im Sad";
            }
            5-> {
                ivEmotion.setImageResource(R.drawable.cm_05)
                tVEmotion.text= "Im afraid";
            }
            6-> {
                ivEmotion.setImageResource(R.drawable.cm_06)
                tVEmotion.text= "Im in Love";
            }
            else -> {
                ivEmotion.setImageResource(R.drawable.cm_07)
                tVEmotion.text= "I dont know how i feel";
            }
        }
   }
}
