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
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Fenetre extends JFrame implements ActionListener {
    // JLabels
    private JLabel label = new JLabel ("Header");
    // JPanels
    private JPanel container = new JPanel ();
    private JPanel header = new JPanel ();
    private JPanel nextPage = new JPanel ();
    //Splits
    private JSplitPane split;
    private JSplitPane split2;
    // Buttons list
    private JButton next = new JButton("next");
    private ArrayList<Button> listeBoutons = new ArrayList<Button>();

    public Fenetre(){

        // window's parameters
        this.setTitle("Ma première fenêtre Java");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the window can closes
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // the window opens in fullscreen mode
        this.setVisible(true);
        this.getContentPane().setLayout(null);
        // ~

        Font police = new Font("Tahoma", Font.BOLD, 16);
        label.setFont(police);
        label.setForeground(Color.white);
        Color c = Color.decode("#373B39");

        header.add(label);
        header.setBounds(0,0,1600,120);
        header.setBackground(c);

        nextPage.setBackground(c);
        nextPage.setBounds(1450,120,150,800);

        container.setBackground(c);
        container.setBounds(0,120,1450,800);

        this.getContentPane().add(header);
        this.getContentPane().add(container);
        this.getContentPane().add(nextPage);

        container.setLayout (new GridLayout(3,4)); // 4 buttons on 3 lines

        // Buttons creation
        for (int i = 0 ; i<12;i++){
            Button bouton = new Button("button"+i);
            listeBoutons.add(bouton);
            System.out.println("Array List :\n" + listeBoutons.get(i).getName());
        }
        // Buttons set up

        for (int i = 0 ; i<12;i++){
            Button bouton = listeBoutons.get(i);
            container.add(bouton);
            bouton.addActionListener(this);
        }

        listeBoutons.get(0).setIcon(new ImageIcon("../Images/StrangerThings.jpg"));

        nextPage.add(next);
        next.addActionListener(this);

        // ~
    }


    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == listeBoutons.get(0)){
            /**When we click on the button, we execute a bash command.
            * It will be useFul to launch a movie.
            */

            label.setText("bouton 1");
            listeBoutons.get(0).setForeground(Color.white);
            try{
                Process proc=Runtime.getRuntime().exec("vlc");
            }
            catch(IOException e){
                System.out.println("Problème lors de l'ouverture du fichier lié au bouton");
            }
        }

        if(arg0.getSource() == listeBoutons.get(1)){
            label.setText("bouton 2");
        }
        if(arg0.getSource() == listeBoutons.get(2)){
            label.setText("bouton 3");
        }
        if(arg0.getSource() == next){
            label.setText("Page suivante");
            listeBoutons.get(10).setIcon(new ImageIcon("../Images/Bioshock.jpg"));

        }

        }

    }
