package Wissen_Interview;


public class LoopLinkedList 
{
   
    public static class ListNode
    {
        int val;   // value in current node
        ListNode next;  // address of next node

        ListNode(int x)
        {
            val = x;  // setting given x value in the current list
            next = null; //initialize the next node address to null
          
        }
 
    }
    //method of LoopLinkedList class
    public boolean hasCycle(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return false;
            
        }
        
        ListNode slow = head; // slow pointer
        ListNode fast = head.next; //faster pointer

        while (slow != fast)
        {
            if (fast == null || fast.next ==null)  // if the next element or net to next is null then its the end of linkedlist
            {
                return false;
                
            }
            slow = slow.next; //increment the slow pointer
            fast = fast.next.next; //increment the fast pointer
            
        }


        return true; //loop detected
    }


    public static void main(String[] args) 
    {
        //making of the listNodes
        ListNode head = new ListNode(1); // variable named head of type ListNode and object of Listnode using constructor
        
        head.next =new ListNode(2); //  Accesses the next field of the head node and node has value 2
        head.next.next = new ListNode(3); 
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; //created a loop


        LoopLinkedList lll = new LoopLinkedList(); //objet of LoopLinkedList

        boolean sol = lll.hasCycle(head); //calling the method

        if ( sol == true)
        {
            System.out.println("It contains a loop");
            
        }
        else
        {
            System.out.println("It does not contain a loop");
        }


    }
    
    
}
