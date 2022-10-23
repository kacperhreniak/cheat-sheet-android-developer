fun main() {
  val text = "mississippi"
  val pattern = "issip"
   
  val result = kmpAlgorithm(text, pattern)
  println("First index of patter in text is $result")
}


// KMP algorithm
private fun kmpAlgorithm(text: String, pattern: String): Int {
    var i = 0
    var j = 0
    val lpsArray = createLPSArray(pattern)
    
    while (i < text.length) {
        if (text[i] == pattern[j]) {
            i++; j++
        } else if (j == 0) {
            i++
        } else {
            j = lpsArray[j - 1]
        }

        if(j == pattern.length) {
             return i - pattern.length
        }
    }
    return -1
}

// method to create longest prefix suffix array
private fun createLPSArray(needle: String): IntArray {
    val lps = IntArray(needle.length) { 0 }
    var prevLPS = 0
    var index = 1

    while (index < needle.length) {
        if (needle[index] == needle[prevLPS]) {
            lps[index] = ++prevLPS
            index++
        } else if (prevLPS == 0) {
            lps[index] = 0
            index++
        } else {
            prevLPS = lps[prevLPS - 1]
        }
    }
    return lps
}
