package com.toyproject.stonegame.entity.deckInfo.deckStat;


import com.toyproject.stonegame.entity.deckInfo.DeckByTwitter;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class DeckByTwitterStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    // @JoinColumn
    private DeckByTwitter deck;

}
