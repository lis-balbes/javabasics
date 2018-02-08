package com.javabasics.FinalTask;

public interface Sendable<T> {

    String getTo();

    String getFrom();

    T getContent();
}
