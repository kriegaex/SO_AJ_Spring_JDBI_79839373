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

    // this doesn't work
    @Before("@annotation(sqlQuery)")
    public void queryAdvice(SqlQuery sqlQuery) {
        System.out.println("Executing query: " + sqlQuery.value());
    }

    // this works but isn't what I need
    @Before("@annotation(getMapping)")
    public void getMappingAdvice(GetMapping getMapping) {
        System.out.println("GetMapping method called: " + Arrays.toString(getMapping.value()));
    }

}
