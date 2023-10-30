package com.example.learnkotlin.Basic

fun main(){
    whenFuntion(4)
    getFuntion(6)
    println(returnFuntion(1))

    //EXERCISE
    val notfication1 = 50 //ejemplo: aqui seria la variable que recibimos desde la aplicacion
    println(getExercise(notfication1))
    println(getExercise(113))

    //EXERCISE 2 - PRICES MOVIE TICKETS
    val child = 5
    val adult = 28
    val senior = 83
    val isMonday = true

    println(getTickets(child, isMonday))
    println(getTickets(adult, isMonday))
    println(getTickets(senior, isMonday))


}

//la funcion recibe un parametro tipo int llamado (month) y se lo pasamos al when tambien.
fun whenFuntion(month:Int){
    when(month){
        1 -> print("january")
        2 -> print("february")
        3 -> print("march")
        4 -> {
            println("april")
            println("may")
        }
        else -> print("no es un mes")
    }
}


//podemos agregar parametros individuales o rangos "desde"  "hasta" (anteponiendo in y agreagando 2 puntos)
fun getFuntion(month2:Int){
    when(month2){
        1,2,4 -> println("they´re 1,2 and 4")
        in 5.. 8 -> println("range from 5 to 8")
        !in 9.. 12 -> println("range from 5 to 8") // al agregar ! siginfica si no estas entre el rango
        else -> println("no estoy entre ninguno")
    }

    /*When con return, aqui solo debemos indicar a la funcion que tipo de datos va a retonar (String)
    y luego agregar en cada linea la palabra return en cada liena o simpleficarlo ante poniendo return antes de WHEN,
    no es necesario la palabra print
     */
}

fun returnFuntion(month3:Int):String{
    return when(month3){
        1,2,4 -> "they´re 1,2 and 4"
        //1,2,4 -> return "they´re 1,2 and 4"
        in 5.. 8 -> "range from 5 to 8"
        !in 9.. 12 -> "range from 5 to 8"
        else -> "no estoy entre ninguno"
    }
}

//EXERCISE
fun getExercise(numberOfMessege:Int) {
    if (numberOfMessege > 99){
        println("you have most +99 notifications")
    } else {
        println("you have $numberOfMessege notifications")
    }

}

fun getTickets (age:Int, isMonday:Boolean):String{
    return when(age){
        in 5..12-> "the movie ticket for a child is USD 15"
        in 13..60-> if (isMonday){
            "the movie ticket for an Adult is USD 25"
        }else{
            "the movie ticket for an Adult is USD 30"
        }
        in 61..100 -> "the movie ticket for a senior is USD 20"
        else -> "Error in age"

    }
}