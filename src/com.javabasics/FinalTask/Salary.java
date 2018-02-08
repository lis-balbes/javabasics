package com.javabasics.FinalTask;

public class Salary implements Sendable<Integer> {

    private String from;
    private String to;
    private Integer salary;

    public Salary(String company, String person, Integer salary) {
        this.from = company;
        this.to = person;
        this.salary = salary;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public Integer getContent() {
        return this.salary;
    }
}
