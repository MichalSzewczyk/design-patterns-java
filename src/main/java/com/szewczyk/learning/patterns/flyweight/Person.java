package com.szewczyk.learning.patterns.flyweight;

public final class Person {
    private final String name;
    private final String lastName;

    public Person(String name, String lastName) {
        /*
         * Application of flyweight design pattern by reusing Strings from String pool instead of creating new ones
         */
        this.name = name.intern();
        this.lastName = lastName.intern();
    }

    public final String getName() {
        return name;
    }

    public final String getLastName() {
        return lastName;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
    }

    @Override
    public final int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
