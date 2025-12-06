package uk.vaent.dao;

import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface MyDAO {

    @SqlQuery("SELECT COUNT(*) FROM mytable")
    long getCount();

}
