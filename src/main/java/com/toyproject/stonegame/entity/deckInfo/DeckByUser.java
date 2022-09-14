package com.toyproject.stonegame.entity.deckInfo;


import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class DeckByUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deckId;

    @Column(nullable = false)
    private String deckCode;

    @Column(nullable = false)
    private String deckName;

    @Column
    private String deckInfo;



}
