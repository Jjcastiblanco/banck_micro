package com.bancobogota.pruebas.service;


import com.bancobogota.pruebas.entity.LocationEntity;

import java.util.List;

public interface LocationServiceImp {

    List<LocationEntity> getAll();

    LocationEntity save(LocationEntity locationEntity);

    LocationEntity update(String name, int area_m2, int id);

    List<LocationEntity> getById(int id);

}
