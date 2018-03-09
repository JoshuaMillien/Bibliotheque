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
    private ArrayList<Boutons> buttons;
    
    public Fenetre(){

        this.buttons= new ArrayList<Boutons>();
        this.heightHeader = 120;
        Font police = new Font("Tahoma", Font.BOLD, 16);
        label.setFont(police);

        header.add(label);
        header.setBounds(0,0,width,heightHeader);
        header.setBackground(Color.red);

        //nextPage.add(next);
        nextPage.setBackground(Color.red);
        
        container.setBackground(Color.yellow);
        container.setBounds(0,120,width-120,height-heightHeader);

        frame.getContentPane().add(container);
        this.frame.getContentPane().add(nextPage);
        container.setLayout (new GridLayout(3,4)); // 4 buttons on 3 lines
        // Buttons set up

        

        next.addActionListener(this);

        // ~
    }


    public void actionPerformed(ActionEvent arg0) {
        

        }
    
    public void display() {
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the window can closes
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // the window opens in fullscreen mode
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
    }

    public void addButtons() {
    	for (int i =0;i<6;i++) {
    		Boutons button = new Boutons("button " + i);
    		this.container.add(button);
    		button.addActionListener(this);
    	}
    	

    }
}


