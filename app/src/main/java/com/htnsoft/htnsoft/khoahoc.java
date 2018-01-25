package com.htnsoft.htnsoft;

/**
 * Created by TRUNG VAN on 1/22/2018.
 */

public class khoahoc {
    private int Id;
    private String TenKhoaHoc;
    private String MoTa;
    private int HinhAnh;

    public khoahoc(int id, String tenKhoaHoc, String moTa, int hinhAnh) {
        Id = id;
        TenKhoaHoc = tenKhoaHoc;
        MoTa = moTa;
        HinhAnh = hinhAnh;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTenKhoaHoc() {
        return TenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        TenKhoaHoc = tenKhoaHoc;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }
}
