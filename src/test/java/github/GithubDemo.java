package github;

import java.sql.SQLOutput;

public class GithubDemo {
    public static void main(String[] args) {
        System.out.println("hello github");


        String s = "hahaha";

        for(int i =0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }

        System.out.println("new branch is here!!!");


        System.out.println("Changes by Rabis");

        String str = "araba";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String reversed = sb.toString();
        System.out.println(reversed);



    }


}
