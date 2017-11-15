/*
*Partial Employee class definition
*/

/* Write the class heading necessary to ensure that
* objects of this class can be written to a binary file.
* Also note that no objects of this class will be directly instantiated.
* Only objects of derived classes will be instantiated
* Write the class heading accordingly.  Import any classes
* that are needed
*/


	private String empName;
	private String empAddress;
    private Vehicle empVehicle;

	public Employee(String empN, String empA, Vehicle veh)
	{
		empName = empN;
		empAddress = empA;
		empVehicle = veh;
	}

   	//set methods for all instance variables
   	public void setName(String eName)
    {
		empName = eName;
   	}
   	public void setAddress(String eAddress)
   	{
   		empAddress = eAddress;
   	}

	public void setVehicle(Vehicle v)
   	{
   		empVehicle = v;
   	}

   	//get methods for all instance variables
   	public String getName()
   	{
		return empName;
   	}

   	public String getEmpAddress()
   	{
		return empAddress;
	}


  	public Vehicle getEmpVehicle()
  	{
	  return empVehicle;
  	}


    public String toString()
    {
        /*
		* Write the toString method to display all Employee data
		*/
	}

		/*
		* Write the code necessary for computing the compensation for an Employee.
		* Hint:  In the Employee class you just need to write the method heading.
		*/

}


