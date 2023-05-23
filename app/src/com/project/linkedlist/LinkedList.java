package com.project.linkedlist;

public interface LinkedList<T> {
    public void add(T value);
    public void remove(int indx);
    public T get(int indx) throws Exception;
}
