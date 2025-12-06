package uk.vaent.service;

import org.jdbi.v3.core.Jdbi;
import org.springframework.stereotype.Service;
import uk.vaent.dao.MyDAO;

@Service
public class MyService {

    private final Jdbi jdbi;

    public MyService(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public Long getCount() {
        return jdbi.onDemand(MyDAO.class).getCount();
    }

}
