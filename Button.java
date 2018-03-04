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

public class Button extends JButton{
  private String name;
  public Button(String str){
    super(str);
    this.name = str;
  }

  public String getName(){
      return this.name;
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
