package com.swagger.Book;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @PostMapping("/createBook")
    public ResponseEntity<Book> CreateBook(@RequestBody Book book){

        Book b = new Book();
        b.setName(book.getName());
        b.setAuthorName(book.getAuthorName());
        b.setType(book.getType());
        return new ResponseEntity<>(b, HttpStatus.CREATED);
    }

}
