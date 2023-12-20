package com.spring.reservation.controller;

import com.spring.reservation.entities.Terrain;
import com.spring.reservation.services.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/Terrain")
public class TerrainController {
    @Autowired
    TerrainService terrainService ;

    @PostMapping("/add-terrain")
    public ResponseEntity<String> AddTerrain(@RequestBody Terrain terrain){
        if(terrainService.addTerrain(terrain) != null){
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body("Terrain added successfully : " + terrain.toString());

        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Terrain not created Successfully");
        }
    }

}
