package com.sebone.program.basic;//package name alsway small letters
//Don;t give more than 6-8 char
import java.util.Scanner;
/*
*class name:FibonacciSeries
* objective:this class is created for  count digit
* author:Nishchhal Prajapati 
* Date 17/03/2022
*/
public class CountDigit {
	
	/*
	 * function name:getCountDigits
	 * objective:this is a countAllDigits function created for count digit of a given number 
	 * @param: input int number
	 * @return : int value
	 *  
	  */
	public int getCountDigits(int number) {
		int countNumber=0;
		if(number==0) {
			return 1;
		}
		while(number>0) {
			countNumber++;
			number=number/10;
		}
		return countNumber;
	} 
	/*
	 * function name:main
	 * objective:this is a main function 
	 * author:Nishchhal Prajapati 
	 * Date:17/03/2022
	 */
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		CountDigit countDigit=new CountDigit();
		//count digit function
		int countNumber=countDigit.getCountDigits(number);
		System.out.println("digits in "+number+" is "+countNumber);
		scanner.close();
	}
}

