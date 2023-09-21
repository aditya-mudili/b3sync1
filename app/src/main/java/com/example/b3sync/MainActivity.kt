package com.example.b3sync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.b3sync.data.Dice
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener {
            diceRoll()
            rollButton.text="rolled"
            Snackbar.make(rollButton,"Dice Rolled!",Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun diceRoll() {
        val dice = Dice(6)
        val Droll: ImageView = findViewById(R.id.imageDice)
        val diceRoll = dice.roll(6)
        val resultTextView: TextView = findViewById(R.id.txtRoll)
        resultTextView.text = diceRoll.toString()
        val drawableResource = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        Droll.setImageResource(drawableResource)

    }
}
