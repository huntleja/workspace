/*
 * Rovio Control API
 * Jingsong Wang 20101117
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.ImageIO;


public class RovioControl {
	private String user = "";
	private String password = "";
	private String ip = "";
	
	private int speed = 5;	//1(fastest) – 10(slowest)
	
	//manual driving commands
	private static final int STOP = 0;
	private static final int FORWARD = 1;
	private static final int BACKWARD = 2;
	private static final int STRAIGHT_LEFT = 3;
	private static final int STRAIGHT_RIGHT = 4;
	private static final int ROTATE_LEFT_BY_SPEED = 5;
	private static final int ROTATE_RIGHT_BY_SPEED = 6;
	private static final int DIAGONAL_FORWARD_LEFT = 7;
	private static final int DIAGONAL_FORWARD_RIGHT = 8;
	private static final int DIAGONAL_BACKWARD_LEFT = 9;
	private static final int DIAGONAL_BACKWARD_RIGHT = 10;
	private static final int HEAD_UP = 11;
	private static final int HEAD_DOWN = 12;
	private static final int HEAD_MIDDLE = 13;
	private static final int ROTATE_LEFT_BY_20DEGREEANGLE_INCREMENTS = 17;
	private static final int ROTATE_RIGHT_BY_20DEGREEANGLE_INCREMENTS = 18;
	
	public RovioControl() {
		this.user = "admin";
		this.password = "csce145";
		this.ip = "192.168.1.100";
	  
		//Create an authenticator to provide username and password to Rovio
		Authenticator.setDefault(new Authenticator() {                                        
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication (user, password.toCharArray());
			}
		});
	}

	public RovioControl(String usr, String pwd, String address) {
		this.user = usr;
		this.password = pwd;
		this.ip = address;
	  
		//Create an authenticator to provide username and password to Rovio
		Authenticator.setDefault(new Authenticator() {                                        
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication (user, password.toCharArray());
			}
		});
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int s) {
		if((s >= 1) && (s <=10))
			this.speed = s;
		else
			System.out.println("The speed should be set between 1(fastest) - 10(slowest)).");
	}
	
	private void sendCommand(String command) throws IOException {
		URL url = new URL(command);
				
		//Open the connection to Rovio and send command
		URLConnection uc = url.openConnection();
		uc.setDoOutput(true);
		BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
	  
		//Read anything returned by Rovio and print it
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
		  
		//Close connection
		in.close();
	}
	
	public void stop() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + STOP;		
		sendCommand(command);
	}
	
	public void forward() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + FORWARD;		
		sendCommand(command);
	}
	
	public void backward() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + BACKWARD;		
		sendCommand(command);
	}
	
	public void straightLeft() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + STRAIGHT_LEFT;		
		sendCommand(command);
	}
	
	public void straightRight() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + STRAIGHT_RIGHT;		
		sendCommand(command);
	}
	
	public void rotateLeft() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + ROTATE_LEFT_BY_SPEED;		
		sendCommand(command);
	}
	
	public void rotateRight() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + ROTATE_RIGHT_BY_SPEED;		
		sendCommand(command);
	}
	
	public void diagonalForwardLeft() throws IOException {						
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + DIAGONAL_FORWARD_LEFT;		
		sendCommand(command);
	}
	
	public void diagonalForwardRight() throws IOException {						
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + DIAGONAL_FORWARD_RIGHT;		
		sendCommand(command);
	}
	
	public void diagonalBackwardLeft() throws IOException {						
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + DIAGONAL_BACKWARD_LEFT;		
		sendCommand(command);
	}
	
	public void diagonalBackwardRight() throws IOException {						
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + DIAGONAL_BACKWARD_RIGHT;		
		sendCommand(command);
	}
	
	public void headUp() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + HEAD_UP;		
		sendCommand(command);
	}
	
	public void headMiddle() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + HEAD_MIDDLE;		
		sendCommand(command);
	}
	
	public void headDown() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + HEAD_DOWN;		
		sendCommand(command);
	}

	public void rotateLeftBy20Degrees() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + ROTATE_LEFT_BY_20DEGREEANGLE_INCREMENTS;		
		sendCommand(command);
	}
	
	public void rotateRightBy20Degrees() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=18&drive=" + ROTATE_RIGHT_BY_20DEGREEANGLE_INCREMENTS;		
		sendCommand(command);
	}
	
	
	public void setHome() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=14";		
		sendCommand(command);
	}
	
	public void goHome() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=12";		
		sendCommand(command);
	}
	
	public Image getImage() throws IOException {
		String command = "http://" + ip + "/Jpeg/CamImg.jpg";
		
    	BufferedImage image = null;
        URL url = new URL(command);
        image = ImageIO.read(url);
        //ImageIO.write(image, "jpg",new File("pic.jpg"));
        System.out.println("Picture Done");
        return image;
 	}

	/*
	private void getReport() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=1";		
		sendCommand(command);
	}
	
	private void getMCUReport() throws IOException {
		String command = "http://" + ip + "/rev.cgi?Cmd=nav&action=20";		
		sendCommand(command);
	}
	*/
	
}

