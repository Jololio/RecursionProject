package recursion.view;

import javax.swing.JFrame;
import recursion.view.RecursionPanel;
import recursion.controller.RecursionController;
import java.awt.Dimension;


public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel basePanel;
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Recursion");
		this.setSize(new Dimension(500, 500));
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
}
