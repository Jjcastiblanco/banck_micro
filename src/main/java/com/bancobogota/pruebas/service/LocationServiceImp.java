package com.bancobogota.pruebas.service;


import com.bancobogota.pruebas.entity.LocationEntity;

import java.util.List;
import java.util.Optional;

public interface LocationServiceImp {

    List<LocationEntity> getAll();

    LocationEntity save(LocationEntity locationEntity);

    Optional<LocationEntity> getById(int id);

}
