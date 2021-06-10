package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
//        throw NotImplementedError("Not implemented")
        val chartUpB = b.toCharArray().toMutableList()
        val chartUpA = a.toUpperCase().toCharArray().toMutableList()
        val result = StringBuffer()

//        for (value in a.toCharArray()) {
//            if(chartUpB.contains(value.toUpperCase())) {
//                result.append(value.toUpperCase())
//            }
//        }

        for (valueA in chartUpA) {
            if (chartUpB.contains(valueA)) {
                result.append(valueA)
                chartUpB.remove(valueA);
            }
        }
        println(result.toString())
        return if (b == result.toString()) {
            "YES"
        } else "NO"
    }
}
