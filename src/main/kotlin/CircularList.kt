class CircularList<T>(private vararg val elements: T) {
    var i = -1
    init {
        if(elements.isEmpty()) throw Exception()
    }

    fun next(): T {
        i = (i + 1) % elements.count()
        return elements[i]
    }

    fun prev(): T {
        i -= 1
        if (i < 0) i = elements.count() -1
        return elements[i]
    }
}
