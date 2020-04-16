package com.yash.bookingsystem.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAnyAttribute;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "room_type")
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Double price;

    @ManyToMany(mappedBy = "roomTypes")
    Set<Booking> bookings;


}
