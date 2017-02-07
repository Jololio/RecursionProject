package recursion.controller;

import recursion.view.RecursionFrame;
import recursion.model.Timer;
import javax.swing.JOptionPane;

import recursion.model.RecursionTool;



public class RecursionController 
{
	private RecursionFrame baseFrame;
	private RecursionTool recursionTool;
	private Timer mathTimer;
	
	
	public RecursionController()
	{
		baseFrame = new RecursionFrame(this);
		recursionTool = new RecursionTool(this);
		mathTimer = new Timer();
	
	}
	
	public void start()
	{
		
	}
	
	public String transferFactorial(String input)
	{
		String factorialInfo = "The factorial of " + input + " is";
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += recursionTool.calculateFactorial(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		factorialInfo += "\n" + mathTimer.toString();
		
		return factorialInfo;
	}
	
	public String transferFibonacci(String input)
	{
		String fibonacciInfo = "";
		
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibonacciInfo += recursionTool.calculateFibonacci(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		fibonacciInfo += "\n" + mathTimer;
		
		return fibonacciInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			int test = Integer.parseInt(testValue);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid number >= 0");
			return false;
		}
	}
	
}
