package de.empulse.springbootin10steps.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * TODO: Add class description
 *
 * @author Tycho Schottelius, empulse GmbH, 2020-03-24
 */
@RestController
public class BooksController {
    // GET request to this URI
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1, "Holy Hell", "Godfather"));
    }

}
