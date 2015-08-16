package jrout.tutorial.onlineshopping.dao;

import java.util.List;

/**
 * Created by Jayram on 8/16/2015.
 */
public interface BooksDao {
    public List<String> getPublishers();
    public List<String> getBooks(String publisherName);
}
