package com.wang.tourism2.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "tourism2", catalog = "")
public class UserEntity {
    private int uid;
    private String uname;
    private String upassword;

    @Id
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uname")
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "upassword")
    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return uid == that.uid &&
                Objects.equals(uname, that.uname) &&
                Objects.equals(upassword, that.upassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, uname, upassword);
    }
}
