import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.Image;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Dimension;




public class Fenetre implements ActionListener {

	Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	int height = (int)dimension.getHeight();
	int width  = (int)dimension.getWidth();
	private int heightHeader;
	
	private JFrame frame = new JFrame("Movie library");
    
	// JLabels
    private JLabel label = new JLabel ("Header");
    
    // JPanels
    private JPanel container = new JPanel ();
    private JPanel header = new JPanel ();
    private JPanel nextPage = new JPanel ();
    
    // Buttons list
    private JButton next = new JButton("next");
    private ArrayList<Button> buttons;
    
    public Fenetre(){

        this.buttons= new ArrayList<Button>();
        this.heightHeader = 120;

    }


    public void actionPerformed(ActionEvent arg0) {
    	if (arg0.getSource()==("button 1"))
    		label.setText("button 1");

    }
    
    public void display() {
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the window can closes
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // the window opens in fullscreen mode
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        
        Font police = new Font("Tahoma", Font.BOLD, 16);
        label.setFont(police);
        
        header.add(label);
        header.setBounds(0,0,width,heightHeader);
        header.setBackground(Color.red);

        nextPage.add(next);
        nextPage.setBackground(Color.red);
        nextPage.setBounds(width-120,120,120,height-heightHeader);
        
        container.setBackground(Color.yellow);
        container.setBounds(0,120,width-120,height-heightHeader);

        frame.getContentPane().add(header);
        frame.getContentPane().add(container);
        frame.getContentPane().add(nextPage);

        container.setLayout (new GridLayout(3,4)); // 4 buttons on 3 lines
 
        next.addActionListener(this);
    }

    public void addButtons() {
    	for (int i =0;i<12;i++) {
    		Button button = new Button("button " + i);
    		buttons.add(button);
    		button.addActionListener(this);
    		container.add(button);
    	}
    }
    
    public void displayList() {
    	for (Button b : buttons) {
    		System.out.println(b.toString());
    	}
    }
}


