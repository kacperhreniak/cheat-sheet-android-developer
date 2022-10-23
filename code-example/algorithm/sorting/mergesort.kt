fun main(args: Array<String>) {
    val input = intArrayOf(10, 50, 40, 60, 100, 30)
    val result = mergeSort(input)
    result.forEach { print(it) }
}

private fun mergeSort(input: IntArray): IntArray {
    fun mergeArrays(first: IntArray, second: IntArray): IntArray {
        val newSize = first.size + second.size
        val result = IntArray(newSize)

        var firstIndex = 0
        var secondIndex = 0

        var firstValue: Int? = first[firstIndex]
        var secondValue: Int? = second[secondIndex]
        var index = 0
        while (firstIndex < first.size || secondIndex < second.size) {
            while (firstIndex < first.size && (secondValue == null || firstValue!! <= secondValue)) {
                result[index] = firstValue!!
                firstIndex++
                firstValue = first.getOrNull(firstIndex)
                index++
            }
            while (secondIndex < second.size && (firstValue == null || secondValue!! <= firstValue)) {
                result[index] = secondValue!!
                secondIndex++
                secondValue = second.getOrNull(secondIndex)
                index++
            }
        }
        return result
    }

    if (input.size == 1) return input
  
    val middle = input.size / 2
    val first = mergeSort(input.copyOfRange(0, middle))
    val second = mergeSort(input.copyOfRange(middle, input.size))

    return mergeArrays(first, second)
}
