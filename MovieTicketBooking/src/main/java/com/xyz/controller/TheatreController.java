package com.xyz.controller;


import com.xyz.dto.TheatreDTO;

import com.xyz.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/theatres", produces = {MediaType.APPLICATION_JSON_VALUE})
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping(path="/add")
    public ResponseEntity addTheatre(@RequestBody TheatreDTO theatreDTO) {
        theatreService.add(theatreDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<TheatreDTO> getAllTheatre() {
        return theatreService.getAllTheatres();
    }

    @GetMapping("/{name}")
    public TheatreDTO getTheatreByName(@PathVariable String name) {
        return theatreService.getTheatreByName(name);
    }
}
