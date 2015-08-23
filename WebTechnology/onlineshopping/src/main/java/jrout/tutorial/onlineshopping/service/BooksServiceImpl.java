package jrout.tutorial.onlineshopping.service;

import java.util.List;

import jrout.tutorial.onlineshopping.dao.BooksDao;
import jrout.tutorial.onlineshopping.dao.BooksDaoImpl;
import jrout.tutorial.onlineshopping.model.BooksEntity;

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
    public List<BooksEntity> getBooks(String publisherName) {
        booksDao = new BooksDaoImpl();
        return booksDao.getBooks(publisherName);
    }
}
