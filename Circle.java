package myCircle;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle {
	
	static class circle{
		
		//Defining variables
		private Double diameter;
		private Double radius;
		private Double circumference;
		private Double area;
		
		public circle(double diameter, double radius, double circumference, double area){
			
			//Setting up the constructor.
			this.diameter = diameter;
			this.radius = radius;
			this.circumference = circumference;
			this.area = area;
			
		}
		
		public void setDiameter(Double diameter){
			
			//Adding the ability to set the diameter manually.
			this.diameter = diameter;
			
		}
		
		public void setRadius(Double radius){
			
			//Adding the ability to set the radius manually.
			this.radius = radius;
			
		}
		
		public void setCircumference(Double circumference){
			
			//Adding the ability to set the circumference manually.
			this.circumference = circumference;
			
		}
		
		public void setArea(Double area){
			
			//Adding the ability to set the area manually.
			this.area = area;
			
		}
		
		public Double getDiameter(){
			calculate(); //Runs the calculate class. (All the calculations)
			return this.diameter; //Returns diameter.
		}
		
		public Double getRadius(){
			
			calculate(); //Runs the calculate class. (All the calculations)
			return this.radius; //Returns diameter
			
		}
		
		public Double getCircumference(){
			
			calculate(); //Runs the calculate class. (All the calculations)
			return this.circumference; //Returns circumference.
			
		}
		
		public Double getArea(){
			
			calculate(); //Runs the calculate class. (All the calculations)
			return this.area; //Returns area.
			
		}
		
		//CALCULATIONS
		public void calculate(){
			
			//If the diamter, radius AND circumference all equal 0, then it calculates the radius from the area.
			if (this.diameter == 0 && this.radius == 0 && this.circumference == 0){
				
				this.radius = (Math.sqrt(this.area/Math.PI));
				
			}
			
			//If the radius is zero, calculate the radius from the diameter.
			if (this.radius == 0){
				
				this.radius = (this.diameter/2);
				
			}
			
			//If the diameter is zero, calculate the diameter from the radius.
			if (this.diameter == 0){
				
				this.diameter = (this.radius*2);
				
			}
			
			//If the area is zero, calculate the area from the radius.
			if (this.area == 0){
				
				this.area = (Math.PI*(Math.pow(this.radius, 2)));
				
			}
			
			//If the radius, is zero, calculate the diameter from the circumference, the radius from the diameter, and the area from the radius.
			if (this.radius == 0 && this.diameter == 0 && this.area == 0){
				
				this.diameter = (this.circumference/Math.PI);
				this.radius = (this.diameter/2);
				this.area = (Math.PI*(Math.pow(this.radius, 2)));
				
			}
			
			//If the circumference is zero, calculate the radius from the area, and the circumference from the radius.
			if (this.circumference == 0){
				
				this.radius = (Math.sqrt(this.area/Math.PI));
				this.circumference = ((2*Math.PI)*radius);
				
			} else {
				
			}																																									
			
		}
		
		//Ease of access for all the information formatted.
		public String getAllInfo(){
	
			NumberFormat formatter = new DecimalFormat("#0.00"); //Setting up decimal formatter. (Trimmer, not rounder)
			calculate(); //Runs the calculate class.
			if (this.diameter == 0 && this.radius == 0 && this.circumference == 0 && this.area == 0){ //If all values of the circle are zero.
				
				return "No info given."; //Return string
				
			} else
			
			//Return all info with a limit of two decimal places. Order is diameter, radius, circumference, then area.	
			return ("Diameter: " + formatter.format(this.diameter) + "\nRadius: " +  formatter.format(this.radius) + 
					"\nCircumference: " + formatter.format(this.circumference) + "\nArea: " + formatter.format(this.area));
			
		}
		
	}

	public static void main(String[] args) 
	{	
		
		//circle(diameter, radius, circumference, area)
		//leave a value 0 if unknown.
		
		//With only radius given.
		circle x = new circle(0, 4, 0, 0); //Creating circle x.
		System.out.println("~Circle x~\n" + x.getAllInfo() + "\n"); //Prints out the name of the circle, all the info, then a new line at the end.
		
		//With only diameter given.
		circle y = new circle(14, 0, 0, 0); //Creating circle y.
		System.out.println("~Circle y~\n" + y.getAllInfo() + "\n"); //Prints out the name of the circle, all the info, then a new line at the end.
		
		//With only circumference given.
		circle z = new circle(0, 0, 16, 0); //Creating circle z.
		System.out.println("~Circle z~\n" + z.getAllInfo() + "\n"); //Prints out the name of the circle, all the info, then a new line at the end.
		
		//With only area given
		circle a = new circle(0, 0, 0, 3); //Creating circle a.
		System.out.println("~Circle a~\n" + a.getAllInfo() + "\n"); //Prints out the name of the circle, all the info, then a new line at the end.
		
		//With no info given
		circle w = new circle(0, 0, 0, 0); //Creating circle w.
		System.out.println("~Circle w~\n" + w.getAllInfo() + "\n"); //Prints out the name of the circle, all the info, then a new line at the end.
		
	}
	
}
