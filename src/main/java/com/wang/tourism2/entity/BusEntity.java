package com.wang.tourism2.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "bus", schema = "tourism2", catalog = "")
public class BusEntity {
    private int bid;
    private String bname;
    private Timestamp bstarttime;
    private Timestamp bendtime;
    private String bnum;
    private int sid;

    @Id
    @Column(name = "bid")
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "bname")
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Basic
    @Column(name = "bstarttime")
    public Timestamp getBstarttime() {
        return bstarttime;
    }

    public void setBstarttime(Timestamp bstarttime) {
        this.bstarttime = bstarttime;
    }

    @Basic
    @Column(name = "bendtime")
    public Timestamp getBendtime() {
        return bendtime;
    }

    public void setBendtime(Timestamp bendtime) {
        this.bendtime = bendtime;
    }

    @Basic
    @Column(name = "bnum")
    public String getBnum() {
        return bnum;
    }

    public void setBnum(String bnum) {
        this.bnum = bnum;
    }

    @Basic
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusEntity busEntity = (BusEntity) o;
        return bid == busEntity.bid &&
                sid == busEntity.sid &&
                Objects.equals(bname, busEntity.bname) &&
                Objects.equals(bstarttime, busEntity.bstarttime) &&
                Objects.equals(bendtime, busEntity.bendtime) &&
                Objects.equals(bnum, busEntity.bnum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, bname, bstarttime, bendtime, bnum, sid);
    }
}
