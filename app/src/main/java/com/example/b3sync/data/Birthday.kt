package com.example.b3sync.data
class Birthday{

}
fun main(){
    val age: Int=5
    val layers: Int=3
    val design: String="="
    println("You are $age years old")
    PrintCandles(age)
    PrintCakeTop(age,design)
    PrintCakeBase(age,layers)
    PrintCakeTop(age,design)
}
fun PrintCakeBase(age: Int, layers: Int) {
    repeat(layers){
        repeat(age+2){
            print("@")
        }
        println()
    }
}

fun PrintCakeTop(age: Int,design: String) {
    repeat(age+2){
        print(design)
    }
    println()
}

fun PrintCandles(age: Int) {
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}


