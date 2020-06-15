package com.example.android_lab4;

import java.io.Serializable;

public class Animal implements Serializable {
    private int _id;
    private String gatunek;
    private String kolor;
    private float wielkosc;
    private String opis;

    public Animal()
    {

    }

    public Animal(String gatunek, String kolor, float wielkość, String opis)
    {
        super();
        this.gatunek = gatunek;
        this.kolor = kolor;
        this.wielkosc = wielkość;
        this.opis = opis;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id)
    {
        this._id = _id;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getKolor() {
        return kolor;
    }

    public float getWielkosc() {
        return wielkosc;
    }

    public String getOpis() {
        return opis;
    }

    @Override
    public String toString()
    {
        return "Zwierze: [id = "+_id + ", gatunek = " + gatunek + ",kolor = "+kolor
                +" wielkosc = "+wielkosc+" ]";
    }
}