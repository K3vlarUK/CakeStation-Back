package com.example.CakeStation.models;


import javax.persistence.*;

@Entity
@Table(name="cakes")
public class Cake {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "comment")
    private String comment;

    @Column(name = "url")
    private String url;

    @Column(name = "yumfactor")
    private Integer yumfactor;

    public Cake(String name, String comment, String url, Integer yumfactor) {
        this.name = name;
        this.comment = comment;
        this.url = url;
        this.yumfactor = yumfactor;
    }

    public Cake() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String geturl() {
        return url;
    }

    public void seturl(String url) {
        this.url = url;
    }

    public Integer getYumfactor() {
        return yumfactor;
    }

    public void setYumfactor(Integer yumfactor) {
        this.yumfactor = yumfactor;
    }
}
