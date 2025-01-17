package com.example.thetitans.bookface.model.user;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Friendship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User sender;

    @ManyToOne
    private User receiver;

    private boolean status;

}
