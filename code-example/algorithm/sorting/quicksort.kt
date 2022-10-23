fun main(args: Array<String>) {
    val input = intArrayOf(10, 50, 40, 60, 100, 30)
    quickSort(input, 0, input.size - 1)
    input.forEach { print(it) }
}

private fun quickSort(input: IntArray, startIndex: Int, endIndex: Int) {
    fun partition(input: IntArray, startIndex: Int, endIndex: Int): Int {
        val pivotIndex = startIndex + (endIndex - startIndex) / 2
        val pivotValue = input[pivotIndex]

        var left = startIndex
        var right = endIndex

        while (pivotIndex in (left + 1) until right) {
            while (input[left] < pivotValue) left++
            while (input[right] > pivotValue) right--
            if (left <= right) {
                val temp = input[right]
                input[right] = input[left]
                input[left] = temp
            }
        }

        return pivotIndex
    }

    if (startIndex >= endIndex) return
  
    val pivot = partition(input, startIndex, endIndex)
    quickSort(input, startIndex, pivot - 1)
    quickSort(input, pivot + 1, endIndex)
}
