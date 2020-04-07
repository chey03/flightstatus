package com.turbo.flighcheck.flightstatus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository repo;

    public List<Flight> listAll(){
        return repo.findAll();

    }

    public void save(Flight flight){
        repo.save(flight);
    }

    public  Flight get(Integer id){

        return repo.findById(id).get();
        //return null;
    }

    public Flight delete(Integer id){
        repo.deleteById(id);
       // return null;
        return null;
    }

}
