/*
 * Rovio Test Program
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class RovioTest extends JFrame implements ActionListener {
	
	/**
	 * @param args
	 */
	
	public RovioControl rov = new RovioControl();
	public ImagePanel imgPanel = null;
	
	public RovioTest() {
		try 
		{			
			Container content = this.getContentPane();
			content.setLayout(new GridLayout(1,2));
			
			//The code below you may not change
			
			//add image panel
			imgPanel = new ImagePanel("pic.jpg");
			content.add(imgPanel);

			//add camera panel
			JPanel cameraPanel = new JPanel();
			cameraPanel.setBorder(BorderFactory.createTitledBorder("Camera Commands"));

			JButton c = new JButton("Update Image");
			c.setActionCommand("camera");
			c.addActionListener(this);			
			cameraPanel.add(c);
			

			/*
			You will change or add your code below for more actions
			*/

			//add driving panel
			JPanel drivingPanel = new JPanel();
			GridLayout gl = new GridLayout(5,4);
			gl.setHgap(10);
			gl.setVgap(10);
			drivingPanel.setLayout(gl);
			drivingPanel.setBorder(BorderFactory.createTitledBorder("Driving Commands"));
			
			JButton f = new JButton("Forward");
			JButton b = new JButton("Backward");
			JButton l = new JButton("Left");
			JButton r = new JButton("Right");
			JButton sh = new JButton("Set Home");
			JButton h = new JButton("Go Home");
			JButton s = new JButton("Stop");
			JButton dfl = new JButton("Diagonal Forward Left");
			JButton dfr = new JButton("Diagonal Forward Right");
			JButton dbl = new JButton("Diagonal Backward Left");
			JButton dbr = new JButton("Diagonal Backward Right");
			JButton rl = new JButton("Rotate Left");
			JButton rr = new JButton("Rotate Right");
			JButton rl2 = new JButton("Rotate Left 20 Degrees");
			JButton rr2 = new JButton("Rotate Right 20 Degrees");
			JButton hu = new JButton("Head Up");
			JButton hm = new JButton("Head Middle");
			JButton hd = new JButton("Head Down");
			
			f.setActionCommand("forward");
			f.addActionListener(this);	
			b.setActionCommand("backward");
			b.addActionListener(this);
			l.setActionCommand("left");
			l.addActionListener(this);
			r.setActionCommand("right");
			r.addActionListener(this);
			sh.setActionCommand("Set Home");
			sh.addActionListener(this);
			h.setActionCommand("Set Home");
			h.addActionListener(this);
			s.setActionCommand("Stop");
			s.addActionListener(this);
			dfl.setActionCommand("Diagonal Forward Left");
			dfl.addActionListener(this);
			dfr.setActionCommand("Diagonal Forward Right");
			dfr.addActionListener(this);
			dbl.setActionCommand("Diagonal Backward Left");
			dbl.addActionListener(this);
			dbr.setActionCommand("Diagonal Backward Right");
			dbr.addActionListener(this);
			rl.setActionCommand("Rotate Left");
			rl.addActionListener(this);
			rl2.setActionCommand("Rotate Left 20");
			rl2.addActionListener(this);
			rr2.setActionCommand("Rotate Right 20");
			rr2.addActionListener(this);
			hu.setActionCommand("Head Up");
			hu.addActionListener(this);
			hm.setActionCommand("Head Middle");
			hm.addActionListener(this);
			hd.setActionCommand("Head Down");
			hd.addActionListener(this);
			
			
			drivingPanel.add(f);
			drivingPanel.add(b);
			drivingPanel.add(l);
			drivingPanel.add(r);
			drivingPanel.add(sh);
			drivingPanel.add(h);
			drivingPanel.add(s);
			drivingPanel.add(dfl);
			drivingPanel.add(dfr);
			drivingPanel.add(dbl);
			drivingPanel.add(dbr);
			drivingPanel.add(rl);
			drivingPanel.add(rl2);
			drivingPanel.add(rr);
			drivingPanel.add(rr2);
			drivingPanel.add(hu);
			drivingPanel.add(hm);
			drivingPanel.add(hd);
			
			
			//...
			//...
			
			
			
			
			
			//add one control panel, which contains both camera panel and driving panel
			JPanel controlPanel = new JPanel();
			controlPanel.setLayout(new BorderLayout());
			controlPanel.add(cameraPanel, BorderLayout.NORTH);
			controlPanel.add(drivingPanel, BorderLayout.CENTER);
			content.add(controlPanel);
			
			
			//window set up
			this.setTitle("CSCE145 Rovio");
			this.setBounds(0,0,1500,500);
			this.setLocationRelativeTo(null);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
	}
	
	
	//You will add the control code for Rovio here 
	public void actionPerformed(ActionEvent arg0) {
		try 
		{
			//You do not need to change the code here
			if (arg0.getActionCommand().equals("camera"))
			{
				imgPanel.setImage(rov.getImage());
				imgPanel.updateUI();
			} 
			else if (arg0.getActionCommand().equals("forward"))
			{
				rov.forward();
			}
			else if (arg0.getActionCommand().equals("backward"))
			{
				rov.backward();
			}
			else if (arg0.getActionCommand().equals("left"))
			{
				rov.straightLeft();
			}
			else if (arg0.getActionCommand().equals("right"))
			{
				rov.straightRight();
			}
			else if (arg0.getActionCommand().equals("Set Home"))
			{
				rov.setHome();
			}
			else if (arg0.getActionCommand().equals("Home"))
			{
				rov.goHome();
			}
			else if (arg0.getActionCommand().equals("Stop"))
			{
				rov.stop();
			}
			else if (arg0.getActionCommand().equals("Diagonal Forward Left"))
			{
				rov.diagonalForwardLeft();
			}
			else if (arg0.getActionCommand().equals("Diagonal Forward Right"))
			{
				rov.diagonalForwardRight();
			}
			else if (arg0.getActionCommand().equals("Diagonal Backward Left"))
			{
				rov.diagonalBackwardLeft();
			}
			else if (arg0.getActionCommand().equals("Diagonal Backward Right"))
			{
				rov.diagonalBackwardRight();
			}
			else if (arg0.getActionCommand().equals("Rotate Left"))
			{
				rov.rotateLeft();
			}
			else if (arg0.getActionCommand().equals("Rotate Left 20"))
			{
				rov.rotateLeft();
			}
			else if (arg0.getActionCommand().equals("Rotate Right"))
			{
				rov.rotateRight();
			}
			else if (arg0.getActionCommand().equals("Rotate Right 20"))
			{
				rov.rotateRight();
			}
			else if (arg0.getActionCommand().equals("Head Up"))
			{
				rov.headUp();
			}
			else if (arg0.getActionCommand().equals("Head Middle"))
			{
				rov.headMiddle();
			}
			else if (arg0.getActionCommand().equals("Head Down"))
			{
				rov.headDown();
			}
			/*
			You will add your code below for more actions
			*/
			else
			{		
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RovioTest test = new RovioTest();
		test.setVisible(true);			
	}

}

