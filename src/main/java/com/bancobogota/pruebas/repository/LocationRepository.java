package com.bancobogota.pruebas.repository;

import com.bancobogota.pruebas.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {

    @Query("SELECT L FROM location L WHERE L.id = ?")
    List<LocationEntity> getId(Integer id);

    @Query("UPDATE LocationEntity L SET L.name = ?1, L.area_m2 = ?2 WHERE L.id = ?3 ")
    LocationEntity update(String name, int area_m2, int id);
}
