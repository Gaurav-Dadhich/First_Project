package com.example.first_project.Kotexa

fun main(){

    var someLem : (Int, Int) -> Int = {a,b-> a+b}
    println(someLem(5,3))

    var other : (Int, Int, Float) -> Float = { a, b, msg -> msg+(a*b)}
    println(other(5,3, 3.5F))

}