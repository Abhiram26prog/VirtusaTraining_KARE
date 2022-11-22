import java.util.*;
class Binary{   
    public static void main(String a[]){
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter any number: ");
        int n = s.nextInt();
		System.out.print("Binary conversion: "+Integer.toBinaryString(n));
    }
}