package com.szewczyk.learning.patterns.iterator;

import java.util.Collection;

public final class CollectionIterator<T> implements Iterator<T> {
    private final java.util.Iterator<T> iterator;

    public CollectionIterator(Collection<T> collection) {
        this.iterator = collection.iterator();
    }

    @Override
    public final T next() {
        return this.iterator.next();
    }

    @Override
    public final boolean hasNext() {
        return this.hasNext();
    }
}
