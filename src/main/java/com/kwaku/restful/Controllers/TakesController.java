package com.kwaku.restful.Controllers;

import org.springframework.web.bind.annotation.*;
import com.kwaku.restful.Models.Take;

@RestController
@RequestMapping("/films") // http://localhost:8080/films
public class TakesController {

    Take take;

    public void success() {
        System.out.println("this is up and running");
    }

    @GetMapping("{filmName}")
    public Take getTakeDetails(String filmName) { // http://localhost:8080/films/
        return take;
    }

    @PostMapping
    public String createTakeDetails(@RequestBody Take take) {
        this.take = take;
        return "New take successfully created!";
    }

    @PutMapping
    public String updateTakeDetails(@RequestBody Take take) {
        this.take = take;
        return "New take successfully updated!";
    }

    @DeleteMapping("{filmName}")
    public String deleteTakeDetails(String filmName) {
        this.take = null;
        return "New take successfully deleted!";
    }

}