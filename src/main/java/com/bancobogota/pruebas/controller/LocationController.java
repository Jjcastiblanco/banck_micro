package com.bancobogota.pruebas.controller;


import com.bancobogota.pruebas.entity.LocationEntity;
import com.bancobogota.pruebas.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/web")
public class LocationController {

    private LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/all")
    public List<LocationEntity> getAll(){
        return locationService.getAll();
    }

    @PostMapping("/save")
    public LocationEntity save(LocationEntity locationEntity){
        return locationService.save(locationEntity);
    }

    @PutMapping("/save/{id}")
    public LocationEntity update(@RequestBody LocationEntity locationEntity, @PathVariable Integer id){
        return locationService.getById(id).map(location -> {
            location.setName(locationEntity.getName());
            location.setArea_m2(locationEntity.getArea_m2());
            return locationService.save(locationEntity);
        }).orElseGet(()-> {
            return locationService.save(locationEntity);
        });
    }

    @GetMapping("/{id}")
    public Optional<LocationEntity> getById(@PathVariable("id") Integer id){
        return locationService.getById(id);
    }

}
