package com.example.lib;

public class hw15 {
    public static void main(String[] argv){
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int h =scanner.nextInt();
        int m =scanner.nextInt();

        {
            if( (h==7 && m>=30) || ( h<=17) )
            {
                System.out.println("At School");
            }
            else
            {
                System.out.println("Off School");
            }
        }
    }}
