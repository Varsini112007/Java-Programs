public class Binary Search Tree{
	class node{
		int key;
		Node left,right;
		public Node(int item){
			key=item;
			Left=right=null;
		}
}
Node root;
Binary Search Tree(){
	root=null;
}
void insert(int key){
	root=insert Rec(root,key);
}
Node insert Rec(Node root,int key){
	if(root==null){
		root=new node(key);
		return root;
	}
if(key<root.key)
	root Left=insert Rec(root.Left,key);
else if (key>root.key)
	root.right=insert Rec(root.right,key);
return root;
}void print Tree(){
	print Tree(root);
}
void PrintTree(Node node)
{
if(node!=null){
print Tree(node left);
System.out.print(node.key+" ");
print Tree(node,right);
}
}
public static void main(String[]args){
Binary Search Tree tree=new Binary Search Tree();
	tree.insert(50);
	tree.isert(30);
	tree.insert(20);
	tree.insert(40);
	tree.insert(70);
	tree.insert(60);
	tree.insert(80);
System.out.println("Binary Search Tree:");
	tree.printTree();
}
}
	