package iii_conventions

import util.TODO

class Invokable {
    public var numberOfInvocations: Int = 0
        private set
    operator public fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

//fun invokeFour(invokable: Invokable) = invokable()()

    fun todoTask31(): Nothing = TODO(
            """
        Task 31.
        Change the class 'Invokable' to count the number of invocations:
        for 'invokable()()()()' it should be 4.
    """,
            references = { invokable: Invokable -> })
    fun task31(invokable: Invokable): Int {
      todoTask31()
   // return (invokable: Invokable) = invokable()()()()
            //.getNumberOfInvocations()
    }

