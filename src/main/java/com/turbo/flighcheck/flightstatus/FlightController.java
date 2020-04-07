package com.turbo.flighcheck.flightstatus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class FlightController {


    @Autowired
    private FlightService service;

    @GetMapping("/flights")
    public List<Flight> list(){
        return service.listAll();
    }
    @GetMapping("/flight/{id}")
    public ResponseEntity<Flight> get(@PathVariable Integer id){
        try{
            Flight flight =  service.get(id);
            return new ResponseEntity<Flight>(flight, HttpStatus.OK);
        }
        catch(NoSuchElementException e){
            return new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
        }
        //return service.get(id);

    }

    @PostMapping("/flight")
    public void add(@RequestBody Flight flight){
        service.save(flight);
    }

    @PutMapping("/flight/{id}")
        public ResponseEntity<?> update(@RequestBody Flight flight, @PathVariable Integer id){
        try {
            Flight existprod = service.get(id);
            service.save(flight);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        }

       @DeleteMapping("flight/{id}")
        public ResponseEntity<?> delete(@PathVariable Integer id){
            try{
                Flight delflight =  service.delete(id);
                return new ResponseEntity<>( HttpStatus.OK);
            }
            catch(NoSuchElementException e){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            //return service.get(id);

        }
    }





