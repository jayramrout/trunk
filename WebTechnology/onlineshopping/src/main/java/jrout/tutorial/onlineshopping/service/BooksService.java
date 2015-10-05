package jrout.tutorial.onlineshopping.service;

import java.util.List;

import jrout.tutorial.onlineshopping.model.BooksEntity;

/**
 * Created by Jayram on 8/16/2015.
 */
public interface BooksService {
    public List<String> getPublishers();
    public List<BooksEntity> getBooks(String publisherName);
}
