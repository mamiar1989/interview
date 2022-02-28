package databaseconnection;

import javax.management.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBaseConnectionDirectly {


    //    JDBC CONNECTION
//    URL SYNTAX
//##protocol//[hosts][/database][?properties]
//#Explanation
//##protocol// is the path or the root, the way it will develop the connection


    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/interviewpreparation?serverTimezone=UTC";
        String username = "root";
        String password = "Amelia2019";


        Connection connection = null;
        Statement statement = null;

        Movie1 tb = new Movie1("abc", 2019, "Famous");
        Movie1 tbt = new Movie1("abcd", 2000, "cool");
        Movie1 tbd = new Movie1("abcrrrr", 2021, "drama");

        ArrayList<Movie1> mo = new ArrayList<>();
        mo.add(tb);
        mo.add(tbt);
        mo.add(tbd);


//        Movie titanic = new Movie(1, "Titanic", 1989, "Romance", "PG-15", "Jon Landau");
//        Movie trumanShow = new Movie(2, "Truman Show", 1998, "Comedy Drama", "PG_12", "Scot Rudin");
//        Movie lionKing = new Movie(3, "Lion King", 1994, "Drama", "PG-11", "Jhon Favrau");
//        Movie littleThings = new Movie(4, "Little Things", 2021, "Crime", "PG-4", "John Lee");
//        Movie shrek = new Movie(5, "Shrek", 2001, "adventure", "PG-2", "John Williams");
//
//// First Create ArrayList // then add all the above properties
//        ArrayList<Movie> movies = new ArrayList<>();
//        movies.add(titanic);
//        movies.add(trumanShow);
//        movies.add(lionKing);
//        movies.add(littleThings);
//        movies.add(shrek);
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

            // Use for eachLoop to iterate the Data
//
//            for (Movie mv : movies) {
//                String query = "insert into movie (id,title,releaseYear,genre,mpaRating,producer)"
//                        + "values(  " + mv.getId() + ",'" + mv.getTitle() + "', " + mv.getReleaseYear() + ",'" + mv.getGenre() + "','" + mv.getMpaRating() + "','" + mv.getProducer() + "'   )";
//                statement.execute(query);
//            }

//            for (Movie1 mv1 : mo) {
//                String query = "Insert into movie1 (name, year, popularity)" +
//                        " values ( '" + mv1.getName() + "' ," + mv1.getYear() + "  , '" + mv1.getPopularity() + "' )";
//                statement.execute(query);

//            }


            // Execute a Query
//
//             String query = "Select * from students";
//            statement.execute(query);

            String query = "Insert into movie1(name,year,popularity) values ('sam',203,'famous')";
            statement.execute(query);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
    }
}