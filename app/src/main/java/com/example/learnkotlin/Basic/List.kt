package com.example.learnkotlin.Basic

//las lista puede contener una lista de calquier cosa, por eso es recomendable indicarle el tipo de lista
//Las list puden ser mutable o inmutable

fun main(){
    //listInMutable()
    listMutable()
}

fun listInMutable(){
    val myList = listOf<String>("monday", "tuesday", "wednesday", "thursday", "friday")

    println(myList.size)
    println(myList)
    println(myList[2]) //accesder a una position especifica
    println(myList.last()) //acceder a la ultima position
    println(myList.first()) //acceder a la primera position

    //filtra mi list por cada intaracion (it) que ocntenga la letra W
    println(myList.filter { it.contains("w") })

    //puedo recorrer una lista ocn el forEach.
    myList.forEach { println(it) }
    myList.forEach { day -> println(day) } //it lo podemos cambiar por la palabra que quieramos como se muestra
}

//la listas mutables se les puede agregar valores y inidcarle en que posiscion queremos que esten
fun listMutable(){
    val myList = mutableListOf("monday", "tuesday", "wednesday", "thursday", "friday")
    //myList.add("yorvis") //agregamos el elemento por default va al ultimo puesto
    myList.add(0, "yorvis") //ageganado la posicion podemos indicarle donde lo queremos
    println(myList)
}