

class NodeDLL{
    int value;
    NodeDLL next;
    NodeDLL prev;
    NodeDLL(int value){
        this.value = value;
    }
}
public class DoubleLL {
    NodeDLL head = null;
    NodeDLL tail = null;
    int length = 0;

    void insertAtPos(int pos, int value) {
        if (pos < 1 || pos > length + 1) return;

        int tempPos = pos;
        NodeDLL newNode = new NodeDLL(value);
        if (pos == 1) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            head = newNode;
        } else {
            NodeDLL curr = head;
            while (pos - 2 != 0) {
                curr = curr.next;
                pos--;
            }
            NodeDLL temp = curr.next;
            newNode.next = temp;
            curr.next = newNode;
            if (temp != null) temp.prev = newNode;
            newNode.prev = curr;
        }
        length++;
        if (length == tempPos) tail = newNode;
    }

    void printSLL() {
        NodeDLL curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void deleteAtPos(int pos){
        if(pos<1 || pos>length){
            System.out.println("Invalid index to delete");
            return;
        }
        if(pos==length) tail = tail.prev;
        if(pos==1){
            NodeDLL temp = head;
            head = head.next;
            head.prev = null; // extra
            temp.next = null;
        }else{
            NodeDLL curr = head;
            while (pos-2!=0){
                curr = curr.next;
                pos--;
            }
            NodeDLL temp = curr.next;
            curr.next = curr.next.next;
            if(temp.next!=null) temp.next.prev = curr; //extra
            temp.next = null;
            temp.prev = null;//extra
        }
        length--;
    }
    void printDLL() {
        NodeDLL curr = tail;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.insertAtPos(1, 10);
        dll.insertAtPos(2, 20);
        dll.insertAtPos(3, 30);
        dll.insertAtPos(4, 999);
        dll.insertAtPos(5, 88);
        dll.insertAtPos(6, 8745);
        dll.printSLL();
//        dll.printDLL();
        dll.deleteAtPos(4);
        dll.printSLL();



























    }
}
