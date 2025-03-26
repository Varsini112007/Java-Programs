public class Queue{
	int SIZE=5;
	int items[]=new int[SIZE];
	int front,rear;
	Queue(){
		front=-1;
		rear=-1;
	}

//check if the queue is full
Boolean isFull(){
	if(front==0&&rear==SIZE-1){
	return true;
}
	return false;
}
//check if the queue is empty
Boolean isEmpty(){
	if(front==-1)
		return  true;
	else
		return false;
}
//insert elements to the queue
void enQueue (int element){
//if queue is full
if (isFull()){
System.out.println("QUEUE IS FULL");
}
else{
if (front==-1){
//mark front denote first element of queue
front=0;	}
rear++;
//insert element at the rear
items[rear]=element;
System.out.println("Insert"+element);
	}
}
//delete elemnt from the queue
int deQueue(){
int element;
//if queue is empty
if(isEmpty()){
	System.out.println("Queue is empty");
	return(-1);
}
else{
//remove elemnt from the front of queue
element=items[front];
//if the queue has only one element
if (front>=rear){
	front=-1;
	rear=-1;
}
else{
//mark next element as the front
front++;
}
System.out.println(element+"Deleted");
return(element);	}
}
//display elememnt of the queue 
void display(){
	int i;
	if (isEmpty ()){
		System.out.println("Empty Queue");}
else{
//dislay the front of the queue 
System.out.println("\n Front index->"+front);
//display element of the queue
System.out.println("Item->");
for(i=front; i<+rear; i++)
System.out.print(items[i]+"  ");
//display the rear of the queue
System.out.println("\n Rearindex->"+rear);
	}
}
public static void main(String[]args){
//create an object of Queue class
Queue q=new Queue();
//try to delete element from the queue 
//currently queue is empty
//so deletion is not possible
q.deQueue();
//insert element to the queue
for(int i=1; i<6; i++){
q.enQueue(i);
}
//6th element cant't be added to queue
q.enQueue(6);
q.display();
q.deQueue();
q.display();
}
}
