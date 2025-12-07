package uk.vaent.service;

import org.springframework.stereotype.Service;
import uk.vaent.dao.MyDAO;

@Service
public class MyService {

    private final MyDAO myDAO;

    public MyService(MyDAO myDAO) {
        this.myDAO = myDAO;
    }

    public Long getCount() {
        return myDAO.getCount();
    }

}
