package com.htnsoft.htnsoft;

import java.io.Serializable;

/**
 * Created by Trung Van on 1/26/2018.
 */

public class Student extends Serializable{
    private String Hoten;
    private int ngaysinh;

    public Student(String hoten, int ngaysinh) {
        Hoten = hoten;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
}
