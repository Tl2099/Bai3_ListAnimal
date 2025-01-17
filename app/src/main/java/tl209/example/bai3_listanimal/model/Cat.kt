package tl209.example.bai3_listanimal.model

import tl209.example.bai3_listanimal.R

class Cat(
    name: String,
    color: String
): Animal(name, "Cat", color){
    override fun getIcon(): Int {
        return R.drawable.ic_cat
    }
}