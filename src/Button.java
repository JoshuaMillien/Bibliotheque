import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button extends JButton {
	
	private static int id = -1;
	private BufferedImage img;
	private String name;
	
	public Button(String str) {
		super(str);
		this.name = str;
		this.id++;
		
		
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
	

}
