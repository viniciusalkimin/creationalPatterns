package com.pluralsight.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) throws CloneNotSupportedException {
        Item item = null;
        try {
            item = items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
        return item;
    }

    public void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages("335");
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        items.put("Book", book);

        }
}
