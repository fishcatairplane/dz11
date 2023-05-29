package com.Person;

public class Woman extends Person {
    private final String girlishLastName;

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.girlishLastName = lastName;
    }

    public void registerPartnership(Man man) {
        super.registerPartnership(man);
        setLastName(man.getLastName());
    }

    public void deregisterPartnership(boolean shouldReturnGirlishName) {
        super.deregisterPartnership();
        if (shouldReturnGirlishName) {
            setLastName(this.girlishLastName);
        }
    }

    public boolean isRetired() {
        return super.isRetired(60);
    }

    public String getGirlishLastName() {
        return girlishLastName;
    }
}