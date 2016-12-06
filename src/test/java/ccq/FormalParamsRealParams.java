package ccq;
public class FormalParamsRealParams {

	String str = new String("good");
	char[] ch = {'y','e','s'};
	int a=1;
	
	public static void main(String[] args) {
		FormalParamsRealParams ex = new FormalParamsRealParams();
		ex.change(ex.str,ex.ch,ex.a);
		System.out.println(ex.str);
		System.out.println(ex.ch);
		System.out.println(ex.a);
	}
	//当参数为基础数据类型时：实参传递给形参的是值（包括String类型）形参在函数内值的变化不会影响实参
	//当参数为对象时：实参传递给形参的是堆栈地址，形参在函数内的修改会影响实参的修改
	public void change(String str,char[] ch,int a){  
		str="test ok";//形参变量只有在被调用时才分配内存单元，在调用结束时， 即刻释放所分配的内存单元。因此，形参只有在函数内部有效。
		ch[0]='t';
		a=2;
	}

}
