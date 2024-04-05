package com.example.BusCurd.service;

import com.example.BusCurd.model.Bus;
import com.example.BusCurd.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Bus getBus(String bookingID) {
        return busRepository.findById(bookingID).orElse(null);
    }

    public Bus create(Bus bus) {
        return busRepository.save(bus);
    }

    public void delete(String bookingID) {
        busRepository.deleteById(bookingID);
    }

    public Bus update(Bus bus, String bookingID) {
        Bus bus1 = busRepository.findById(bookingID).get();
        bus1.setPassengerName(bus.getPassengerName());
        bus1.setSourceStop(bus.getSourceStop());
        bus1.setDestinationStop(bus.getDestinationStop());
        bus.setBusNumber(bus.getBusNumber());
        bus1.setTravelDate(bus.getTravelDate());
        bus1.setSeatNumber(bus.getSeatNumber());
        busRepository.save(bus1);
        return bus1;
    }

    public void deleteAll() {
        busRepository.deleteAll();
    }
}
