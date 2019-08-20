package com.wang.tourism2.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "tourism2", catalog = "")
public class ProductEntity {
    private int pid;
    private String pname;
    private Double pprice;
    private Integer pnum;
    private byte[] pimage;

    @Id
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pname")
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "pprice")
    public Double getPprice() {
        return pprice;
    }

    public void setPprice(Double pprice) {
        this.pprice = pprice;
    }

    @Basic
    @Column(name = "pnum")
    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    @Basic
    @Column(name = "pimage")
    public byte[] getPimage() {
        return pimage;
    }

    public void setPimage(byte[] pimage) {
        this.pimage = pimage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return pid == that.pid &&
                Objects.equals(pname, that.pname) &&
                Objects.equals(pprice, that.pprice) &&
                Objects.equals(pnum, that.pnum) &&
                Arrays.equals(pimage, that.pimage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pid, pname, pprice, pnum);
        result = 31 * result + Arrays.hashCode(pimage);
        return result;
    }
}
