package com.example.test.api;

import com.example.test.dto.NewDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class NewAPI {

    @PostMapping(value = "/new")

    public NewDTO createNew(@RequestBody NewDTO model) {
        return model;
    }
}
