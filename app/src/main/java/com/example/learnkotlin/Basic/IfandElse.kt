package com.example.learnkotlin.Basic

fun main(){
    ifBasic()
    ifAnidado()
    ifBoolean()
}

fun ifBasic(){
    val name = "Daniela"

    if (name == "Daniela"){
        println("Hi im $name")
    } else {
        println("any")
    }
}

fun ifAnidado(){
    val animal = "bird"

    if (animal== "dog"){
        println("its a dog")
    }else if (animal== "cat"){
        println("its a cat")
    }else if (animal== "bird"){
        println("its a bird")
    }else {
        println("it isnt any")
    }
}

fun ifBoolean(){
    //siempre la funtion es true por defult
    // con el signo ! invertimos el valor por defoult
    val soyHappy = true

    if (!soyHappy){
        println("im so happy")
    }else {
        println("im not happy")
    }
}
