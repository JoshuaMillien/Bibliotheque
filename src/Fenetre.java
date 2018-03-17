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
    private JPanel previousPage = new JPanel ();
    
    // Buttons list
    private JButton next = new JButton("next");
    private JButton previous = new JButton("previous");
    
    private ArrayList<Button> buttons;
    private File[] movies;
    
    Font police = new Font("Tahoma", 0, 30);
    
    public Fenetre(){

        this.buttons= new ArrayList<Button>();
        this.heightHeader = 120;

    }
/*
    boolean bName;
    Pattern uName = Pattern.compile("[a-zA-Z0-9_.+-]+\\.pdf");
            Matcher mUname = uName.matcher(fileName);
            bName = mUname.matches();
         if (bName) {
            
               System.out.println(mUname.group());
           }

}}}
  */  
    
    public void displayMovies() {
    	try{
			File directory = new File("/home/jmillien/Vidéos/");
			File[] files = directory.listFiles();

			for(int k = 0; k < files.length ; k++){

				String fileName = files[k].getName();
				System.out.println(fileName);
				
				// if the file is a directory, list it
				if (files[k].isDirectory()) {
					System.out.println("Directory !! " + files[k].getName());
					File repertoire = new File("/home/jmillien/Vidéos/"+files[k].getName());
					File[] fichier = repertoire.listFiles();

					for(int i = 0; i < fichier.length ; i++){

						String file_name = fichier[i].getName();
						System.out.println(file_name);
					}
				}
				
			}

    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    }

    public void actionPerformed(ActionEvent arg0) {
    	
    	
    	for (int i =0;i<buttons.size();i++) {
    		if (arg0.getSource()==buttons.get(i)) {
    			label.setText(buttons.get(i).toString());
    			try {
    				
    				Process proc=Runtime.getRuntime().exec("vlc --fullscreen --audio ");//+ film);
                }
                catch(IOException e){
                    System.out.println("Problème lors de l'ouverture du fichier lié au bouton");
                }
    		}
    	}
    	if (arg0.getSource()==next) {
    		// add of the next 12 buttons and refresh the display
    		for (int i =0;i<12;i++) {
    			Button button = new Button("button" + buttons.size());
        		buttons.add(button);
        		button.addActionListener(this);
        		// replacement of the previous 12 buttons
        		for (int j = 0;j<buttons.size()-12;j++) {
        			container.remove(buttons.get(j));
        		}
        		container.add(button);
        		
    		}
    		frame.setVisible(true); // refresh the display without bug
    		
    	}

    }
    
    public void display() {
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the window can closes
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // the window opens in fullscreen mode
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        
        label.setFont(police);
        label.setForeground(Color.WHITE);
        
        header.add(label);
        header.setBounds(0,0,width,heightHeader);
        header.setBackground(Color.decode("#373B39"));
       
        previousPage.setLayout(new BorderLayout());
        previousPage.add(BorderLayout.CENTER, previous);
        previousPage.setBackground(Color.red);
        previousPage.setBounds(100,120,120,height-heightHeader);
       
        nextPage.setLayout(new BorderLayout());
        nextPage.add(BorderLayout.CENTER, next);
        nextPage.setBackground(Color.red);
        nextPage.setBounds(width-120,120,120,height-heightHeader);
        
        container.setBackground(Color.yellow);
        container.setBounds(0,120,width-120,height-heightHeader);

        frame.getContentPane().add(header);
        frame.getContentPane().add(container);
        frame.getContentPane().add(nextPage);
        frame.getContentPane().add(previousPage);

        container.setLayout (new GridLayout(3,4)); // 4 buttons on 3 lines
 
        next.addActionListener(this);
    }

    public void addButtons() {
    	next.setBackground(Color.decode("#373B39"));
        next.setForeground(Color.WHITE);
        next.setFont(police);
    	
    	for (int i =0;i<12;i++) {
    		Button button = new Button("button" + i);
    		buttons.add(button);
    		button.addActionListener(this);
    		container.add(button);
    	}
    }
    
    public void displayList() {
    	for (Button b : buttons)
    		System.out.println(b.toString());
    	}
}



