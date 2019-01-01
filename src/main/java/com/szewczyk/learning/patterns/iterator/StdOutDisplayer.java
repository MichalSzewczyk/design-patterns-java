package com.szewczyk.learning.patterns.iterator;

public final class StdOutDisplayer {
    public final <T> void display(Iterator<T> iterator) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Iterator content: ");
        while (iterator.hasNext()) {
            stringBuilder.append("<").append(iterator.next()).append(">");
            if (iterator.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
