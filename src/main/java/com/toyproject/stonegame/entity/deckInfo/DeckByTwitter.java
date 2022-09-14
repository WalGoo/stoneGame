package com.toyproject.stonegame.entity.deckInfo;


import javax.persistence.*;

@Entity
@Table(name="TwitterDeck")
public class DeckByTwitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deckId;

    static class Dto {

    }

    static class Dto1 {

    }
}

