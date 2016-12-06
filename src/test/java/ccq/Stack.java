package ccq;
public class Stack {
	
    int[] data;
    public int size;
    public int top=-1;
    
    public Stack(int size) {
        this.size = size;
        this.data = new int[size];
    }
    public void push(int data) {       
        top++;
        this.data[top] = data;    
    }
    public int pop() {       
       return this.data[top--];     
    }

    /*public static void main(String[] args) {
        Stack stack = new Stack(20);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        for (int i = 0; i < 4; i++) {
        	System.out.println(stack.pop());
		}
    }*/
}