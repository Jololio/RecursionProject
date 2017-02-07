package recursion.view;

import recursion.controller.RecursionController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JTextField textField;
	private JButton fibButton;
	private JButton factButton;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		textArea = new JTextArea(5, 15);
		textField = new JTextField(15);
		fibButton = new JButton("fib");
		factButton = new JButton("fact");
		
		
		setupLayout();
		setupDisplay();
		setupPanel();
		setupListeners();
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 32, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 86, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -113, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -104, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, textArea);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 123, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, factButton, -25, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, 0, SpringLayout.EAST, textArea);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 0, SpringLayout.WEST, textArea);
	}
	
	private void setupDisplay()
	{
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(textArea);
		this.add(textField);
		this.add(factButton);
		this.add(fibButton);
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				textArea.setText(baseController.transferFactorial(textField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				textArea.setText(baseController.transferFibonacci(textField.getText()));
			}
		});
		
		
	}

}
