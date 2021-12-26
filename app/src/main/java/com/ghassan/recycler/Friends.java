package com.ghassan.recycler;

public class Friends {
    private int dob;
    private String name, city;

    public Friends( String name, String city,  int dob) {

        this.dob = dob;
        this.name = name;
        this.city = city;
    }



    public int getDob() {
        return dob;
    }

    
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }



    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
