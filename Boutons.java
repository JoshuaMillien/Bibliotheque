import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Boutons extends JButton{
	private static int id=-1;
	private String name;
	private Image img;
  
	public Boutons(String str){
    
		super(str);
		this.name = str;
		this.id++;
		try {
			img = ImageIO.read(new File("../../Images/Wallpapers/Arrow_BD.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Image getImage(){
		return this.img;
	}



	public void paintComponent(Graphics g){
		// This function allows the image to appear in the button
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 /4), (this.getHeight() / 2) + 5);
  }

// Actions du bouton

    //Méthode appelée lors du clic de souris

    public void mouseClicked(MouseEvent event) {
        System.out.println("Appui sur le bouton");
    }


    //Méthode appelée lors du survol de la souris

    public void mouseEntered(MouseEvent event) {
        System.out.println("Bouton ...");
    }


    //Méthode appelée lorsque la souris sort de la zone du bouton

    public void mouseExited(MouseEvent event) { }


    //Méthode appelée lorsque l'on presse le bouton gauche de la souris

    public void mousePressed(MouseEvent event) {
        System.out.println("Appui sur le bouton");

    }


    //Méthode appelée lorsque l'on relâche le clic de souris

    public void mouseReleased(MouseEvent event) { }


}
