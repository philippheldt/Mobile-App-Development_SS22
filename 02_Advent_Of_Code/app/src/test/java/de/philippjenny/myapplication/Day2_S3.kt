package de.philippjenny.myapplication

import org.junit.Test
import java.io.File

class Day2_S3 {
    @Test
    fun solution_2() {
        var i = 1
        val input: List<String> = File("src/test/Day2input").readLines()
        val commands = input.map { line ->
            val zeile: List<String> = line.split(" ")
            Command(zeile[0], zeile[1].toInt())
        }
        //bis hier wurde eine liste an klassen erstellt, wo Name und Geschwindigkeit abgespeichert sind

        var position = Position(0, 0)
        commands.forEach{ command ->
            when(command.movedKeyword){
                "forward" -> position = position.copy(moved = position.moved + command.speed)
                "up" -> position = position.copy(depth = position.depth - command.speed)
                "down" -> position = position.copy(depth = position.depth + command.speed)
            }
        }
        //hier wird aus jeder dieser klassen aus der liste die bewegungsanweisung herausgelesen

    }
    private class Command(val movedKeyword:String, val speed: Int)
    private data class Position(val moved:Int, val depth: Int)
}