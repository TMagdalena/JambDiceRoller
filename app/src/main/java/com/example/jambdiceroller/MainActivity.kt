package com.example.jambdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    var dice = Dice()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfDice = listOf(first_dice, second_dice, third_dice, fourth_dice, fifth_dice, sixth_dice)
        roll_dice_button.setOnClickListener{ dice.rollDice(listOfDice) }


    }


}

