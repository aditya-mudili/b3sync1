package com.example.b3sync

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        val diceRoll = dice.roll(6)
        val resultTextView: TextView = findViewById(R.id.txtRoll)
        resultTextView.text = diceRoll.toString()

    }
}
