package de.philippjenny.myapplication

import org.junit.Test

class Day1 {
    @Test
    fun solution_1() {
        val input: List<String> = File("src/test/Day1input.txt").readLines()
        val intInput = mutableListOf<Int>()
        for (line in input) {
            intInput.add(line.toInt())
        }
    }
}