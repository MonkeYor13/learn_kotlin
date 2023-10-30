package com.example.learnkotlin.Basic

//ArrayOf para CREAR una lista de datos y para acceder a cada elemento del array

fun main(){
    val myWeek = arrayOf("monday", "tuesday", "wednesday")
    myWeek[1]= "sunday" //cambiar el valor de un elemento dentro de array


    println(myWeek[1])
    println(myWeek.size) //para saber el tamaño del array


    //BUCLES PARA ARRAYS PARA MODIFICAR Y RECORRER UN ARRAY

    //FOR
    //aqui le decimos recorre cada posiscion (position), de cada indice(indices) dentro del array (myweek)
    for (position in myWeek.indices){
        println("he pasado por cada posicion")
        println(myWeek[position])
    }

    for (myWeeks in myWeek){
        println("hoy es $myWeeks")
    }

}



