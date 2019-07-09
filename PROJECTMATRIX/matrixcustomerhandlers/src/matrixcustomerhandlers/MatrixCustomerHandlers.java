package matrixcustomerhandlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.lang.Readable;

public class MatrixCustomerHandlers {


	public static String[] []a = new String[6][6];
	    
	    public static int dice(int min, int max){
	        int i;
	        
	        int dice = (min+max)+1;
	        for(i=0; i<=dice; i++) {
	        dice = (int)(Math.random()*max)+min;
	        }
	        return dice;
	        }
	    
	    
	    public static int dice2(int min, int max){
	        int i;
	        
	        int dice2 = (min+max)+1;
	        for(i=0; i<=dice2; i++) {
	        dice2 = (int)(Math.random()*max)+min;
	        }
	        return dice2;
	        }
	    
	    public static void projectScreen(){
	        a[0][0]= "Snake eyes";    
	        a[0][1]= "Australian yo";
	        a[0][2]= "Little Joe From Kokomo";
	        a[0][3]= "No field five";
	        a[0][4]= "Easy six";
	        a[0][5]= "Six one you're done";
	        
	        a[1][0]= "Ace caught a deuce";
	        a[1][1]= "Ballerina";
	        a[1][2]= "The fever";
	        a[1][3]= "Jimmie Hicks";
	        a[1][4]= "Benny Blue";
	        a[1][5]= "Easy eight";
	        
	        a[2][0]= "Easy four";
	        a[2][1]= "Oj";
	        a[2][2]= "Brooklyn Forest";
	        a[2][3]= "Big Red";
	        a[2][4]= "Eighter from Decatur";
	        a[2][5]= "Nina from Pasadena";
	        
	        a[3][0]= "Little Phoebe";
	        a[3][1]= "Easy six";
	        a[3][2]= "Skinny McKinney";
	        a[3][3]= "Square pair";
	        a[3][4]= "Railroad nine";
	        a[3][5]= "Big one on the end";
	        
	        a[4][0]= "Sixie from Dixie";
	        a[4][1]= "Skinny Dugan";
	        a[4][2]= "Easy eight";
	        a[4][3]= "Jesse James";
	        a[4][4]= "Puppy paws";
	        a[4][5]= "Yo";
	        
	        a[5][0]= "The Devil";
	        a[5][1]= "Easy eight";
	        a[5][2]= "Lou Brown";
	        a[5][3]= "Tennessee";
	        a[5][4]= "Six five no jive";
	        a[5][5]= "Midnight";

	        System.out.println("Die 1" + "         " + "Die2" + "         " + "Die3" + "         " + "Die4" + "         "+ "Die5" + "         " + "Die6");
	        System.out.println(a[0][0] + " " + a[0][1] + " " + a[0][2] + " " + a[0][3] + " " + a[0][4] + " " + a[0][5]);
	        System.out.println(a[1][0] + " " + a[1][1] + " " + a[1][2] + " " + a[1][3] + " " + a[1][4] + " " + a[1][5]);
	        System.out.println(a[2][0] + " " + a[2][1] + " " + a[2][2] + " " + a[2][3] + " " + a[2][4] + " " + a[2][5]);
	        System.out.println(a[3][0] + " " + a[3][1] + " " + a[3][2] + " " + a[3][3] + " " + a[3][4] + " " + a[3][5]);
	        System.out.println(a[4][0] + " " + a[4][1] + " " + a[4][2] + " " + a[4][3] + " " + a[4][4] + " " + a[4][5]);
	        System.out.println(a[5][0] + " " + a[5][1] + " " + a[5][2] + " " + a[5][3] + " " + a[5][4] + " " + a[5][5]);
	    }
	    public static void printFile() throws java.lang.Exception {
	        
	        //BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Busayomi_Olayiwola\\OneDrive\\Documents\\fileinput.txt"));
	        Scanner sc = new Scanner(new FileReader("C:\\Users\\My LENOVO\\Documents\\fileinput.txt"));
	        List<String> lines = new ArrayList<String>();
	        //lines.add("1");
	        //lines.add("1");
	        //lines.add("1");
	        //lines.add("1");
	        while (sc.hasNextLine()) {
	          lines.add(sc.nextLine());
	        }

	        String[] arr = lines.toArray(new String[0]);
	        for (String var : arr) {
	System.out.println(var);
	        //System.out.println(arr.toString());
	        sc.close();
	    }
	}
	    
	        
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	    System.out.println("Would you like to print from screen, file, or both?");
	    String name = input.nextLine();
	//try {
//	        
//	    if(name.equals("screen")) {
//	        Hwk1.projectScreen();
//	    }
//	    }
//	    catch(Exception e) {
//	    System.out.println("Exception thrown : " + e);
//	    }
	//try {
//	        if(name.equals("file")) {
//	            Hwk1.printFile();
//	        }
	//}
//	    catch(Exception e) {
//	        System.out.println("Exception thrown : " + e);
//	    }
	//try {
//	        if(name.equals("both")) {
//	            Hwk1.projectScreen();
//	            Hwk1.printFile();
//	        }
//	    }
//	    catch(Exception e) {
//	        System.out.println("Exception thrown : " + e);
//	     }
	    try {
	        if (name.equals("screen")) {
	        	MatrixCustomerHandlers.projectScreen();
	        } else if (name.equals("file")) {
	        	MatrixCustomerHandlers.printFile();
	        } else if (name.equals("both")) {
	        	MatrixCustomerHandlers.projectScreen();
	        	MatrixCustomerHandlers.printFile();
	        } else {
	            input.close();
	            throw new MatrixCustomerHandlersException();
	        }
	    } catch (MatrixCustomerHandlersException  e) {
	        e.printMessage();
	        
	    } catch (Exception e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    
	    input.close();
	    
	  }


	    

}
