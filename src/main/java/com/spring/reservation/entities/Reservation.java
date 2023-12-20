package com.spring.reservation.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reservation_id")
    private long id;

    private double price;

    private String duration;

    @Temporal(TemporalType.DATE)
    private Date DateReservation ;

    @Temporal(TemporalType.DATE)
    private Date DateMatch ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "terrain_id")
    private Terrain terrain;
}
