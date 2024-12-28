package Design;
public class MinStack {
    Node head;

    private class  Node {
    int val;
    int min;
    Node next;
    Node(int val){
        this.val = val;
    } 
    
    }
    
public MinStack(){

}

public void push(int val){
    if(head == null){
        head = new Node(val);
        head.min = head.val;
        return;
    }
    Node node = new Node(val);
    node.next = head;
    node.min = Math.min(head.min, node.val);
    head = node;
}

public void pop(){
    head = head.next;
}

public int top(){
 return head.val;
}

public int getMin(){
    return head.min;
}

public static void main(String[] args) {
    MinStack obj = new MinStack();
    obj.push(1);
    obj.push(8);
    obj.push(6);
    // obj.pop();
    int min = obj.getMin();
    int top = obj.top();
    System.out.println("min in the obj is: "+min+ " and the top element is: "+top);
    //first came in Design directory then run

}


}

