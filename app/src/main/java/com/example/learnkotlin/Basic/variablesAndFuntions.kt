package com.example.learnkotlin.Basic

/* NOTAS

Tipos de variables
Valor(val) no se puede renombrar, parecido a una const
Variables(var) se puede renombrar
Variables globales esta fuera de la funcin main y podemos acceder a ella desde cualquier funcion.

Se imprime con Print() y tambien podemos usar PrintLn() esto nos imprime le resultado
pero no agrega un salto de linea.
*/

val globalExample:String = "its a global variable"

fun main(){

    variablesNumericas()
    variablesAlfanumericas()
    variablesBooleanas()
    funcionesArismeticas()
    mostrarName("yorvis")
    add(10, 15.5f)
    val restaresul = restar(5, 6.25f)
    println(restaresul)
    //accesdiendo a una variable global desde la funcion main
   // println(globalExample)

}

//FUNCIONES
/*
Las funciones son cajas donde podemos guardar codigo para luego ser reitilizadas
*/

fun variablesNumericas() {

    //Int solo recibe hasta 6 cifras decimales -2,147,483,647 to 2,147,483,647
    val valorExample:Int = 30
    var variableExample:Int = 30
    variableExample = 29

    //Long -9,233, 372,023,854,775,807 to 9,233, 372,023,854,775,807
    val example2:Long = 30

    //Float soportan hasta 6 decimales y agragar la letra f
    val floatExample:Float = 1444444.5f
    val floatExample2:Float = 30.5f

    //Double soportan hasta 14 decimales y no es necesario la letra f
    val doubleExampe:Double= 34555555555555.45
}

fun variablesAlfanumericas(){

    //Char solo recibe una caracter y cualquier cosa pero usuando comillas simple.
    val charEexample:Char = 'e'
    val charEexample2:Char = '2'
    val charEexample3:Char = '@'

    //String recibe mas de un caracter y entre comillas dobles.
    //podemos concatenar variales dentro de una cadena de texto solo anteponiendo el $
    val stringExample:String = "im yorvis"
    println("Hello... $stringExample y tengo $charEexample2 años")
}

fun variablesBooleanas(){

    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
}

fun funcionesArismeticas(){
    val aris1 = 5
    val aris2 = 6.5

    // + - * / %  podemos sumar int con float, int con int, float con float, etc.
    println(aris1 + aris2)

    //sumar un int con un float, el resultado sera float
    //podemos indicar que tipo de resultado queremos recibir, guardonado el mismo en una variable.
    //para indicar el tipo de resutlado usamos .toInt(), .toFloat(), etc
    val sumaFloatInt = aris1 + aris2.toInt()
    println(sumaFloatInt)
}

fun mostrarName(name:String){
    println("my name is $name")
}

fun add(num1:Int, num2:Float){
    println(num1 + num2)
}

fun restar(resta1:Int, resta2:Float):Float{
    return resta1 - resta2
}