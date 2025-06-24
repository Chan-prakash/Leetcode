package hardlevelBetterApproach;


class ListNode{
	int data ;
	ListNode next;
	
	ListNode(int data){
		this.data=data;
	}
	
	ListNode(int data ,ListNode next){
		this.data=data;
		this.next=null;
	}

}
public class middleNode {
	
	ListNode head;
	
	public void insertAtBeginning(int val) {
		ListNode newNode = new ListNode(val);
		ListNode temp;
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		   }	
		}
	public void display(ListNode head) {
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(" "+temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	public ListNode middlelement() {
		
		 int count=0;
		 ListNode temp=head;
		 
		 while(temp!=null) {
			 count++;
			 temp=temp.next;
			
		 }
		 
		 int mid=((count)/2);
		 
		 temp = head;
		    for (int i = 0; i < mid; i++) {
		        temp = temp.next;
		    }
		 
		 head=temp;
		 
		 return head;
		 
	}
	
	public ListNode tortoisehare() {
	    ListNode slow = head;
	    ListNode fast = head;

	    // Move fast by 2 and slow by 1 until fast reaches the end
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    // Slow is now at the middle
	    head = slow; // update head to middle node

	    return head;
	}

	public static void main(String[] args) {
		middleNode ans=new middleNode();
		ans.insertAtBeginning(10);
		ans.insertAtBeginning(3);
		ans.insertAtBeginning(6);
		ans.insertAtBeginning(8);
		ans.insertAtBeginning(2);
		
		
		
		
		ListNode optimized = ans.tortoisehare();
		ans.display(optimized);
		
 
	}
}
