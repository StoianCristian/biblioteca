package model;

public class Genuri {
    private int id;
    private String denumire;

    public Genuri() {

    }

    public Genuri(int id, String denumire) {

        this.id = id;
        this.denumire = denumire;
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

    @Override
    public String toString() {
        return "Genuri{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
