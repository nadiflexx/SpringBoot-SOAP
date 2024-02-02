package com.soap.controller;

import com.soap.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Table Game API class that collect the information from the API.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */

/**
 * Class that gets the information from the API.
 *
 * @author Nadeem Rashid Arias
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("subtract")
public class SubtractApi {
    @Autowired
    private Services services;

    /**
     * Calls a subtract Service function and return a Body Result.
     *
     * @param numberA representing an Integer.
     * @param numberB representing an Integer.
     * @return a Body result.
     */
    @PostMapping("/subtract")
    public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {
        return ResponseEntity.ok(services.subtractResponse(numberA,numberB));
    }

}