package dao;

import model.Autori;
import model.Carti;
import model.Genuri;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoriDao {

    static String connectionUrl = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String user = "root";
    private static final String password = "cristi";

    public Carti findById(int id) {
        Carti carti = new Carti();
        String query = "select c.id, c.denumire, c.editura, c.data_aparitie, a.id, a.nume, a.prenume, g.id, g.denumire from (carti c " +
                "inner join autori a on c.id_autor = a.id" +
                "inner join genuri g on c.id_gen = g.id)" +
                "where c.id= " + id;


        try {
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                carti.setId(resultSet.getInt(1));
                carti.setDenumire(resultSet.getString(2));
                carti.setEditura(resultSet.getString(3));
                carti.setData_aparitie(resultSet.getDate(4));

                Autori autor = new Autori();
                autor.setId(resultSet.getInt(5));
                autor.setNume(resultSet.getString(6));
                autor.setPrenume(resultSet.getString(7));

                Genuri genuri = new Genuri();
                genuri.setId(resultSet.getInt(8));
                genuri.setDenumire(resultSet.getString(9));

//                carti.setAutor(autor);
//                carti.setGenuri(genuri);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return carti;
    }



        public List<Carti> findAll () {
            String query = "select c.id, c.denumire, c.editura, c.data_aparitie, a.id, a.nume, a.prenume, g.id, g.denumire from carti( c " +
                    "inner join autori a on c.id_autor = a.id" +
                    "inner join genuri g on c.id_gen = g.id) ";

            List<Carti> cartiList = new ArrayList<>();

            try{

                Connection connection = DriverManager.getConnection(connectionUrl, user, password);
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                while(resultSet.next()) {
                    Carti carti = new Carti();
                    carti.setId(resultSet.getInt(1));
                    carti.setDenumire(resultSet.getString(2));
                    carti.setEditura(resultSet.getString(3));
                    carti.setData_aparitie(resultSet.getDate(4));

                    Autori autor = new Autori();
                    autor.setId(resultSet.getInt(5));
                    autor.setNume(resultSet.getString(6));
                    autor.setPrenume(resultSet.getString(7));

                    Genuri genuri = new Genuri();
                    genuri.setId(resultSet.getInt(8));
                    genuri.setDenumire(resultSet.getString(9));

                }
            } catch(SQLException throwables) {
                throwables.printStackTrace();
            }
            return cartiList;
        }
    }
