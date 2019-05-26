package com.example.jambdiceroller

import android.widget.ImageView
import kotlin.random.Random


class Dice {

    fun rollDice(diceImg: List<ImageView>) {
        for(i in diceImg) {
            when (Random.nextInt(1, 7)) {
                1 -> i.setImageResource(R.drawable.dice_one)
                2 -> i.setImageResource(R.drawable.dice_two)
                3 -> i.setImageResource(R.drawable.dice_three)
                4 -> i.setImageResource(R.drawable.dice_four)
                5 -> i.setImageResource(R.drawable.dice_five)
                6 -> i.setImageResource(R.drawable.dice_six)
            }
        }
    }

}