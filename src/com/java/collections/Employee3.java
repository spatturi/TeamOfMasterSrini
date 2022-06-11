package com.java.collections;

public class Employee3 {
    private String name;
    private String surname;
    private String designation;

    public Employee3(String name, String surname, String designation) {
        this.name = name;
        this.surname = surname;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return name+","+surname+","+designation;
    }
}
