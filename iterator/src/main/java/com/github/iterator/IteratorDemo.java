package com.github.iterator;

/**
 * Created by zhiyong.bao on 2017/6/23.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        for (NameRepository.NameIterator iterator = repository.getIterator(); iterator.hasNext(); iterator.next()) {
            String next = (String) iterator.next();
            System.out.println("String: " + next);
        }
    }
}
