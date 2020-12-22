package sk.itsovy.kutka.server.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllMovies() {

        return new ArrayList<>(jdbcTemplate.queryForList("select titleEN from movies", String.class));
    }
}
