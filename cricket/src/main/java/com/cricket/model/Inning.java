package com.cricket.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "inning_seq", allocationSize = 1)
public class Inning extends BaseEntity{
//    @Id
//    @GeneratedValue(generator="inning_sequence")
//    private int id;
    private long runs;
    private long fours;
    private long sixes;
    private long wickets;
    private long overs;
    private boolean notOut;
    private Date date;
    private String place;
    private MatchType match;
    @ManyToOne(fetch = FetchType.LAZY)
    private Player player;

//    public long getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public long getRuns() {
        return runs;
    }

    public void setRuns(long runs) {
        this.runs = runs;
    }

    public boolean isNotOut() {
        return notOut;
    }

    public void setNotOut(boolean notOut) {
        this.notOut = notOut;
    }

    public long getFours() {
        return fours;
    }

    public void setFours(long fours) {
        this.fours = fours;
    }

    public long getSixes() {
        return sixes;
    }

    public void setSixes(long sixes) {
        this.sixes = sixes;
    }

    public long getWickets() {
        return wickets;
    }

    public void setWickets(long wickets) {
        this.wickets = wickets;
    }

    public long getOvers() {
        return overs;
    }

    public void setOvers(long overs) {
        this.overs = overs;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public MatchType getMatch() {
        return match;
    }

    public void setMatch(MatchType match) {
        this.match = match;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
