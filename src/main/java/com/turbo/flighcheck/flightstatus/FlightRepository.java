package com.turbo.flighcheck.flightstatus;

//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
