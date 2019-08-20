package com.wang.tourism2.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "scenic", schema = "tourism2", catalog = "")
public class ScenicEntity {
    private int sid;
    private String sname;
    private String scomment;
    private Double sprice;
    private String sOpentime;
    private byte[] simage;

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "scomment")
    public String getScomment() {
        return scomment;
    }

    public void setScomment(String scomment) {
        this.scomment = scomment;
    }

    @Basic
    @Column(name = "sprice")
    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    @Basic
    @Column(name = "s_opentime")
    public String getsOpentime() {
        return sOpentime;
    }

    public void setsOpentime(String sOpentime) {
        this.sOpentime = sOpentime;
    }

    @Basic
    @Column(name = "simage")
    public byte[] getSimage() {
        return simage;
    }

    public void setSimage(byte[] simage) {
        this.simage = simage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScenicEntity that = (ScenicEntity) o;
        return sid == that.sid &&
                Objects.equals(sname, that.sname) &&
                Objects.equals(scomment, that.scomment) &&
                Objects.equals(sprice, that.sprice) &&
                Objects.equals(sOpentime, that.sOpentime) &&
                Arrays.equals(simage, that.simage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(sid, sname, scomment, sprice, sOpentime);
        result = 31 * result + Arrays.hashCode(simage);
        return result;
    }
}
