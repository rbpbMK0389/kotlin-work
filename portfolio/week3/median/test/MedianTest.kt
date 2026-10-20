// COMP2850 Portfolio: Week 3
// Tests for median()

// work by Majeedah Khan

// 20/10/26

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "list of 1.0 = 1.0" {
        median(listOf(1.0f)) shouldBe (1.0f plusOrMinus tolerance)
    }

    "list of 1.0, 2.0 =  1.5" {
        median(listOf(1.0f, 2.0f)) shouldBe (1.5f plusOrMinus tolerance)
    }

    "list of 1.0, 2.0, 3.0 = 2.0" {
        median(listOf(1.0f, 2.0f, 3.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }

    "list of 1.0, 2.0, 3.0, 4.0 = 2.5" {
        median(listOf(1.0f, 2.0f, 3.0f, 4.0f)) shouldBe (2.5f plusOrMinus tolerance)
    } 


})
