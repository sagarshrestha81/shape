import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Work extends JComponent {
	JFrame f= new JFrame();
	public void paint(Graphics g) 
	{  
		 g.setColor(Color.YELLOW);
		   g.fillOval(120, 30, 160, 160);

		g.setColor(Color.BLACK);
	    g.fillOval (150, 70, 30, 30);  
	    g.fillOval (210, 70, 30, 30);
	    g.drawArc(145, 90, 100, 70, 175, 185);
   
	

	    }
}

public class ShapeDemo 
{
	public static void main(String[] args) 
	{//Frame
		JFrame f = new JFrame();
		f.setTitle("Shape");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);
		
//		//Checkpoint of oval
//		JCheckBox oval = new JCheckBox("Oval");
//		oval.setBounds(0, 0, 50, 50);
//		
//		f.add(oval);
//		//Checkpoint Rectangle
//		JCheckBox rectangle = new JCheckBox("Rectangle");
//		rectangle.setBounds(0, 32, 85, 50);
//		rectangle.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				
//			}
//		});
//		
//		f.add(rectangle);
//		
		//font
		Font font = new Font("SansSerif", Font.ITALIC, 25);
		// text
		JLabel smile = new JLabel("Smile");
		smile.setBounds(155, 170, 120, 125);
		f.add(smile);
		smile.setFont(font);
	    f.getContentPane().add(new Work());
		f.setVisible(true);

	}
}

