package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String name, String location, int height) {
        setName(name);
        setLocation(location);
        setHeight(height);
    }

    public Mountain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return name;
    }
}