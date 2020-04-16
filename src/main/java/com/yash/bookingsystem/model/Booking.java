package com.yash.bookingsystem.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = 'booking')
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "roomtype_booking", joinColumns = @JoinTable(name = "booking_id"),
            inverseJoinColumns = @JoinTable("booking_id"))
    private Set<RoomType> roomTypes;


}
