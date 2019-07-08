package headortail;

import java.util.Arrays;
import java.util.HashSet;

public class project2 {

    public static int dice(int min, int max){
        int i;
        
        int dice = (min+max)+1;
        for(i=0; i<=dice; i++) {
        dice = (int)(Math.random()*max)+min;
        }
        return dice;
        }
    
    
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a[] = new int[2000];
        

        HashSet<Integer> al = new HashSet<Integer>();

       //Store the array in set as set will store unique elements
        for(int i=0;i<a.length;i++){
            Arrays.sort(a);
            a[i] = dice(1,2);
            //int count =0;
            al.add(a[i]);
        }
        //printing the set
        System.out.println("al "+al);

        
        for(int set : al){
            
            int count = 0;
            for(int j=0;j<a.length;j++){

                if(set==a[j]){
                    count++;
                }
            }
          System.out.println(set+" occurs "+count+" times");
        }
    }
    
    }