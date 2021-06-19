package model;

import java.util.Date;

public class Carti {

    private int id;
    private String denumire;
    private String editura;
    private Date data_aparitie;
    private int id_autor;
    private int id_gen;

    public Carti() {

    }

    public Carti(int id, String denumire, String editura, Date data_aparitie, int id_autor, int id_gen) {
        this.id = id;
        this.denumire = denumire;
        this.editura = editura;
        this.data_aparitie = data_aparitie;
        this.id_autor = id_autor;
        this.id_gen = id_gen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public Date getData_aparitie() {
        return data_aparitie;
    }

    public void setData_aparitie(Date data_aparitie) {
        this.data_aparitie = data_aparitie;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public int getId_gen() {
        return id_gen;
    }

    public void setId_gen(int id_gen) {
        this.id_gen = id_gen;
    }

    @Override
    public String toString() {
        return "Carti{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", editura='" + editura + '\'' +
                ", data_aparitie=" + data_aparitie +
                ", id_autor=" + id_autor +
                ", id_gen=" + id_gen +
                '}';
    }
}
