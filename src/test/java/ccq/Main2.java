package ccq;

import java.util.Scanner;

public class Main2 {

	 public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int a, b;
        while(cin.hasNextInt()){
            a = cin.nextInt();
            b = cin.nextInt();
            System.out.println(print(a,b));
            
        }
     }
	 public static String print(int a,int b){
		 String strResult="";		 
		 for(int i=a;i<=b;i++){
			// System.out.println(i);
			if(isPrime(i)&&isPrime(i+2)&&(i+2<=b)){
				strResult=strResult+String.valueOf(i)+" "+String.valueOf(i+2)+" ";		
			}	
		 }
		 if(strResult.length()>0){
			 return strResult;
		 }
		 return "no";	 
	 }
	 public static boolean isPrime(int a){
		 if(a==2||a==3){return true;}
		 for (int j = 2; j <= (int)Math.sqrt(a); j++) {
			if(a%j==0){
				break;
			}
			if(j>=(int)Math.sqrt(a)){			
				//System.out.println(a+ " is a prime");
				return true;
			}			
		}
		return false; 
	 }
	 

}
