package com.example.clothesshopremake.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class Color {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "colorid")
    private Integer colorId;
    @Column(name = "colorcode")
    private String colorCode;
    @Column(name = "colordetail")
    private String colorDetail;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorDetail() {
        return colorDetail;
    }

    public void setColorDetail(String colorDetail) {
        this.colorDetail = colorDetail;
    }
}
