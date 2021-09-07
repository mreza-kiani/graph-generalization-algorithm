package ca.ucalgary.cs.utils

fun <E> areListsEqual(first: List<E>?, second: List<E>?): Boolean {
    if (first == null || second == null)
        return false

    return first.size == second.size && first.containsAll(second) && second.containsAll(first)
}