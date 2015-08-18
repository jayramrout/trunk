package jrout.tutorial.onlineshopping.dao;

import jrout.tutorial.onlineshopping.model.BooksEntity;

import java.util.List;

/**
 * Created by Jayram on 8/16/2015.
 */
public interface BooksDao {
    public List<String> getPublishers();
    public List<BooksEntity> getBooks(String publisherName);
}
