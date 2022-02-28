package databaseconnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ReadDataFromDataBase {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        // ReadDataFromDataBase.connectToSQLDatabase();      //
        // ReadDataFromDataBase.readDatabase("Movie", "title");
       // ReadDataFromDataBase.InsertDataFromStringToSQLTable("Fastandfurious", "movie1", "name");
      int [] numbers={23, 24, 25, 26, 27, 28, 29, 30, 31};
        ReadDataFromDataBase.insertDataFromArrayToSqlTable(numbers, "productDetails","productID");
    }

    // Secret.properties file
    // jdbc driver

    // jdbc url
    // configure jdbc
    // mySql Query

    // Create reference Variables With same name then the classes

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;
    public static ResultSet resultSet = null;
    public static String filePath = "ExternelLabreries/properties/Secret.properties";
// Load Properties;


    // Properties is a java utils library class which extend table

    public static Properties LoadProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }


    // DataBase Connection
    public static Connection connectToSQLDatabase() throws IOException, ClassNotFoundException, SQLException {

        Properties prop = ConnectDatabase.LoadProperties(filePath);
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connection = DriverManager.getConnection(url, userName, password);
        statement = connection.createStatement();
        System.out.println("DataBase is Connected Successfully");
        return connection;
    }


    public static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public static List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException {
        List<String> dataList = new ArrayList<>();
        while (resultSet.next()) {
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }


        return dataList;
    }

    public static List<String> readDatabase(String tableName, String columnName) {
        List<String> data = new ArrayList<>();

        try {
            ConnectDatabase.connectToSQLDatabase();
            statement = connection.createStatement();
            //   resultSet = statement.executeQuery("select * from " + tableName);
            data = ConnectDatabase.getResultSetData(resultSet, columnName);


            for (String dt : data) {
                System.out.println(dt);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ConnectDatabase.close();
        }
        return data;
    }

    public static void InsertDataFromStringToSQLTable(String data, String tableName, String columnName) {

        try {
            connectToSQLDatabase();

            preparedStatement = connection.prepareStatement("Insert into " + tableName + " (" + columnName + ") values (?)");
            preparedStatement.setString(1, data);
            preparedStatement.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    public static void insertDataFromArrayToSqlTable(int[] arrayData, String tableName, String columnName) {
        try {
            connectToSQLDatabase();
            preparedStatement = connection.prepareStatement("Drop Table if Exists'" + tableName + "' ");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("CREATE TABLE '" + tableName + "'(ID int (11) not null AUTO_INCREMENT, '" + columnName + "' bigint(20) DEFAULT NULL, PRIMARY KEY('ID'));");

            for (int i = 0; i < arrayData.length; i++) {
                //Insert into table( columnName) values();
                preparedStatement = connection.prepareStatement("Insert into " + tableName + "(" + columnName + ") values (?)");
                preparedStatement.setInt(1,arrayData[i]);
                preparedStatement.executeUpdate();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}