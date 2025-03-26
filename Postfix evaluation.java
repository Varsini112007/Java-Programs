import java.util.stack;
public class Postfix evaluation{
	public static int evaluatePostfix(String expression){
		Stack<Integer>stack=new stack<>();
		for(int i=0; i<expression.length(); i++){
			Char ch=expression.CharAt(i);
			if(character.isDigit(ch)){
				Stack.push(ch-'0');
			}
			else{
				int operand2=Stack.pop();
				int operand1=Stack.pop();
				Switch(ch){
					case'+':
						Stack.push(operand1+opearand2);
						braek;
					case'-':
						Stack.push(operand1-operand2);
						break;
					case'*':
						Stack.push(operand1*operand2);
						break;
					case'/':
						Stack.push(operand1/operand2);
						break;
				}
			}	
		}
		return stack.pop();
		}
		public stataic void main(String[] args){
			String PostfixExpression="231"+9-";
			int result=evaluate Postfix(postfixExpression);
			System.out.println("The result of the postfix expression\""+PostfixExpression+"\"is:"+result);
		}
}
					