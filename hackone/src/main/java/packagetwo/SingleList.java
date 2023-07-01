package packagetwo;

import java.util.Stack;

public class SingleList {
	static Node head = null;
	static class Node{
		int data;
		Node next;
		
		Node (int data){
			this.data=data;
			this.next=null;
		}
	}
	void insertFirst(int data) {
		Node n1 = new Node(data);
		if(head==null) {
			head = n1;
		} else {
			n1.next = head;
			head = n1;
		}
	}
	void insertAtLast(int data) {
		Node n1 = new Node(data);
		Node ptr = head;
		if(head==null) {
			head=n1;
			return;
		}
		else {
		while(ptr.next!=null) {
			
			ptr = ptr.next;
		}
		}
		ptr.next = n1;
		
	}
	void display() {
		//Node head = 
		if(head==null) {
			System.out.println("empty");
		}
		else {
			Node n1 = head;
			while(n1!=null) {
				System.out.print(n1.data + "->");
				n1=n1.next;
			}
		}
		System.out.println();
	}
	
	void search(int key) {
		Node n1 =head;
		int count = 0;
		
		while(n1!=null) {
			count++;
			if(n1.data==key) {
				System.out.println("elemen at " + count);
			}
		n1=n1.next;	
		}
	}
	
	int size() {
		Node n1 = head;
		int count = 0;
		while(n1!=null) {
			count++;
			n1=n1.next;
		}
		return count;
	}
	
	void insertAtPosition(int data, int pos) {
		if(pos>size()) {
			System.out.println("Invalid pos");
		}
		else {
			Node n1 = new Node(data); //
			Node n2= head;
			
			int count = 1;
			while(count<pos-1) {  //1<3 ;; 2<3
				count+=1;
				n2=n2.next;
				
			}
			if(count==1) {
				n1.next = head;
				head=n1;
			}
			else {
				n1.next = n2.next;
				n2.next = n1;
				
			}
			//n1.next = n2.next.next;
		}
	}
	
	void reverse() {
		// prev curr <-1 2->3->4->5
		Node n1 = head;
		Node prev = null;
		Node curr = null;
		while(n1!=null) {
			curr=n1.next;
			n1.next = prev;
			prev = n1;
			n1 = curr;
		}
		head = prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleList sll = new SingleList();
		sll.insertAtLast(1);
		sll.insertAtLast(2);
		sll.insertAtLast(2);
		sll.insertAtLast(1);
		//sll.insertFirst(111);
		//sll.insertFirst(122);
		sll.display();
		//sll.search(12);
       // sll.insertAtPosition(333,6);
		//sll.display();
		//System.out.println("size-->" +sll.size());
		//sll.reverse();
		//sll.display();
		boolean result = sll.checkpalin(head);
		System.out.println(result);
		 
	}
	
	boolean checkpalin(Node head) {
		Stack<Integer> stack = new Stack<Integer>();
        Node slow = head;
        boolean result = true;
        while(slow!=null){
            stack.push(slow.data);
            slow=slow.next;
        }
        System.out.println(stack);
        Node traverse=head;
        while(traverse!=null){
        	
            int i = stack.pop();
            System.out.println("i" + i);
            if(i==traverse.data) { 
                result = true;
            }
            else{
                result=false;
                break;
            }
            
            traverse=traverse.next;
        }
        return result;
    }

	

}
