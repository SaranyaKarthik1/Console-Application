package DailyPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProblem {

	 static boolean isAnagram() {
		 String s,t;boolean result;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string: ");
		 s=sc.nextLine();
		 System.out.println("Enter the another string: ");
		 t=sc.nextLine();
		 char c1[]=s.toCharArray();
		 System.out.println(Arrays.toString(c1));
		 char c2[]=t.toCharArray();
		 System.out.println(Arrays.toString(c2));
		 Arrays.sort(c1);
		 System.out.println(Arrays.toString(c1));
		 Arrays.sort(c2);
		 
		if(Arrays.compare(c1, c2)==0) {
			result=true;
			
		}
		else {
			result=false;
		}
		System.out.println(result);
		return result;
		
		 
	 }
	public static void main(String[] args) {
		
		boolean res = isAnagram();
		System.out.println(res);

	}

}
