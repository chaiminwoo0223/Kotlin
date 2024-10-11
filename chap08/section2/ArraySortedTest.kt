package chap08.section2

import java.util.Arrays

// 기본적인 정렬 방법
fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNums = arr.sortedArray() // 오름차순
    println("ASC: " + Arrays.toString(sortedNums))
    val sortedNumsDesc = arr.sortedArrayDescending() // 내림차순
    println("DESC: " + Arrays.toString(sortedNumsDesc))

    // 원본 배열에 대한 정렬
    println("ORI: " + Arrays.toString(arr))
    arr.sort(1, 3) // 오름차순
    println("ASC2: " + Arrays.toString(arr))
    arr.sortDescending() // 내림차순
    println("DESC: " + Arrays.toString(arr))

    // List로 반환
    val listSorted: List<Int> = arr.sorted() // 오름차순
    val listDesc: List<Int> = arr.sortedDescending() // 내림차순
    println("LST: " + listSorted)
    println("LST: " + listDesc)

    // SortBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf("Dog", "Cat", "Lion", "Kangaroo", "Po")
    println(Arrays.toString(items))
    items.sortBy { item -> item.length } // 오름차순
    println(Arrays.toString(items))
    items.sortByDescending { item -> item.length } // 내림차순
    println(Arrays.toString(items))
}
