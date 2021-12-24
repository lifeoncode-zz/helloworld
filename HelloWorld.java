// THIS IS A COMMENT

/* 
  THIS IS A MULTI-LINE COMMENT 
  ANY TEXT BETWEEN THE ASTERISKS AND THE FORWARD SLASH 
  IS KNOWN AS A MULTI-LINE COMMENT
*/


/* 
  ~ EVERY LINE OF CODE THAT RUNS IN JAVA MUST BE INSIDE A CLASS
  ~ HERE OUR CLASS IS NAMED HelloWorld
  ~ THE NAME OF THE JAVA FILE MUST MATCH THE NAME OF THE CLASS
  ~ A CLASS SHOULD ALWAYS START WITH AN UPPERCASE LETTER
*/
public class HelloWorld {

/*
  ~ THE main() METHOD IS REQUIRED AND USED IN EVERY JAVA PROGRAM
  ~ ANY CODE INSIDE THE main() METHOD WILL BE EXECUTED
*/

    public static void main(String[] args) {

      /* 
        ~ THE println() PRINTS OUT A LINE OF TEXT TO THE SCRESS
        ~ EACH CODE STATEMENT MUST END WITH A SEMI-COLON 
      */

      System.out.println("Hello World, it's Octavia!");


      // TO CREATE A VARIABLE, FIRST SPECIFY THE TYPE, THEN ASSIGN IT TO A VALUE
      String name = "Octavia"; //THIS IS A STRING
      System.out.println(name);
      

      int num = 18; //THIS IS AN INTEGER
      System.out.println(num);


      float floatnum = 12; //THIS IS A FLOAT
      System.out.println(floatnum);


      char character = 'a'; //This is a character, characters are stored in single quotes
      System.out.println(character);


      boolean bool = true; // THIS IS A BOOLEAN
      System.out.println(bool);
    }
  }// THE CURLY BRACES MARK THE BEGINNING AND END OF A BLOCK OF CODE


