package com.xyz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDateTime;
import java.time.LocalTime;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Show extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name="native", strategy = "native")
    private Long showId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    private Screen screen;

    private LocalDateTime showDate;

    private LocalTime startTime;

    private LocalTime endTime;

}
