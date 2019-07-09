package phone;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Phone {

	  public static void main(String[] args) throws IOException {
       // TODO Auto-generated method stub
        
       // Implement scanner
       Scanner input = new Scanner(System.in);

       // create loop for accepting matrix input
       // first accept row size

       System.out.println("Please enter the number of rows in your matrix. Must be 5 or less.");
       int row = input.nextInt();
       while (row > 5 || row < 1) {
           System.out.println("Sorry. Your number is not the correct size. "
                   + "Please enter the number of rows in your matrix. Must be between 5 and 1.");
           row = input.nextInt();
       }
       // next accept column size
       System.out.println("Please enter the number of columns in your matrix. Must be 5 or less.");
       int column = input.nextInt();
       while (column > 5 || column < 1) {
           System.out.println("Sorry. Your number is not the correct size. "
                   + "Please enter the number of columns in your matrix. Must be between 5 and 1.");
           column = input.nextInt();
       }
       // declare array with row and columns the user gave
       String[][] userArray = new String[row][column];

       for(int i=0;i< row ; i++){
           for(int j=0; j< column; j++) {
               System.out.print("Please enter the value for array["+i+"]["+j+"] (between -10 and 10):");
               String val = input.next();
                   //if(val>10 || val< -10) {
                       //System.out.println("Invalid value.");
                       //continue;
                   //}
               userArray[i][j] = val;
           }
       }
       printMatrix(userArray, row, column);
       outputFile(userArray, row, column);
   }
    
   public static void printMatrix(String[][] userArray, int row, int column) {
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < column; j++) {
               System.out.print(userArray[i][j] + " ");
           }
         System.out.println();
       }
   }
   public static void outputFile(String[][] userArray, int row, int column) throws IOException{
       PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\dsmny\\OneDrive\\Documents\\outputfile.txt"));
       //PrintWriter pr = new PrintWriter("file");

       for (int i=0; i<row ; i++)
       {
           for (int a=0; a<column ; a++) {
           //out.println(row);
               out.println(userArray[i][a]);
               

       }
       out.close();
   }

}
}

