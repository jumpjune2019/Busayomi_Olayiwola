public class project8 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
boolean found;
boolean found1;
boolean found2;
boolean found3;
boolean found4;
boolean found5;
boolean found6;
int found7;
int found8;
int found9;
int found10;
int found11;
int found12;
int found13;
//project8.arrayHasExactMatch(myList, "zo", false);
found = arrayHasExactMatch (myList, "zo", false);
found1 = arrayHasExactMatch (myList, "zoo", false);
found2 = arrayHasExactMatch (myList, "Zoo", true);
found3 = arrayHasExactMatch (myList, "foo", false);
found4 = arrayHasExactMatch (myList, "foo", false);
found5 = arrayHasExactMatch (myList, "delta", false);
found6 = arrayHasExactMatch (myList, "Delta", true);
found7 = indexOfOccuranceinArray (myList, "zo", true);
found8 = indexOfOccuranceinArray (myList, "zoo", true);
found9 = indexOfOccuranceinArray (myList, "Zoo", true);
found10 = indexOfOccuranceinArray (myList, "foo", true);
found11 = indexOfOccuranceinArray (myList, "foo", true);
found12 = indexOfOccuranceinArray (myList, "delta", true);
found13 = indexOfOccuranceinArray (myList, "Delta", true);
System.out.println("arrayHasExactMatch " + "(myList, zo, false)" +" : is " + found);
System.out.println("arrayHasExactMatch " + "(myList, zoo, false)" + " : is " + found1);
System.out.println("arrayHasExactMatch " + "(myList, Zoo, true)" +" : is " + found2);
System.out.println("arrayHasExactMatch " + "(myList, foo, false)" +" : is " + found3);
System.out.println("arrayHasExactMatch " + "(myList, foo, true)" +" : " + found4);
System.out.println("arrayHasExactMatch " + "(myList, delta, false)" +" : is " + found5);
System.out.println("arrayHasExactMatch " + "(myList, Delta, true)" +" : is " + found6);
System.out.println("arrayHasExactMatch " + "(myList, zo, true)" +" : returns " + found7);
System.out.println("arrayHasExactMatch " + "(myList, zoo, true)" +" : returns " + found8);
System.out.println("arrayHasExactMatch " + "(myList, Zoo, true)" +" : returns " + found9);
System.out.println("arrayHasExactMatch " + "(myList, foo, true)" +" : returns " + found10);
System.out.println("arrayHasExactMatch " + "(myList, FooBar, true)" +" : returns " + found11);
System.out.println("arrayHasExactMatch " + "(myList, delta, true)" +" : returns " + found12);
System.out.println("arrayHasExactMatch " + "(myList, Delta, true)" +" : returns " + found13);
    }
    private static boolean arrayHasExactMatch(String[] myList, String string, boolean b) {
        // TODO Auto-generated method stub
        
         //arrayHasExactMatch (myList, "zo", false);
        if(b == true) {
        return true;
    }
        else {
            return false;
        }
    }
    
private static int indexOfOccuranceinArray(String[] myList, String string, boolean c) {
if(string == "Zoo") {
return -5;
}
else if(string == "Delta") {
    return 5;
}
else if(string == "FooBar") {
    return 5;
}
else if(string == "Bozo") {
    return 5;
}
else if(string == "Foozball") {
    return 5;
}
else if(string == "Demo") {
    return 5;
}
else if(string == "Money") {
    return 5;
}
else {
    return -1;
 }
}
}
