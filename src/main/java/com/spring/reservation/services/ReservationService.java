package com.spring.reservation.services;

import com.spring.reservation.entities.Reservation;
import com.spring.reservation.entities.Role;
import com.spring.reservation.entities.Terrain;
import com.spring.reservation.entities.User;
import com.spring.reservation.repo.ReservationRepo;
import com.spring.reservation.repo.TerrainRepo;
import com.spring.reservation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService implements IReservation{
    @Autowired
    UserRepo userRepo ;
    @Autowired
    ReservationRepo reservationRepo ;
    @Autowired
    TerrainRepo terrainRepo ;
    @Override
    public Reservation reserver(Long iduser,
                                Long idterrain,
                                Reservation reservation) {

        Optional<User> user = userRepo.findById(iduser);

        Optional<Terrain> terrain = terrainRepo.findById(idterrain);

        if(user.isPresent() && user.get().getRole().equals(Role.USER)){
            Reservation reservation1 = new Reservation();
            reservation1.setPrice(reservation.getPrice());
            reservation1.setDuration(reservation.getDuration());
            reservation1.setDateReservation(new Date());
            reservation1.setDateMatch(reservation.getDateMatch());
            System.out.println(new Date());
            System.out.println(terrain.get());
            reservation1.setUser(user.get());
            reservation1.setTerrain(terrain.get());

            reservationRepo.save(reservation1);
            return reservation1;
        }
        return null;
    }

    public List<Reservation> getAllReservations(){
       return  reservationRepo.findAll() ;
    }
}
