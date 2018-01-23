import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Clock {

	private static final int RAYON = 30;

	public void draw(Graphics g, int mouseX, int mouseY) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.grey);
		g2.fillOval(mouseX, mouseY, RAYON, RAYON);
	}
}
