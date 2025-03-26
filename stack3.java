class StackNode{
    int data;
    StackNode next;
    StackNode(int data) {
        this.data=data;
        this.next=null;
    }
}
class Stack{
    private StackNode top;
    public Stack(){
        this.top= null;
    }
    public void push(int data) {
        StackNode newNode =new StackNode(data) ;
        if(top==null) {
            top=newNode;
        }else{
            newNode. next=top;
            top=newNode;
        }
        System. out. println(data+"pushed to stack ");
        }
        public int pop(){
            if(isEmpty()){
                System. out.println("stack underflow");
                return-1;
            }
            int poppedData=top. data;
            top=top. next;
            return poppedData;
        }
        public int peek(){
            if(isEmpty()){
                System. out. println("stack is empty");
                return-1;
            }
            return top.data;
        }
        public boolean isEmpty(){
            return top==null;
        }
        public void display(){
            if(isEmpty()){
                System. out. println("stack is empty");
                return;
            }
            StackNode current=top;
            System.out.println("Stack element:");
            while(current!=null) {
                System.out.println(current. data) ;
                current=current.next;
            }
        }
    }
    public class stack3{
        public static void main(String[] args) {
            Stack stack3=new Stack();
            stack3.push(10);
            stack3.push(20);
            stack3.push(30);
            stack3.display();
            System.out.println("top element is:"+stack3.peek()) ;
            System.out.println("top elemenut is!:"+stack3.peek());
            System.out.println(stack3.pop()+"popped from stack ");
            stack3.display();
        }
    }

