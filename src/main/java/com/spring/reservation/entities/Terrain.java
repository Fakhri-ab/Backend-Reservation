package com.spring.reservation.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private String address;
    @Enumerated(EnumType.STRING)
    TerrainType typeTerrain ;
    @OneToMany(mappedBy = "terrain")
    private Set<Reservation> reservations = new HashSet<>();
}
