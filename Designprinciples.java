package manasamudiraj_designprinciples;
import java.util.Scanner;
public class Epam_task3{
	public static void display(int result) {
		System.out.println(result);
	}
	public static int addition(int p,int q) {
		return p+q;
	}
	public static int subtraction(int p,int q) {
		return p-q;
	}
	public static int multiplication(int p,int q) {
		return p*q;
	}
	public static int division(int p,int q) {
		return p/q;
	}
	public static int modulo(int p,int q) {
		return p%q;
	}
	public static void operation(char operand,int x,int y) {
		int ans=0;
		int flag=1;
		if(operand=='+') {
			ans=addition(x,y);
					}
		else if(operand=='-') {
			ans=subtraction(x,y);
		}
		else if(operand=='*') {
			ans=multiplication(x,y);
		}
		else if(operand=='/') {
			if(y!=0) {
				ans=division(x,y);
			}
			else {
				System.out.println("Operation is not possible with divisor 0");
				flag=0;
			}
		}
		else if(operand=='%') {
			if(y!=0) {
			ans=modulo(x,y);
			}
			else {
				System.out.println("Operation is not possible with divisor 0");
				flag=0;
			}
			
		}
		else {
			flag=0;
			System.out.println("Please enter arithmetic operand");
		}
		if(flag==1) {
			display(ans);
		}
		
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter operands");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.println("enter arithmetic operand");
		char operand=(obj.next()).charAt(0);
		operation(operand,a,b);

	}
}# PEP-Task3
# PEP-Task3
# PEP-Task1
