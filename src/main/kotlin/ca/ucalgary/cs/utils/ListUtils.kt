package ca.ucalgary.cs.utils

fun <E> areListsEqual(first: List<E>?, second: List<E>?): Boolean {
    if (first == null || second == null)
        return false

    return first.size == second.size && first.containsAll(second) && second.containsAll(first)
}

fun <E> areListsSubset(first: List<E>, second: List<E>): Boolean {
    return first.all { it in second } || second.all { it in first }
}