package com.toyproject.stonegame.entity.deckInfo.deckStat;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DeckByUserStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="DECKBYUSER_DECKID")
    private DeckByUserStat deck;

    @NotNull
    private short aggro;

    @NotNull
    private short control;

    @NotNull
    private short combo;

    @NotNull
    private short midRange;

    @NotNull
    private short forRank;

}
