package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.math.abs
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
//        throw NotImplementedError("Not implemented")

//        if(blockB.java == String::class)
        return when(blockB) {

            String::class -> getStringResult(blockA)

            Int::class -> getIntResult(blockA)

            LocalDate::class -> getDateResult(blockA)

            else -> Any::class
        }

    }

    private fun getDateResult(blockA: Array<*>): String {
        val nowDate = LocalDate.now()
        var resultDate : LocalDate? = null
        var bufferDate : LocalDate
        for (element in blockA) {
            if(element is LocalDate){
                bufferDate = element
                if(resultDate == null ||
                    abs(bufferDate.toEpochDay() - nowDate.toEpochDay()) < abs(resultDate.toEpochDay() - nowDate.toEpochDay())){
                    resultDate = bufferDate
                }
            }
        }
//        print(resultDate!!.format(DateTimeFormatter.ofPattern("dd.mm.yyyy")))
        return resultDate!!.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    }

    private fun getIntResult(blockA: Array<*>): Int {
        var result = 0
        for (element in blockA) {
            if(element is Int) result += element
        }
        return result
    }

    private fun getStringResult(blockA: Array<*>): String {
        val result = StringBuffer()
        for (element in blockA) {
            if(element is String) result.append(element)
        }
        return result.toString()
    }
}
