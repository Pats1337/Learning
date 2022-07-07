package HomeworkForLesson4


fun main(args: Array<String>) {
    println(firstLast6(arrayOf(1, 2, 6, 4, 5)))
    println(firstLast6(arrayOf(6, 2, 3, 4, 5)))
    println(firstLast6(arrayOf(6)))
    println(firstLast6(arrayOf(6, 6, 6)))
    println(firstLast6(arrayOf(1, 2, 6)))
    println(firstLast6(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
    println("--------------")
    println(sameFirstLast(arrayOf(1, 2, 1)))
    println(sameFirstLast(arrayOf(1)))
    println(sameFirstLast(arrayOf(3, 2, 1)))
    println(sameFirstLast(arrayOf(2, 4, 7, 8, 3, 5, 7, 5, 8, 2)))
    println("--------------")
    println(makePi().contentToString())
    println("--------------")
    println(doubleSameFirstLast(arrayOf(1, 2, 1), arrayOf(1, 2, 3, 4, 5)))
    println(doubleSameFirstLast(arrayOf(1), arrayOf(1, 2, 3, 4, 5)))
    println(doubleSameFirstLast(arrayOf(1, 2, 5), arrayOf(1, 2, 3, 4, 5)))
    println(doubleSameFirstLast(arrayOf(3, 3, 3, 3, 3, 5), arrayOf(1, 2, 3, 4, 5)))
    println("--------------")
    println(arrayOf(1, 2, 3, 4).sum())
    println(arrayOf(1).sum())
    println(arrayOf(-1, 9, 2, 4, 123).sum())

}


fun doubleSameFirstLast(num1: Array<Int>, num2: Array<Int>): Boolean {
    return (num1.size > 1 &&
            num2.size > 1 &&
            (num1[0] == num2[0] ||
                    num1[num1.size - 1] == num2[num2.size - 1])
            )
}

fun makePi(): Array<Int> {
    return arrayOf(3, 1, 4)
}

fun sameFirstLast(numbers: Array<Int>): Boolean {
    return (numbers.size > 1 && numbers[0] == numbers[numbers.size - 1])
}

fun firstLast6(numbers: Array<Int>): Boolean {
    return (numbers[0] == 6 || numbers[numbers.size - 1] == 6)
}

