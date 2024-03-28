import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * @author Hamza Khan 
 * Date: 9/13/2023 
 * Description: This program will calculate the final velocity. The program will ask the user to enter
 *              the amount of times they want to run (calculate) the program, the height the object was dropped
 *              and lastly initial velocity.
 *
 * METHOD LIST: 
 * public static double finalVelocityCalc (double initialVelocity, double height) {  [Calculates the final velocity]
 * public static double kmPerHour (double finalVelocity) {   [converts the m/s to km/h]
 *
 */
public class finalVelocity {

	/*
	 * Method which will calculate the final velocity using the given formula
	 */
	public static double finalVelocityCalc (double initialVelocity, double height) { 

		//return final velocity
		return Math.sqrt(Math.pow(initialVelocity, 2) + 2*(9.8) * height);
	}

	/*
	 * Method which will convert the m/s to km/h
	 */
	public static double kmPerHour (double finalVelocity) { 

		return finalVelocity*3.6; 

	}



	public static void main(String[] args) {

		//Decimal Format to keep the value returned to two decimals
		DecimalFormat twoDigit = new DecimalFormat("0.00");

		//declare variables for height, intialVelocity and finalVelocity 
		
		int numOfElements = 0;

		double height[]; 
		double intialVelocity[]; 
		double finalVelocity[];
		
		// repeat the code if yes answered
		while(true){
		
		//prompt the user for the number of elements (or how many times the program will run)
		numOfElements = Integer.parseInt(JOptionPane.showInputDialog("Please Enter the Number of Calculations You Would Like to Run"));
				
			
		// create the arrays
		height = new double[numOfElements];
		intialVelocity = new double[numOfElements];
		finalVelocity = new double[numOfElements];
	
		//for loop to run the program the amount of times which the user entered 
		for (int i = 0; i < numOfElements; i++) { 

			//prompt the user for the height
			height[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Please Enter the Height of Which the Object Was Dropped: "));

			//prompt the user for the intialVelocity
			intialVelocity[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter the initial downward velocity: " ));

			// calculate the finalVelocity by calling the method finalVelocityCalc 
			finalVelocity[i] = finalVelocityCalc(intialVelocity[i],height[i]);

			//Final display message to show user the values in Km/h and m/s
			JOptionPane.showMessageDialog(null,"The final velocity of the object is: \n"
					+ twoDigit.format(finalVelocity[i]) + " m/s\n"
					+ twoDigit.format(kmPerHour(finalVelocity[i])) + " km/h");
			
		}

		//prompt the user to enter yes or no to rerun the program
		String tryAgain = JOptionPane.showInputDialog("Do You Want to Try Again (yes/no)");
		
		// if anything else other than yes is entered  end the program 
		if(!tryAgain.equalsIgnoreCase("yes")){
            break;
        }
		
		}
		
	}






	}
