package use;

public class StringCharNum {
	public static void main(String[] args) {
		String str = "abA23 你好9";
		char[] arr = str.toCharArray();
		int character=0;
		int space=0;
		int digit=0;
		int other=0;
		
		for(int i=0;i<arr.length;i++){
			if(('a'<=arr[i]&&arr[i]<='z')||('A'<=arr[i]&&arr[i]<='Z')){
				character+=1;
			}else if(arr[i]==' '){
				space+=1;
			}else if('0'<=arr[i]&&arr[i]<='9'){
				digit+=1;
			}else{
				other+=1;
			}
		}
		System.out.println("字母个数："+character);
		System.out.println("空格个数："+space);
		System.out.println("数字个数："+digit);
		System.out.println("其他个数："+other);
	}
	
}
