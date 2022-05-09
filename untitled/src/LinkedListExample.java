import java.util.*;
class Node {
    int value;
    Node next ;
    Node (int value ){
        this.value=value;
        this.next=null;
    }
  int length =0;
}

public class LinkedListExample {
    Node head = null;

     public void  addFirst(int value){
         Node newNode =new Node(value);
         if(head==null){
             head=newNode;
             return;
         }
         newNode.next= head;
         head =newNode;
     }
    public void addlast(int value){
         Node newNode1 =new Node(value);
         Node currNode = head;
         while(currNode.next!=null){
             currNode=currNode.next;
         }
         currNode.next=newNode1;
    }
     public void insertAtPos(int pos,int value){
      Node  newNode=new Node(value);
      if(pos==1){
          newNode=head;
       } else {
          Node curr = head;
          while(pos-2!=0){
           curr=curr.next;
           pos--;
          }
          Node nextNode=curr.next;
          curr.next=newNode;
          newNode.next=nextNode;
      }
    length++;
     }
    public void deleteAtPos(int pos){
        if(pos==1){
            head=head.next;
        } else {
            Node curr = new Node(head.value);
            while(pos-2!=0){
                curr=curr.next;
                pos--;
            }
            curr.next=curr.next.next;
          length--;
        }

        public void printLL(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.value+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListExample ll = new LinkedListExample();
        ll.addFirst(10);
        ll.printLL();
        ll.addlast(20);
        ll.printLL();
        ll.addlast(30);
        ll.printLL();
        ll.addlast(40);
        ll.printLL();
        ll.addlast(60);
        ll.printLL();
        ll.deleteAtPos(2);
        ll.printLL();









































//        ll.addFirst(30);
//        ll.printLL();
//        ll.addlast(40);
//        ll.printLL();
//        ll.addlast(50);
//        ll.printLL();
    }
}
