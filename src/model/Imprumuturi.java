package model;

import java.util.Date;

public class Imprumuturi {

    private int id;
    private int id_carte;
    private int id_client;
    private Date data_imprumut;
    private Date data_retur;

    public Imprumuturi(int id, int id_carte, int id_client, Date data_imprumut, Date data_retur) {
        this.id = id;
        this.id_carte = id_carte;
        this.id_client = id_client;
        this.data_imprumut = data_imprumut;
        this.data_retur = data_retur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_carte() {
        return id_carte;
    }

    public void setId_carte(int id_carte) {
        this.id_carte = id_carte;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public Date getData_imprumut() {
        return data_imprumut;
    }

    public void setData_imprumut(Date data_imprumut) {
        this.data_imprumut = data_imprumut;
    }

    public Date getData_retur() {
        return data_retur;
    }

    public void setData_retur(Date data_retur) {
        this.data_retur = data_retur;
    }

    @Override
    public String toString() {
        return "Imprumuturi{" +
                "id=" + id +
                ", id_carte=" + id_carte +
                ", id_client=" + id_client +
                ", data_imprumut=" + data_imprumut +
                ", data_retur=" + data_retur +
                '}';
    }
}
