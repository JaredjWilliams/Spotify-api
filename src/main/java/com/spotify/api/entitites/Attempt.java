package com.spotify.api.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@Data
public class Attempt {

    @Id
    @GeneratedValue
    private Long id;

    @CreationTimestamp
    private Timestamp taken;

    @ManyToOne
    private User user;

    private Integer score;

}
