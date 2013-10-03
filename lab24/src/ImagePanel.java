import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel {
	@SuppressWarnings("unused")
	private String path;
	private Image img;
	
	public ImagePanel(Image i) throws IOException {
		this.img = i;
	}
	
	public ImagePanel(String path) throws IOException {
		this.path = path;
		img = ImageIO.read(new File(path));
	}
	
	public void paint(Graphics g) {
		if( img != null)
			g.drawImage(img,0,0, this);
	}
	
	public void setImage(Image i) throws IOException {
		this.img = i;
	}
}
