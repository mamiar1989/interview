package databaseconnection;

public class Movie1 {


    private String name;
    private int year;
    private String popularity;


    public static void main(String[] args) {

    }

    public Movie1() {

    }

    public Movie1(String name, int year, String popularity) {
        this.name = name;
        this.year = year;
        this.popularity = popularity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
}