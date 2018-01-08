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
  private String name;
  private Image img;
  public Boutons(String str){
    super(str);
    this.name = str;
    this.setForeground(Color.white);
    /*try {
      img = ImageIO.read(new File("../Images/StrangerThings.jpg"));
    } catch (IOException e) {
      e.printStackTrace();
  }*/
  }

  public Boutons (String str, Color c){
      super(str);
      this.name = str;
  }

  public Image getImage(){
      return this.img;
  }




  public void paintComponent(Graphics g){
      // This function allows the image to appear in the button
      Graphics2D g2d = (Graphics2D)g;

          GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
          g2d.setPaint(gp);

          g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

          g2d.setColor(Color.red);

          g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 /4), (this.getHeight() / 2) + 5);}

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
