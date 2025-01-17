package tl209.example.bai3_listanimal.model

open class Animal(
    var species: String,
    var name: String,
    var furColor: String
){
    open fun getIcon(): Int{
        return 0
    }
}