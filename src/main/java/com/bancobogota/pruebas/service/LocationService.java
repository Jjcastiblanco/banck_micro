package com.bancobogota.pruebas.service;

import com.bancobogota.pruebas.entity.LocationEntity;
import com.bancobogota.pruebas.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public LocationEntity update(String name, int area_m2, int id) {
        return locationRepository.update(name,area_m2,id);
    }

    @Override
    public List<LocationEntity> getById(int id) {
        return locationRepository.getId(id);
    }

}
