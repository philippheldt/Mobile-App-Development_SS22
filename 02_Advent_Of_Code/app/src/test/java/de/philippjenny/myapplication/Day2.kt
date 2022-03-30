package de.philippjenny.myapplication

import org.junit.Test
import java.io.File

class Day2 {
    @Test

    fun my_solution() {
        var i = 1
        var depth = 0
        var moved = 0
        val input: List<String> = File("src/test/Day2input").readLines()
        for (line in input) {
            val zeile = line.split(" ")
            val movedKeyword = zeile[0]
            val speed = zeile[1].toInt()

            //Konsolenausgabe zur Kontrolle
            println("$i.")
            println("Richtung: $movedKeyword")
            println("Geschwindigkeit: $speed")

            //Verschiedene cases überprüfen und dementsprechend der richtigen Richtung den Wert speed zuweisen
            when(movedKeyword){
                "forward" -> moved += speed
                "up" -> depth -= speed
                "down" -> depth += speed
            }

            println("horizontal: $moved")
            println("depth: $depth")
            println(" ")
            i++
        }
    }


}