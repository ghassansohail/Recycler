package com.ghassan.recycler;

public class Friends {
    private int id, imageId, dob;
    private String name, city;

    public Friends(int id, int imageId, int dob, String name, String city) {
        this.id = id;
        this.imageId = imageId;
        this.dob = dob;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public int getImageId() {
        return imageId;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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
