import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestRepaint extends JFrame{
	Random r = new Random();
	List<Rectangle> list = new ArrayList<>();
	MouseEvent e;
	
	public TestRepaint()
	{
		add(new MousePanel());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);
	}
	
	class MousePanel extends JPanel{
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					if(TestRepaint.this.e != null) {
						if(TestRepaint.this.e.equals(e))
							return;
					}
					
					int w = r.nextInt(20)+5;
					int x = r.nextInt(350);
					int y = r.nextInt(150);
					list.add(new Rectangle(x,y,w,w));
					
					repaint();
					
					TestRepaint.this.e = e;
				}
			});
			
			for(int i=0; i<list.size()-1; i++)
			{
				Rectangle r = list.get(i);
				int x = (int)r.getX();
				int y = (int)r.getY();
				int l = (int)r.getWidth();
				g.drawRect(x, y, l, l);
			}
		}
	}
}
