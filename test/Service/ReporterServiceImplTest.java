package Service;

import Persistance.Repository.ReporterRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReporterServiceImplTest {

    @Test
    void find() {
        ReporterRepository reporterRepository = new ReporterServiceImpl();
        reporterRepository.find(1);
    }
}