package tl209.example.bai3_listanimal.model

import tl209.example.bai3_listanimal.R

class Dog (name: String, color: String): Animal(name, "Dog", color){
    override fun getIcon(): Int {
        return R.drawable.ic_dog
    }
}