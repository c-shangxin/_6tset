package com.abc.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by csx on 2017/12/24.
 */
@Entity
@Table(name = "Tb_EMP")
public class TbEmp implements Serializable{
    private int eno;
    private String ename;
    private int eage;
    private String esex;

    private TbDept dept;

    public TbEmp() {
    }

    public TbEmp(int eno, String ename, int eage, String esex) {
        this.eno = eno;
        this.ename = ename;
        this.eage = eage;
        this.esex = esex;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "edno")
    public TbDept getDept() {
        return dept;
    }

    public void setDept(TbDept dept) {
        this.dept = dept;
    }
}
