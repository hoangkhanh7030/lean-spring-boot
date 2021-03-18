package com.example.test.entity;

public class Persion {
    private String id;
    private String name;
    private int point;
    public Persion(){

    }

    public Persion(String id, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", point=" + point +
                '}';
    }
}
