package com.spring.reservation.controller;

import com.spring.reservation.entities.Reservation;
import com.spring.reservation.entities.Terrain;
import com.spring.reservation.entities.User;
import com.spring.reservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Api/Reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService ;

    @PostMapping("/addReservation/{userId}/{terrainId}")
    public ResponseEntity<String> reserver( @PathVariable("userId") Long userId,
                                            @PathVariable("terrainId") Long terrainId,
                                            @RequestBody Reservation reservation){
        if (reservationService.reserver(userId,terrainId,reservation) != null){
             return ResponseEntity.status(HttpStatus.CREATED).body("Reservation success" + reservation.toString()) ;
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Reservation failed") ;
        }
        }


        @GetMapping("/getAll")
        public List <Reservation> getAll(){
          return   reservationService.getAllReservations();
        }
}
