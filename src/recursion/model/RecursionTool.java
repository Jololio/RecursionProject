package recursion.model;

import recursion.controller.RecursionController;

public class RecursionTool 
{
	public int calculateFactorial(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber ==1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public int calculateIterativeFib()
	{
		
		int n1=0,n2=1,n3,i,count=10;    
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;++i)
		{    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		}    
		
		
		
	}
	
	public int calculateIterativeFact(int a, int n)
	{
		 int i;
		 int result = 1;

		 for(i = 0 ; i < n ; i++)
	     {
			 result = result*a;              
	     }
		 return result;
	}
	
	
	public RecursionTool(RecursionController baseController)
	{
		
	}
	
	
}
