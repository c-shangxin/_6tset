package com.abc.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by csx on 2017/12/24.
 */
@Entity
@Table(name = "Tb_dept")
public class TbDept implements Serializable {
    private int dno;
    private String dname;

    public TbDept() {
    }

    public TbDept(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
