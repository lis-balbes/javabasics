package com.javabasics.genericsDemo;

import java.util.Objects;

public class Pair<T, K> {
    
    private final T firstValue;
    private final K secondValue;

    //Конструктор
    private Pair(T firstValue, K secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    //Методы getFirst и getSecond
    public T getFirst() {
        return firstValue;
    }

    public K getSecond() {
        return secondValue;
    }

    //Фабричный метод of
    public static <T, K> Pair<T, K> of(T firstValue, K secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (firstValue != null ? !firstValue.equals(pair.firstValue) : pair.firstValue != null) return false;
        return secondValue != null ? secondValue.equals(pair.secondValue) : pair.secondValue == null;
    }

    @Override
    public int hashCode() {
        int result = firstValue != null ? firstValue.hashCode() : 0;
        result = 31 * result + (secondValue != null ? secondValue.hashCode() : 0);
        return result;
    }
}
