package com.bancobogota.pruebas.repository;

import com.bancobogota.pruebas.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {
}
