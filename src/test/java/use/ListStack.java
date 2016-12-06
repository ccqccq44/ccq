package use;

/** 
 * 表示链表的一个节点 
 * @author Adair 
 */  
class Node{  
  Object element;  
  Node next;  
    
  public Node(Object element) {  
      this(element, null);  
  }  
  
  public Node(Object element, Node node) {  
      this.element = element;  
      this.next = node;  
  }  
  
  public Object getElement() {  
      return element;  
  }  
  
  public void setElement(Object element) {  
      this.element = element;  
  }  
  
  public Node getNext() {  
      return next;  
  }  
  
  public void setNext(Node next) {  
      this.next = next;  
  }  
}  

public class ListStack {
	
	Node header;      //栈顶元素
	int elementCount; // 栈内元素个数
	int size;         // 栈的大小 
	/** 
	 * 构造函数，构造一个空的堆栈 
	 */  	
	public ListStack(){  
	    header = null;  
	    elementCount = 0;  
	    size = 0;  
	}
	/** 
	 * 通过构造器 自定义栈的大小 
	 * @param size 栈的大小 
	 */  
	public ListStack(int size){  
	    header = null;  
	    elementCount = 0;  
	    this.size = size;  
	}
    /** 
     * 设置堆栈大小 
     * @param size 堆栈大小 
     */  	
	public void setSize(int size){  
	    this.size = size;  
	}  
	/** 
	 * 设置栈顶元素 
	 * @param header 栈顶元素 
	 */  
	public void setHeader(Node header){  
	    this.header = header;  
	}  	
	/** 
	 * 获取堆栈长度 
	 * @return 堆栈长度 
	 */  
	public int getSize(){  
	    return size;  
	}  	
	/** 
	 * 返回栈中元素的个数 
	 * @return 栈中元素的个数 
	 */  
	public int getElementCount(){  
	    return elementCount;  
	}
	/** 
	 * 判断栈是否为空 
	 * @return 如果栈是空的，返回真，否则，返回假 
	 */  
	public boolean isEmpty(){  
	  if (elementCount == 0)  return true;  
	  return false;  
	}  	
	/** 
	 * 判断栈满 
	 * @return 如果栈是满的，返回真，否则，返回假 
	 */  
	public boolean isFull(){  
	  if (elementCount == size)  return true;  
	  return false;  
	}  	
	/** 
	 * 把对象入栈 
	 * @param value 对象 
	 */  
	public void push(Object value){  
	  if (this.isFull()){  
	    throw new RuntimeException("Stack is Full");  
	  }  
	  header = new Node(value, header);  
	  elementCount++;  
	}  
	/** 
	 * 出栈，并返回被出栈的元素 
	 * @return 被出栈的元素 
	 */  
	public Object pop(){  
	  if (this.isEmpty()){  
	    throw new RuntimeException("Stack is empty");  
	  }  
	  Object obj = header.getElement();  
	  header = header.getNext();  
	  elementCount--;  
	  return obj;  
	}   
	/** 
	 * 返回栈顶元素 
	 * @return 栈顶元素 
	 */  
	public Object peek(){  
	  if (this.isEmpty()){  
	    throw new RuntimeException("Stack is empty");  
	  }  
	  return header.getElement();  
	}  
}
