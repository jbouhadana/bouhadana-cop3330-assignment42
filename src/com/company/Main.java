/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.io.*;
import java.util.*;

public class Main {
 try{
        File file = new File(filename);
        Scanner jb = new Scanner(file);

        while (jb.hasNext()){
            String j = jb.nextLine();
            String[] sonk = j.split(",");
            System.out.printf("%-17s%-17s%-17s\n", sonk[0],sonk[1],sonk[2]);

        }
    }catch (FileNotFoundException  ex){
        System.out.println("Error: File Not Found");
    }

    public static void main(String[] args) {
        Employee sonkEmployee = new Employee();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First","Salary");
        System.out.println("--------------------------------");
        sonkEmployee.printDetails("exercise42_input.txt");
    }
}
