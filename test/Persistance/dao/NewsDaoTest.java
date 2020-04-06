package Persistance.dao;

import Domain.NewsBean;
import Persistance.Exception.NoDataFoundException;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class NewsDaoTest {

    @Test
    void getNewsByIdCorrect() {
        NewsDao newsDao = new NewsDao();
        NewsBean newsBean = new NewsBean();

        try {
            newsDao.getNewsById(2);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoDataFoundException e) {
            e.printStackTrace();
            fail();
        }
        //assertEquals(2,newsBean.getId());
    }


}