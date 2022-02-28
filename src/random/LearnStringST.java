package random;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Locale;

public class LearnStringST {


    public static void main(LearnStringST[] args) {

        String Song = "I want to stay alive";
        System.out.println(Song.charAt(6));
        System.out.println(Song.toUpperCase());
        System.out.println(Song.toLowerCase());
        System.out.println(Song.contains("s"));
        System.out.println(Song.substring(5));
        System.out.println(Song.substring(10));
        System.out.println(Song.getBytes());
        System.out.println(Song.equalsIgnoreCase("I WANT to SEE aLive"));
        System.out.println(Song.length());
        System.out.println(Song.equals("couscous"));
        System.out.println(Song.equals("i want to see alive "));

        String body = "The worst thing in the world is to lie ";
        System.out.println( body.length()    );
        System.out.println(body.equals("man"));
        System.out.println(body.toCharArray());
        System.out.println(body.getBytes());
        System.out.println(body.toUpperCase());
        System.out.println(body.toLowerCase(Locale.ROOT));
        System.out.println(body.substring(5,6));
        System.out.println(body.charAt(6));
        System.out.println(body.substring(7));
        System.out.println(body.indexOf(0));
        System.out.println(body.trim());
        System.out.println(body.contains("d"));
        System.out.println(body.equalsIgnoreCase("maria amiar"));



    }

}
