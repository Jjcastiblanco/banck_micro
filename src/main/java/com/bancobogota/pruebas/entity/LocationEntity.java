package com.bancobogota.pruebas.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "location")
public class LocationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "BD_NAME")
    private String name;

    @Column(name = "BD_AREA")
    private int area_m2;

    public LocationEntity() {
    }

    public LocationEntity(Integer id, String name, int area_m2) {
        this.id = id;
        this.name = name;
        this.area_m2 = area_m2;
    }
}
