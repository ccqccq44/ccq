package ccq;
public class Main1 {

	public static void main(String[] args) {
		System.out.println(get(38401));

	}
	public static int get(Integer a){
		
		for (Integer i = a+1; i >= a+1; i++) {
			String str = i.toString();
			char[] arr=str.toCharArray();
			
			if(arr.length%2==1){
				int count=0;
				for (int j = 0; j < (arr.length-1)/2; j++) {
					if(arr[j]==arr[arr.length-1-j]){
						count++;
					}
				}
				if(count==(arr.length-1)/2){
					return i;
				}else{
					continue;
				}
			}
			
			if(arr.length%2==0){
				int count=0;
				for (int j = 0; j < arr.length/2; j++) {
					if(arr[j]==arr[arr.length-1-j]){
						count++;						
					}
				}
				System.out.println("count的值："+count);
				if(count==arr.length/2){
					return i;
				}else{
					continue;
				}
			}		
		}
		
		return 0;
	}
	

}
