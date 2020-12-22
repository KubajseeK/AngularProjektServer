package sk.itsovy.kutka.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.itsovy.kutka.server.repository.MovieRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping(path = "/list")
    public List<String> getAllUsers() {
        return movieRepository.getAllMovies();
    }

}
