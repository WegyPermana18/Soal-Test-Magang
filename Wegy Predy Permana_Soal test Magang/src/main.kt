package com.wegy.tes

import java.lang.Exception



fun main(){
    print("""
        Select Questions : 
    """.trimIndent())
    val input = readLine()
    println("")

    when (input) {
        "1" -> HelloWorld()
        "2" -> Email()
        "4" -> ReverseWord()
        "5" -> CheckRev()
    }

}

//nomor 5
fun CheckRev() {
    print("insert Words : ")
    val input = readLine()
    if (input != null) {
        val rev = input.reversed()
        if (input.equals(rev)) print("Palindrom")
        else print("Bukan palindrom")
    }
}

//nomor 4
fun ReverseWord() {
    print("input words : ")
    val input = readLine()
    if (input != null) {
        println(input.reversed())
    }
}
// nomor 2
fun Email() {
    print("input email : ")
    val input = readLine()
    if (input != null) {
        if (input.length > 20) {
            print("melebihi batas character")
        }
        else if (!input.contains("@")) {
            print("email harus ada '@'")
        }
        else if (!input.contains(".")) {
            print("email harus pakai titik setelah @")
        }
        else if (!input.contains(".co.id") || !input.contains(".id")) {
            println("Hanya bisa pake domain id atau co.id")
        }
        else {
            println("email yang diinputkan : $input")
        }

    }
}
// nomor 1
fun HelloWorld() {
    print("input number : ")
    val input = readLine()
    try {
        val res = input?.toInt()
        if (res != null) {
            if (res.rem(5) ==0 && res.rem(3) == 0) {
                println("Hello World")
            }
            else if (res.rem(3) == 0) {
                println("Hello")
            }
            else if (res.rem(5) == 0) {
                println("World")
            }
        }

    }
    catch (e : Exception) {
        print("Not Number!")
    }
}