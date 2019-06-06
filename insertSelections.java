
import java.util.Random;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.GregorianCalendar;
import java.lang.Object;
import java.time.LocalDate;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class insertSelections {
   public static void main(String[] args) {
      try{
         
         File file = new File("statements.sql");
         BufferedWriter writer = new BufferedWriter(new FileWriter(file));
         
         int i = 0;
         String temp;
         while(i < 200000){
            String s = writecc(writer);
            writer.append(s);
            i++;
            System.out.println("log ");
            System.out.println(s);

            
         }
         writer.close();
         return;

         
      }
      catch (IOException e) {
         e.printStackTrace();
      }


   }
   public static String writecc(BufferedWriter writer) {
      String[] sybols = {" = ", " < ", " > ", " <= ", " >= ", " != "};
      String[] types = {"*\n", "scorea\n", "scorea, uid\n", "firstName, lastName, scorea\n", "ussername, password, email, scorea\n", "firstName, scorea, scoreb, scorec\n"};
      String[] num = {"scorea", "scoreb", "scorec"};
      Random random = new Random();
      String temp = "select ";

      int rand = random.nextInt(300 - 0 + 1) + 0;
      rand = rand % types.length;
      String select = types[rand];
      temp = temp.concat(select);

      temp = temp.concat("From User\nwhere ");

      rand = random.nextInt(300 - 0 + 1) + 0;
      rand = rand % num.length;

      String where = num[rand];
      temp = temp.concat(where);

      rand = random.nextInt(300 - 0 + 1) + 0;
      rand = rand % sybols.length;
      temp = temp.concat(sybols[rand]);

      rand = random.nextInt(300 - 0 + 1) + 0;
      String srand = Integer.toString(rand);
      temp = temp.concat((srand));
      
      temp = temp.concat(";\n\n");
      
      return temp;
      
      
   }
   
}