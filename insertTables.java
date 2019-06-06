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


public class insertTables {
   public static void main(String[] args) {
      try{
         
         File file = new File("out1");
         BufferedWriter writer = new BufferedWriter(new FileWriter(file));
         
         int i = 0;
         String temp;
         while(i < 10000){
            String s = writecc(writer);
             
            i++;
            //System.out.println("log ");
            System.out.println(s);
            System.out.println("");
            
         }
         return;

         
      }
      catch (IOException e) {
         e.printStackTrace();
      }


   }
   public static String writecc(BufferedWriter writer) {
      String[] names = {"Bob", "John", "Frank", "Joe", "George", "Brett", "Sarah", "Sara", "Tom", "Gym", "Johnson", "Frankson", "Goergeson", "Bart", "Bar", "Stone", "Markson", "Franky", "Jay", "Andrew", "Marry", "Ahn", "Anna", "Sam", "Adam", "Schmit","Rachel", "Ryan", "Reece", "Ronald", "McDonald", "Ann", "Arun", "Arpon", "Neima", "Jess", "Jessica", "Hoss", "Debra", "Mike", "Natalie", "Nat", "Tay", "Lil", "Jon", "Wyne", "Dirk", "Samuel", "Brian", "Boof", "Zack", "Andy", "Ronnie", "Ronny", "Sammy", "Wendle", "Yas", "Zirk", "Guppy", "Luber", "Yuppy", "Buddy", "Bud", "Ron", "Tara", "Jesus", "Jose", "Juan", "Marria", "Martin", "Mark", "Albert", "Albertson", "Rene", "Zig", "Zag", "Zog", "Zob", "Toshi", "Tunchi", "Arf"};
      
      String[] email = {"gmail", "yahoo", "sprynet", "aol", "bing", "calpoly", "icloud", "outlook", "inbox", "zoho"};
      Random random = new Random();
      String temp = "Insert into User (Priv, firstName, lastName, username, email, password, scorea, scoreb, scorec)\nvalues (";
      int rand = random.nextInt(3 - 0 + 1) + 0;
      if(rand % 2 == 1) {
         temp = temp.concat("True");
      }
      else {
         temp = temp.concat("False");
      }
      rand = random.nextInt(300 - 0 + 1) + 0;
      rand = rand % names.length;
      String first = names[rand];
      rand = random.nextInt(300 - 0 + 1) + 0;
      rand = rand % names.length;
      String last = names[rand];
      temp = temp.concat(", '");
      temp = temp.concat(first);
      temp = temp.concat("', '");
      temp = temp.concat(last);
      temp = temp.concat("', '");

      rand = random.nextInt(300 - 0 + 1) + 0;
      char schar;
      if(rand % 2 == 1) {
         schar = first.charAt(0);
         temp = temp.concat(String.valueOf(schar));
         schar = first.charAt(first.length()-1);
         
         temp = temp.concat(String.valueOf(schar));
         temp = temp.concat(last);
      }
      else{
         schar = last.charAt(0);
         
         temp = temp.concat(String.valueOf(schar));
         schar = last.charAt(last.length()-1);
         
         temp = temp.concat(String.valueOf(schar));
         temp = temp.concat(first);
      }
      rand = random.nextInt(300 - 0 + 1) + 0;
      String srand = Integer.toString(rand);
      temp = temp.concat((srand));

      temp = temp.concat("', '");
      temp = temp.concat(first);
      temp = temp.concat(".");
      temp = temp.concat(last);

      rand = random.nextInt(300 - 0 + 1) + 0;
      rand = rand % email.length;
      temp = temp.concat("@");
      temp = temp.concat(email[rand]);
      temp = temp.concat(".com', '");
      

      rand = random.nextInt(300 - 0 + 1) + 0;
      temp = temp.concat(first);
      srand = Integer.toString(rand);
      temp = temp.concat((srand));
      temp = temp.concat("', ");
      rand = random.nextInt(300 - 0 + 1) + 0;
      srand = Integer.toString(rand);
      temp = temp.concat((srand));
      temp = temp.concat(", ");
      rand = random.nextInt(300 - 0 + 1) + 0;
      srand = Integer.toString(rand);
      temp = temp.concat((srand));
      temp = temp.concat(", ");
      rand = random.nextInt(300 - 0 + 1) + 0;
      srand = Integer.toString(rand);
      temp = temp.concat((srand));

      temp = temp.concat(");");


      return temp;
      
      
   }
   
}
