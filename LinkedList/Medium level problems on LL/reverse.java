// Brute force solution//
// import java.util.Stack;
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
// public class reverse{
//     private static Node reverseLL(Node head){
//         Node temp=head;
//         Stack<Integer> stack=new Stack<>();
//         while(temp!=null){
//             stack.push(temp.data);
//             temp=temp.next;
//         }
//         temp=head;
//         while(temp!=null){
//             temp.data=stack.pop();
//             temp=temp.next;
//         }
//         return head;
//     }
//     private static void print(Node head){
//         Node temp=head;
//         while(temp!=null){
//             System.out.print(temp.data +" ");
//             temp=temp.next;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Node head=new Node(1);
//         head.next=new Node(2);
//         head.next.next=new Node(3);
//         head.next.next.next=new Node(4);
//         head.next.next.next.next=new Node(4);
//         head=reverseLL(head);
//         print(head);
//     }
// }

// optimal solution//
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
public class reverse{
    private static Node reverseLL(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    private static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head=reverseLL(head);
        print(head);
    }
}