package com.timeselectrical.model;

public class Student {
    private Integer id;

    private Integer age;

    private String name;

    private String scoreSum;

    private String scoreAvg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(String scoreSum) {
        this.scoreSum = scoreSum == null ? null : scoreSum.trim();
    }

    public String getScoreAvg() {
        return scoreAvg;
    }

    public void setScoreAvg(String scoreAvg) {
        this.scoreAvg = scoreAvg == null ? null : scoreAvg.trim();
    }
}