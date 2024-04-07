package com.xyz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private Long bookingId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users user;

    @OneToOne(fetch = FetchType.LAZY)
    private Show show;

    private int amount;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Seat> listOfSeats;

}
