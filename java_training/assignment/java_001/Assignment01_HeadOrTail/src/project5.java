import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class project5 {
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
    
    
    public static void main(String[] args) {
int a[] = new int[1000];
int b[] = new int [1000];        

        HashSet<Integer> al = new HashSet<Integer>();
        HashSet<Integer> bl = new HashSet<Integer>();
       //Store the array in set as set will store unique elemnets
        for(int i=0;i<a.length;i++){
           
            Arrays.sort(a);
            //Arrays.sort(b);
            a[i] = dice(1,2);
            //b[i] = dice2(3,4);
            //int count =0;
            al.add(a[i]);
            //bl.add(b[i]);
        }
        for(int p=0;p<b.length;p++) {
             Arrays.sort(b);
            b[p] = dice2(3,4);
            bl.add(b[p]);
    }
    


       //printing the set
        System.out.println("al "+al);
       System.out.println("bl"+bl);
    

        for(int set : al){
            
            int count = 0;
            for(int j=0;j<a.length;j++){

                if(set==a[j]){
                    count++;
                }
            }
          System.out.println(set+" occurs "+count+" times");
        }
        for(int set : bl){
            
            int count = 0;
            for(int k=0;k<a.length;k++){

                if(set==b[k]){
                    count++;
                }
            }
          System.out.println(set+" occurs "+count+" times");

    }
    
    }
}

    
