package v_builders

import org.junit.Assert.fail
import org.junit.Test
import util.questions.Answer.b
import util.questions.Answer.c
import v_builders.builders.task40

class N40BuildersHowItWorksKtTest {
    @Test fun testBuildersQuiz() {
        val answers = task40()
        print("answers is: ${answers!!}")
        if (answers.values.toSet() == setOf(null)) {
            fail("Please specify your answers!")
        }
        val correctAnswers = mapOf(1 to c,2 to b, 3 to b, 4 to c)
        if (correctAnswers != answers) {
            val incorrect = (1..5).filter { answers[it] != correctAnswers[it] }
            print("incorrect is: $incorrect")
            fail("Your answers are incorrect! $incorrect")
        }
    }
}
