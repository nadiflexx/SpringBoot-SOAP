package com.soap.controller;

import com.soap.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Marchandising API class that collect the information from the API.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("divide")
public class DivideApi {
    @Autowired
    private Services services;

    /**
     * Calls a divide Service function and return a Body Result.
     *
     * @param numberA representing an Integer.
     * @param numberB representing an Integer.
     * @return a Body result.
     */
    @PostMapping("/divide")
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {
        return ResponseEntity.ok(services.divideResponse(numberA,numberB));
    }

}