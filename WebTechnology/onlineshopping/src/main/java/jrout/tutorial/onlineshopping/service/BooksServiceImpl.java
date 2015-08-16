package jrout.tutorial.onlineshopping.service;

import jrout.tutorial.onlineshopping.dao.BooksDao;
import jrout.tutorial.onlineshopping.dao.BooksDaoImpl;

import java.util.List;

/**
 * Created by Jayram on 8/16/2015.
 */
public class BooksServiceImpl implements BooksService {

    BooksDao booksDao;

    @Override
    public List<String> getPublishers() {
        booksDao = new BooksDaoImpl();
        return booksDao.getPublishers();
    }

    @Override
    public List<String> getBooks(String publisherName) {
        booksDao = new BooksDaoImpl();
        return booksDao.getBooks(publisherName);
    }
}
