package ccq;


public class IsPrime {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++){
			for (int j = 2; j <= (int)Math.sqrt(i); j++) {
				if(i%j==0){
					break;
				}
				if(j>=(int)Math.sqrt(i)){			
					System.out.println(i+ " is a prime");
				}			
			}
		}	  
	}
}
