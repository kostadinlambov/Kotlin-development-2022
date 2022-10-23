package part_04_Variables_And_Strings

import java.util.*

fun main(args: Array<String>){
    val myPet = "Crocodile"
    println(myPet.length)
    println(myPet.replaceFirstChar {
        if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
        else it.toString()
    })

    println(myPet.decapitalize())

    // Trim
    val myText = "   here are    to many spaces   "
    println(myText.trim())

    println(myPet.get(3))
    println(myPet[3])
    println(myPet.substring(3))
    println(myPet.substring(3, 6))

}