// Brute Force Approach//
// TC--> O(N+N/2)
// SC--> O(1)

// class Node{
//     int data;
//     Node next;
//     Node(int data1,Node next1){
//         this.data=data1;
//         this.next=next1;
//     }
//     Node(int data2){
//         this.data=data2;
//         this.next=null;
//     }
// };
// public class findMiddleElement{
//     private static Node middleElement(Node head){
//         if(head==null || head.next==null){ // Edge cases//
//             return head;
//         }
//         Node temp=head;
//         int cnt=0;
//         while(temp!=null){
//             cnt++;
//             temp=temp.next;
//         }
//         int mid=cnt/2+1;
//         temp=head;
//         while(temp!=null){
//             mid=mid-1;
//             if(mid==0)
//             break;
//             temp=temp.next;   
//         }
//         return temp;
//     }
//     public static void main(String[] args){
//         Node head=new Node(1);//creating nodes and adding the values
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=new Node(4);
//         head.next.next.next.next=new Node(5);
//         Node mid=middleElement(head);
//         System.out.print("The middle element of the Linked List is:" +mid.data);
//     }
   
// }


//Optimal Solution//
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data2){
        this.data=data2;
        this.next=null;
    }
};
public class findMiddleElement{
    private static Node middleElement(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        Node mid=middleElement(head);
        System.out.print("The middle Element is:" + mid.data);
    }
}