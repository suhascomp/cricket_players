package com.cricket.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "player_seq", allocationSize = 1)
public class Player extends BaseEntity{
//    @Id
//    @GeneratedValue(generator="player_sequence")
//    private int id;
    @Column(unique = true)
    private String playerCode;
    private String name;
//    String profilePic;
    @OneToMany(mappedBy = "player")
    private List<Inning> innings;

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Inning> getInnings() {
        return innings;
    }

    public void setInnings(List<Inning> innings) {
        this.innings = innings;
    }
}
