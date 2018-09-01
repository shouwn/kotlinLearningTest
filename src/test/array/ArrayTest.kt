package test.array

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class ArrayTest {

    @Test fun arrayOfTest() {
        val arr1 = arrayOf(1, 2, 3, 4)
        val arrS = arr1.joinToString("/")

        Assertions.assertEquals(arrS, "1/2/3/4")
    }
}