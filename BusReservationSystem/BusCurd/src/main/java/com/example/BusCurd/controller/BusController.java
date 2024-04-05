package com.example.BusCurd.controller;

import com.example.BusCurd.model.Bus;
import com.example.BusCurd.service.BusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {

    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping("/getAllBuses")
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/getBus/{bookingID}")
    public Bus getBus(@PathVariable String bookingID) {
        return busService.getBus(bookingID);
    }

    @PostMapping("/createBus")
    public Bus createBus(@RequestBody Bus bus) {
        return busService.create(bus);
    }

    @DeleteMapping("/deleteBus/{bookingID}")
    public String deleteBus(@PathVariable String bookingID) {
        busService.delete(bookingID);
        return "Bus Reservation Deleted";
    }

    @PutMapping("/updateBus/{bookingID}")
    public Bus updateBus(@RequestBody Bus bus, @PathVariable String bookingID) {
        return busService.update(bus, bookingID);
    }

    @DeleteMapping("/deleteAllBuses")
    public String deleteAllBuses() {
        busService.deleteAll();
        return "All Bus Reservation data deleted";
    }
}

