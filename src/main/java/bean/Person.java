package bean;

import java.io.Serializable;

public abstract class Person implements Serializable {

    private String name;
    private String surname;
    private int age;

    Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return name + " " + surname;
    }
    
}
