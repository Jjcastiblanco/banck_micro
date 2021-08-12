package com.bancobogota.pruebas.service;

import com.bancobogota.pruebas.controller.LocationController;
import com.bancobogota.pruebas.entity.LocationEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class LocationServiceTest {

    @Mock
    private LocationService locationService;

    @InjectMocks
    private LocationController locationController;

    @BeforeEach
    public void start(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void getAll() {

        LocationEntity locationEntity = new LocationEntity(1,"MED",2);
        List<LocationEntity> l = new ArrayList<>();
        l.add(locationEntity);
        Mockito.when(locationService.getAll()).thenReturn(l);
    }

    @Test
    void save() {
        LocationEntity locationEntity = new LocationEntity(1,"MED",2);
        List<LocationEntity> l = new ArrayList<>();
        l.add(locationEntity);
        Mockito.when(locationService.save(locationEntity)).thenReturn(locationEntity);

    }

    @Test
    void getById() {
        LocationEntity locationEntity = new LocationEntity(1,"MED",2);
        List<LocationEntity> l = new ArrayList<>();
        l.add(locationEntity);
        Mockito.when(locationService.getById(1)).thenReturn(java.util.Optional.of(locationEntity));
    }
}