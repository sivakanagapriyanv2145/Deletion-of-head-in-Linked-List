class Node{
    int data;
    Node next;
     Node(int data) {  
        this.data = data;
        this.next = null;
    }
}
public class DeleteFirst{
    private static Node convert(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        int i;
        for(i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static Node delete(Node head){
       
        if(head==null)
            return head;
        
        return head.next;
        
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        Node head=convert(arr);
     head=delete(head);
        System.out.print(head.data);
    }
}
