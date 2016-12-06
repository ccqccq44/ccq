package ccq;

public class Test2 {

	public static void main(String[] args) {
		String str="ni hao a sha bi";
		System.out.println(sum(str));
	}
	
	public static int sum(String str){
		int result=1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' '){
				result+=1;
			}
		}
		return result;
	}

}
