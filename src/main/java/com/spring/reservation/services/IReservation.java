package com.spring.reservation.services;

import com.spring.reservation.entities.Reservation;
import com.spring.reservation.entities.Terrain;
import com.spring.reservation.entities.User;

import java.util.Date;

public interface IReservation {
    public Reservation reserver(Long iduser, Long idterrain,Reservation reservation)  ;
}
