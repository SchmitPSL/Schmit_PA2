/*
 * BMI Calculator:
 * Choose which formula to choose from
 * Reads weight 
 * Reads height
 * Calculates the users Bmi and category
 * 			For weight
 * 				Metric: should be in kilograms
 * 				Imperial: should be (703 * weight in pounds) squared
 * 					The program should exit if the user enters a negative weight
 * 			For height
 * 				Metric: should be in meters
 * 				Imperial: should be in inches
 * 					The program should exit if the user enters a negative height
 * Print the Bmi and Bmi category
 */
import java.util.Scanner;

public class BMICalculator {
//Variables to set to the users inputed values
	private double height;
	private double weight;
	private double BMI;
	private int bCase;
	private String BMICategory;

	Scanner s = new Scanner(System.in);

//Main Function, calls readUserData, calculatBmi, displayBmi
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
	}

//readUserData that calls readUnitType and readMeasurementData
	public void readUserData() {
		readUnitType();
		readMeasurementData();

	}

//readUnitType asks the user to select what type of unit system they would like to use
//repeating if they don't input a valid response
	private void readUnitType() {
		while (bCase != 1 && bCase != 2) {

			System.out.print("1.Metric (Kilograms, Meters)\n" + "2.Imperial (Pounds, Inches)\n"
					+ "Select which method to use: ");
			this.bCase = s.nextInt();
		}
	}

//readMeasurementData calls either readMetricData or readImperialData depending on their response
	private void readMeasurementData() {
		if (bCase == 1) {
			readMetricData();
		}
		if (bCase == 2) {
			readImperialData();
		}

	}

//readMetricData asks the user for their weight and height and calls setWeight and setHeight
// to input their weight and height
	private void readMetricData() {
		// prompt user for their weight and height
		System.out.print("Enter weight in kilograms: ");
		setWeight(s.nextDouble());
		System.out.print("Enter height in meters: ");
		setHeight(s.nextDouble());

	}

//readImperialData asks the user for their weight and height and calls setWeight and setHeight
// to input their weight and height
	private void readImperialData() {
		// prompt user for their weight and height
		System.out.print("Enter weight in pounds: ");
		setWeight(s.nextDouble());
		System.out.print("Enter height in inches: ");
		setHeight(s.nextDouble());
	}
//calculateBmi chooses between which method the user chose and calculates the BMI according to the specified method
	public void calculateBmi() {
		switch (bCase) {
		case 1:
			this.BMI = (this.weight / Math.pow(this.height, 2));
			break;
		case 2:
			this.BMI = ((703 * this.weight) / (Math.pow(this.height, 2)));
			break;
		default:
			break;
		}
	}
//calculateBmiCategory determines what the category is for the calculated BMI value
	private String calculateBmiCategory() {
		if (this.BMI >= 30) {
			this.BMICategory = "Obesity = BMI of 30 or greater";
		} else if (this.BMI >= 25) {
			this.BMICategory = "Overweight = 25–29.9";
		} else if (this.BMI >= 18.5) {
			this.BMICategory = "Normal weight = 18.5–24.9";
		} else {
			this.BMICategory = "Underweight = <18.5";
		}
		return BMICategory;

	}
//displayBmi prints out the Bmi value and the Bmi category associated with the Bmi score
//prints all Bmi categories for user to compare
	public void displayBmi() {
		System.out.printf("Your BMI is %.1f\n", getBmi());
		System.out.println("Your BMI category is " + getBmiCategory());
		System.out.println("BMI Categories:\r\n" + 
				"Underweight = <18.5\r\n" + 
				"Normal weight = 18.5–24.9\r\n" + 
				"Overweight = 25–29.9\r\n" + 
				"Obesity = BMI of 30 or greater");
	}
//getWeight gets the weight of the user
	public double getWeight() {
		return this.weight;
	}
//setWeight sets the weight of the user only if the value is valid, if not, exits
	private void setWeight(Double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.print("Invalid weight. Exiting program.");
			System.exit(0);
		}
	}
//getHeight gets the height of the user
	public double getHeight() {
		return this.height;
	}
//setHeight sets the height of the user only if the value is valid, if not, exits
	private void setHeight(Double height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.print("Invalid height. Exiting program.");
			System.exit(0);
		}
	}
//getBmi gets the Bmi of the user
	public double getBmi() {
		return this.BMI;
	}
//getBmiCategory gets the calculated Bmi category of the user
	public String getBmiCategory() {
		return calculateBmiCategory();
	}

}
