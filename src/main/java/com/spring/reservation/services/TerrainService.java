package com.spring.reservation.services;

import com.spring.reservation.entities.Terrain;
import com.spring.reservation.repo.TerrainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerrainService implements Iterrain{
    @Autowired
    private TerrainRepo terrainRepo;
    @Override
    public Terrain addTerrain(Terrain terrain) {
         return terrainRepo.save(terrain);
    }
}
