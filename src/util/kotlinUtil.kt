package util

import sun.reflect.generics.reflectiveObjects.NotImplementedException

@Suppress("UNUSED_PARAMETER")
fun TODO(
        task: String,
        documentation: Unit = Unit,
        references: Function<Any?> = {}
): Nothing = throw NotImplementedException(task)

class NotImplementedException(message: String) : Exception(message)