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
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String phone ;
    @Enumerated(EnumType.STRING)
    private Role role ;
    @OneToMany(mappedBy = "user")
    private Set<Reservation> reservations = new HashSet<>();
}
