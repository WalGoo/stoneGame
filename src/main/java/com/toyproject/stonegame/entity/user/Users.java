package com.toyproject.stonegame.entity.user;

import javax.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;
}
