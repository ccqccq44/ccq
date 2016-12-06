package ccq;

import net.sf.json.util.NewBeanInstanceStrategy;


public class Test {

	public static void main(String[] args) {
		/*public static void main(String args[])
	    {
	        Scanner cin = new Scanner(System.in);
	        int size, b;
	        while(cin.hasNextInt()){
	            size = cin.nextInt();
	        }
	          Chain chain=new Chain();
	          for(int i=0;i<size;i++){
	              i = cin.nextInt();
	              Node node = new Node(i){};
	              chain.add(node);
	          }
	    }*/
		Node node1=new Node();
		node1.a=1;
		node1.nextNode=null;
		Node node2=new Node();
		node1.a=2;
		node1.nextNode=node1;
		Chain chain=new Chain();
		chain.addNode(node1);
		chain.addNode(node2);
		System.out.println(chain);
	}

}
class Chain{
	private Node head; // 头节点
	private int size; // 链表的实体（即节点的数量
	public int getSize() {
		return this.size;
	}
	public void addNode(Node node) {        
         if (head != null) { 
             head = new Node(node.a,head);
             size++;       
         } else {
             head = new Node(node.a,null);
             size++;
         }         
     }
}
class Node{
	int a;
	Node nextNode;
	public Node(){};
	public Node getNextNode(){
		return this.nextNode;
	}
	public Node(int a){
		this.a=a;
	}
	public Node(int a,Node na){
		this.a=a;
		this.nextNode=na;
	}
}
