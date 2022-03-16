package com.example.androidarchitecturepatterns.pojo;

public class MovieModel {
    String name;
    String data;
    String description;
    int id;

    public MovieModel(String name, String data, String description, int id) {
        this.name = name;
        this.data = data;
        this.description = description;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
