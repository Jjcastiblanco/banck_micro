package com.bancobogota.pruebas.service;

import com.bancobogota.pruebas.entity.LocationEntity;
import com.bancobogota.pruebas.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService implements LocationServiceImp {

    @Autowired
    LocationRepository locationRepository;

    @Override
    public List<LocationEntity> getAll() {
        return locationRepository.findAll() ;
    }

    @Override
    public LocationEntity save(LocationEntity locationEntity) {
        return locationRepository.save(locationEntity);
    }

    @Override
    public Optional<LocationEntity> getById(int id) {
        return locationRepository.findById(id);
    }

}
