/*Partial FullTimeEmployee Definition*/

/* Write the class heading necessary to ensure that
* objects of this class can be written to a binary file.
* Import any classes that are needed
*/

	private static final double FIRST_TAX = 45000.0;
	private static final double SECOND_TAX = 82000.0;
	private static final double  FIRST_RATE = 0.18;
	private static final double SECOND_RATE = 0.28;
	private static final double THIRD_RATE = 0.33;
	private static final double FIRST_AMT = 8100;
    private static final double SECOND_AMT = 10360;
	private double salary;
    NumberFormat d = NumberFormat.getCurrencyInstance();

	public FullTimeEmployee(String empN, String empA, Vehicle veh)
	{
		super(SempN, empA, veh, double sal);
		salary = sal;

	}
   	public void setSalary(double eSalary)
   	{
	    salary = eSalary;
   	}


	public String toString()
	{
		/*
		* Write the toString method to display all Employee data for this instance
		*/

	}

	public double computeCompensation()
	{
		/*
		*Write the code to compute the employee's compensation based on the homework requirements.
		*/
	}
}

