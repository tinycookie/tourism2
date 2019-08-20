package com.wang.tourism2.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "hotel", schema = "tourism2", catalog = "")
public class HotelEntity {
    private int hid;
    private String hname;
    private String hcomment;
    private Double hprice;
    private int sid;
    private byte[] himage;
    private String hstar;

    @Id
    @Column(name = "hid")
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Basic
    @Column(name = "hname")
    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Basic
    @Column(name = "hcomment")
    public String getHcomment() {
        return hcomment;
    }

    public void setHcomment(String hcomment) {
        this.hcomment = hcomment;
    }

    @Basic
    @Column(name = "hprice")
    public Double getHprice() {
        return hprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    @Basic
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "himage")
    public byte[] getHimage() {
        return himage;
    }

    public void setHimage(byte[] himage) {
        this.himage = himage;
    }

    @Basic
    @Column(name = "hstar")
    public String getHstar() {
        return hstar;
    }

    public void setHstar(String hstar) {
        this.hstar = hstar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelEntity that = (HotelEntity) o;
        return hid == that.hid &&
                sid == that.sid &&
                Objects.equals(hname, that.hname) &&
                Objects.equals(hcomment, that.hcomment) &&
                Objects.equals(hprice, that.hprice) &&
                Arrays.equals(himage, that.himage) &&
                Objects.equals(hstar, that.hstar);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(hid, hname, hcomment, hprice, sid, hstar);
        result = 31 * result + Arrays.hashCode(himage);
        return result;
    }
}
