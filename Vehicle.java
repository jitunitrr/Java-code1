//Partial Vehicle class definition

/* Write the class heading necessary to ensure that
 * objects of this class can be written to a binary file.
 * Import any classes that will be needed.
*/

class Vehicle{

   private String make;
   private String model;
   private String year;
   private int mileage;

//Constructor for Vehicle class
   public Vehicle(String mk, String mdl, String yr, int milg)
   {
	   	this.make=mk;
	   	this.model=mdl;
		this.year=yr;
		this.mileage=milg;
		
   }

   /*
      * get (accessor) Methods for all instance variables
   */

  
	public String getMake(){
		return this.make;
	}
	public String getModel(){
		return this.model;
	}
	public String getYear(){
		return this.year;
	}
	public int getMileage;(){
		return this.mileage;;
	}
   /*	
   * set (mutator) Methods for all instance variables
   */
	public void setMake(String make){
		this.make=make;
	}
	public void setModel(String mdl){
		this.model=mdl;
	}
	public void setYear(String yr){
		this.year=yr;
	}
	public void setMileage(int milg){
		this.mileage=milg;
	}

   /*

   * toString method to display all Employee data
   */
	public String toString(){
  
       		 return "make:"+this.make+" ,model:"+this.model+",year:"+this.year+",Mileage"+this.mileage;
	}


}
