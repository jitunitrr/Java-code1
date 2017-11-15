
import java.util.*;
import java.io.*;
import java.text.*;
public class EmployeeDemo{

	/*
	*Add all instance variables needed
	*/

	public static void main(String[] args){
		EmployeeDemo myDemo = new EmployeeDemo();
		myDemo.runMenu();
	}

	public void runMenu()
	{
		emp = new Employee[25];
		readFileData();
		int choice = 1;
		while(choice >=  1 && choice <= 5)
		{
			System.out.println("==== Menu ====");
			System.out.println("1. To add an Employee");
			System.out.println("2. To print employee and vehicle data for all employees");
			System.out.println("3. To print the names of all employees together with their total compensation");
			System.out.println("4. To print names of employees together with mileage information for high mileage vehicles");
			System.out.println("5. To exit program");
              System.out.println("Your choice: ");
			choice = keyboard.nextInt();
			switch (choice)
			{
				case 1: // Add a new Employee to the list
						runOption1();
						break;
				case 2: // Print employee data together with vehicle data for all employees in the system
						runOption2();
						break;
				case 3: // Print the names of all employees together with the compensation received by each
						runOption3();
						break;
				case 4: // Print the names of all employees together with mileage for all vehicles with high mileage
						runOption4();
						break;
				case 5: // To exit program
						runOption5();
						choice = 1;
						break;
			}
		}
	}
// Option 1 - Adding a new Employee
	private void runOption1()
	{
		/*
		*First ask the user to input the type of employee she wants to add.
		*The program must keep asking this question until the user provides a valid response.
		*The program should then ask the user to enter those inputs that are appropriate for that Employee type.
		*Once the inputs have been accquired, the program must create the appropriate Employee object
		*and add it to the Employee array.
		*Make sure that you keep track of the number of employee you have added so far.
		*/

	}




// Option 2- Print employee data together with vehicle data for all employees in the system
   private void runOption2()
   {

     /*
	 *Display all employee data for each employee in the system.
	 *This should include vehicle data as well as data specific to the employee type
	*/

  }


// Option 3- Print the names of all employees together with the compensation received by each
   private void runOption3()
   {
		/*
		*Display the name and compensation for for each employee in the system.
		*/
   }


// Option 4- Print employee name and vehicle mileage for all vehicle with over 78000 miles
   private void runOption4()
   {
     /*
     *Print the name of the employee together with the mileage of the vehicle for each vehicle with over 78000 miles
     */
  }


// Option 5 - Exiting from the system
		private void runOption5()
		{
			/*
			* Complete the method to exit from the system.
			* First ask the user if she really want to exit the application.
			*  If she responds write 'N', display the menu again.
			* If she responds with 'Y', then execute the saveData() method and exit the system.
			*/
		}

	private void saveData(){

		/*
		* 	Write the necessary code to create an object to write to a binary file (employeedata.dat).
		*   Note: DO NOT append to an exisiting employeedata.dat file.
		*   You must overwrite the file if it exists already.
		*  	Write each of the employee objects from the Employee array to the binary file.
		*   Print out a statement displaying the number of employee that were written to the file.
		*	Close the file.
		*/

	}


	private void readFileData()
	{
		/*
		*
		* 	Write the necessary code to create an object to read from a binary file (employeedata.dat).
		*  	Read each of the employee objects from the binary file and add it to the Employee array.
		*   Keep track of the number of employee that have been read.
		*	Close the file.
		*/
	}
	public void getFTEmpInput()
	{
		/*
		* Get all FullTimeEmployee input including data common to all employees;
		*/

	public void getHourlyEmpInput()
	{
		/*
		* Get all HourlyEmployee input including data common to all employees;
		*/
	}

	public void getConsultantInput()
	{
		/*
		* Get all Consultant input including data common to all employees;
		*/
	}

}
