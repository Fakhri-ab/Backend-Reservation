package com.spring.reservation.repo;

import com.spring.reservation.entities.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerrainRepo extends JpaRepository<Terrain,Long> {
}
