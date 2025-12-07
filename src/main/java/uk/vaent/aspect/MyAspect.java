package uk.vaent.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Aspect
@Component
public class MyAspect {

    @Before("@annotation(sqlQuery)")
    public void queryAdvice(SqlQuery sqlQuery) {
        System.out.println("Executing query: " + sqlQuery.value());
    }

}
