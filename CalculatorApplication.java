package Assignments;

import java.util.Scanner;

public class CalculatorApplication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Hello !Enter the number");
int firstNumber=sc.nextInt();

System.out.println("Enter the second number");
int secondNumber=sc.nextInt();

CalculatorIO val=new CalculatorIO();
val.setfirstNumber(firstNumber);
val.setsecondNumber(secondNumber);


Calculation calc=new Calculation();

int result=calc.addition(val.getfirstNumber(), val.getsecondNumber());
System.out.println("Addition result "+result);

int result2=calc.subtraction(val.getfirstNumber(), val.getsecondNumber());
System.out.println("Subtraction result "+result2);

int result3=calc.multiplication(val.getfirstNumber(), val.getsecondNumber());
System.out.println("Multiplication result "+result3);

int result4=(int) calc.division(val.getfirstNumber(), val.getsecondNumber());
System.out.println("Division result "+result4);

	}

}
