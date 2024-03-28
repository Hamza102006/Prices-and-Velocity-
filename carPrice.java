import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Hamza Khan
 * Date: 9/14/2023
 * Description: The program below will prompt the user to enter their car make, model, price, PDI rate
 *              and HST Rate. After obtaining these values the program will calculate the total price of 
 *              the car and display the given information entered by the user
 * 
 *
 * METHOD LIST: 
 * public static double calcCost (double percent, double price) - Calculates extra tax or charge 
 *                                                                which is added to the final price
 *
 */
public class carPrice {

	/*
	 * Method which will calculate the extra cost or charge added based of the percent entered 
	 */
	public static double calcCost (double percent, double price) { 

		return (price * (percent/100));


	}

	public static void main(String[] args) {

		//Decimal Format to keep the value returned to two decimals
		DecimalFormat twoDigit = new DecimalFormat("0.00");

		//Declares and initializes variables 
		String makeOfCar, modelOfCar;
		double price, pdiValue, hstValue;
		double totalPrice = 0;

		//Prompts user for the make of car
		makeOfCar = JOptionPane.showInputDialog(null,"Enter the make of your car: ");
		
		
		//Prompts user to enter the model of car
		modelOfCar = JOptionPane.showInputDialog(null,"Enter the model of your car: ");

		
		//Prompts user to enter the price of car
		price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price of your car: "));

		
		//Prompts user to enter PDI value in percentage 
		pdiValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the PDI Value in %: " ));

		
		//Prompts user for HST value in percentage 
		hstValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the HST Value in %: "));

		
		//Calls calcCost method and finds the price after PDI percentage 
		totalPrice = price + calcCost(price,pdiValue);

		
		//Calls calcCost method finds the total final price after the HST rate is also added
		totalPrice += calcCost(totalPrice,hstValue);

		
		//Final Display Message which will show the user the values entered and the final price
		JOptionPane.showMessageDialog(null, "Make of car: " + makeOfCar + "\n\nModel: " + modelOfCar 
				+ "\n\nPrice of car: $" + twoDigit.format(price) + "\n\nPDI Rate: " + pdiValue + "%\n\n"
				+ "HST Rate: " + hstValue + "%" + "\n\nTotal Price: $" + twoDigit.format(totalPrice));



	}

}
