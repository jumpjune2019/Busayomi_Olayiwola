package compare;

       import java.io.BufferedReader;
		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileReader;
		import java.io.IOException;
		import java.io.Reader;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
		import java.util.Scanner;

		public class Compare {


		    public static void main(String[] args) throws IOException {
		        // TODO Auto-generated method stub
		       
		    	String path = "C:\\Users\\My LENOVO\\Documents\\fileinput.txt";
		        Scanner sc = new Scanner(new FileReader(path));
		        //File f2 = new File("C:\\Users\\My LENOVO\\Documents\\fileinput.txt");// INPUT
		        Scanner sc1 = new Scanner(new FileReader(path));
		        List<String> lines = new ArrayList<String>();
		        List<String> lines1 = new ArrayList<String>();
		        //FileReader fR1 = new FileReader(f1);
		       //FileReader fR2 = new FileReader(f2);

		       //BufferedReader reader1 = new BufferedReader(sc1);
		       //BufferedReader reader2 = new BufferedReader(fR2);

		       //String line1 = null;
		       //String line2 = null;
		       //int flag = 1;
		        String[] arr1 = lines1.toArray(new String[0]);
		        String[] arr = lines.toArray(new String[0]);
		        int paragraphCount = 1;
		        int characterCount = 0;
		        while (sc.hasNextLine() && sc1.hasNextLine()) {
		              lines.add(sc.nextLine());
		              lines1.add(sc1.nextLine());
		            
		            arr = lines.toArray(new String[0]);
		            arr1 = lines1.toArray(new String[0]);
		            if(Arrays.equals(arr, arr1)) {
		                System.out.println("Identical Content");
		                if(arr.equals("")) {
		                    paragraphCount++;
		                    //System.out.println();
		                }
		                if(!(arr.equals(""))) {
		                    characterCount += arr.length;
		                    System.out.println(characterCount);
		                    // \\s+ is the space delimiter in java
		                   // String[] wordList = .split("\\s+");
		                      
		                    //countWord += wordList.length;
		                    //whitespaceCount += countWord -1;
		                      
		                    // [!?.:]+ is the sentence delimiter in java
		                    //String[] sentenceList = line.split("[!?.:]+");
		                      
		                    //sentenceCount += sentenceList.length;
		                    
		                }
		            }
		            else {
		                System.out.println("Different Content");
		                
		            }
		            //String[] arr1 = lines.toArray(new String[0]);
		            //for (String var : arr) {
		                //System.out.println(var);
		            //}
//		       sc.close();
//		        sc1.close();
		        }
		        sc.close();
		        sc1.close();
		        


		    //while (sc1.hasNextLine()) {
		          //lines1.add(sc1.nextLine());
		          //arr1 = lines1.toArray(new String[0]);
		          //for (String var1 : arr1) {
		              //System.out.println(var1);
		         // }
		          //sc1.close();    
		    //}
		    
		  }

		
	}


