package jrout.tutorial.onlineshopping.service;

import java.util.List;

/**
 * Created by Jayram on 8/16/2015.
 */
public interface BooksService {
    public List<String> getPublishers();
    public List<String> getBooks(String publisherName);
}
