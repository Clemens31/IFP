package Persistance.dao;

import Domain.News;
import Persistance.Exception.NoDataFoundException;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class NewsDaoTest {

    @org.junit.jupiter.api.Test
    void getNewsById() {
        NewsDao newsDao = new NewsDao();
        try {
            final News newsById = newsDao.getNewsById(2);
            //assertEquals("mike", news.);
        } catch (SQLException | NoDataFoundException e) {
            fail();

        }


    }
}