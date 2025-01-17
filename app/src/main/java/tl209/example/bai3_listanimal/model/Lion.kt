package tl209.example.bai3_listanimal.model

import tl209.example.bai3_listanimal.R

class Lion(name: String, color: String): Animal(name, "Lion", color) {
    override fun getIcon(): Int {
        return R.drawable.ic_lion
    }
}