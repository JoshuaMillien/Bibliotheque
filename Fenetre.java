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
    private Boutons button = new Boutons ("1");
    private Boutons button2 = new Boutons ("2");
    private Boutons button3 = new Boutons ("3");
    private Boutons button4 = new Boutons ("4");
    private Boutons button5 = new Boutons ("5");
    private Boutons button6 = new Boutons ("6");
    private Boutons button7 = new Boutons ("7");
    private Boutons button8 = new Boutons ("8");
    private Boutons button9 = new Boutons ("9");
    private JButton button10 = new JButton ("10");
    private JButton button11 = new JButton ("11");
    private JButton button12 = new JButton ("12");

    Graphics g;
    Graphics2D g2d = (Graphics2D)g;

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
        // Buttons set up

        container.add(button); // the first button has stranger things background
        button.addActionListener(this);

        container.add(button2); // the first button has stranger things background
        button2.addActionListener(this);

        container.add(button3); // the first button has stranger things background
        button3.addActionListener(this);

        container.add(button4); // the first button has stranger things background
        button4.addActionListener(this);

        container.add(button5); // the first button has stranger things background
        button5.addActionListener(this);

        container.add(button6); // the first button has stranger things background
        button6.addActionListener(this);

        container.add(button7); // the first button has stranger things background
        button7.addActionListener(this);

        container.add(button8); // the first button has stranger things background
        button8.addActionListener(this);

        container.add(button9); // the first button has stranger things background
        button9.addActionListener(this);

        container.add(button10); // the first button has stranger things background
        button10.addActionListener(this);

        container.add(button11); // the first button has stranger things background
        button11.addActionListener(this);

        container.add(button12); // the first button has stranger things background
        button12.addActionListener(this);

        nextPage.add(next);
        next.addActionListener(this);

        // ~
    }


    public void actionPerformed(ActionEvent arg0) {
        //Lorsque l'on clique sur le bouton, on met à jour le JLabel
        if(arg0.getSource() == button){
            label.setText("bouton 1");
            button.setForeground(Color.white);
        }

        if(arg0.getSource() == button2){
            label.setText("bouton 2");
        }
        if(arg0.getSource() == button3){
            label.setText("bouton 3");
        }
        if(arg0.getSource() == next){
            label.setText("Page suivante");
        }

        }

    }
