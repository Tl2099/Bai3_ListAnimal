package tl209.example.bai3_listanimal.model

import tl209.example.bai3_listanimal.R

class Turtle(name:String, color: String): Animal(name, "Turtle", color) {
    override fun getIcon(): Int {
        return R.drawable.ic_turtle
    }
}