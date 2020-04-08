package Persistance.dao;

import Domain.ReporterBean;
import Persistance.Exception.NoDataFoundException;
import org.junit.jupiter.api.Test;


import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ReporterDaoTest {


    // Constante à mettre

    @Test
    void getReporterByIdPseudoSimilaireDansLaBase() {
        ReporterDao reporterDao = new ReporterDao();
        ReporterBean reporterBean = new ReporterBean();
        try {
            reporterBean = reporterDao.getReporterById(1);
        } catch (SQLException e) {
            fail();
        } catch (NoDataFoundException e) {
            fail();
        }
        assertEquals("bob",reporterBean.getPseudo());

    }

    @Test
    void getReporterByIdDifferentDuPseudoEnBase() {
        ReporterDao reporterDao = new ReporterDao();
        ReporterBean reporterBean = new ReporterBean();
        try {
            reporterBean = reporterDao.getReporterById(1);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoDataFoundException e) {
            e.printStackTrace();
            fail();
        }
        assertNotEquals("boba",reporterBean.getPseudo());
    }

    @Test
    void getReporterByIdNonExistantEnBase() {
        ReporterDao reporterDao = new ReporterDao();
        // Cas d'un ID qui n'existe pas
         assertThrows(NoDataFoundException.class, () ->
                reporterDao.getReporterById(18595));
    }

    @Test
    void getReporterGetCorrectObject(){
        ReporterDao reporterDao = new ReporterDao();
        ReporterBean reporterInitial = new ReporterBean(1,"bob",5);
        ReporterBean reporterRecup = null;

        try {
            reporterRecup = reporterDao.getReporterById(1);
        } catch (SQLException e) {
            fail();
        } catch (NoDataFoundException e) {
            fail();
        }
        // J'ai trouvé comment comparé deux objets mais je n'y arrive pas
        assertEquals(reporterInitial, reporterRecup);
    }

}