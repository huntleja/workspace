import javax.swing.JOptionPane;
/**
 * 
 */

/**
 * @author huntleja
 *
 */
public class values {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double small, large, range = 0, average = 0, count, sum, number = 0;
		small = Double.MAX_VALUE;
		large = Double.MIN_VALUE;
		count = 0;
		sum = 0;
		
		
		String first =	JOptionPane.showInputDialog("Input numbers (to end either type end or stop):");
		while (!first.contains("end") || (!first.contains("stop"))) {
			if (!first.contains("end") || (!first.contains("stop")))
				number = Double.parseDouble(first);
			
			if (!first.contains("end") || (!first.contains("stop")))			
			count++;
			sum += number;
			
			if ((number > large))
				large = number;
			
			if ((number < small))
				small = large;		
			
										
			if (((first!= "end") || (first!= "stop")))
			 first = JOptionPane.showInputDialog("Input numbers (to end either type end or stop):");
			
			if ((first.contains("end") || (first.contains("stop"))))
				break;
				
					
								}
		
		
			range = (large) - (small); 
		 	average = ((sum)/(count));
	
		 
		 		JOptionPane.showMessageDialog(null, average + " is the average of the numbers\n" + 
				small + " is the smallest of the values\n" +
				large + " is the largest of the values\n" +
				range + " is the range of the values.");
		}
}


