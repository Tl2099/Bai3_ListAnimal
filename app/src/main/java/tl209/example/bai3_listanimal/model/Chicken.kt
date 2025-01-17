package tl209.example.bai3_listanimal.model

import tl209.example.bai3_listanimal.R

class Chicken(name: String, color: String):Animal(name, "Chicken", color) {
    override fun getIcon(): Int {
        return R.drawable.ic_chicken
    }
}