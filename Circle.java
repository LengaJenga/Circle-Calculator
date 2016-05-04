package myCircle;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle {
	
	static class circle{
		
		private Double diameter;
		private Double radius;
		private Double circumference;
		private Double area;
		
		public circle(double diameter, double radius, double circumference, double area){
			
			this.diameter = diameter;
			this.radius = radius;
			this.circumference = circumference;
			this.area = area;
			
		}
		
		public void setDiameter(Double diameter){
			
			this.diameter = diameter;
			
		}
		
		public void setRadius(Double radius){
			
			this.radius = radius;
			
		}
		
		public void setCircumference(Double circumference){
			
			this.circumference = circumference;
			
		}
		
		public void setArea(Double area){
			
			this.area = area;
			
		}
		
		public Double getDiameter(){
			calculate();
			return this.diameter;
		}
		
		public Double getRadius(){
			
			calculate();
			return this.radius;
			
		}
		
		public Double getCircumference(){
			
			calculate();
			return this.circumference;
			
		}
		
		public Double getArea(){
			
			calculate();
			return this.area;
			
		}
		
		//CALCULATIONS
		public void calculate(){
			
			if (this.diameter == 0 && this.radius == 0 && this.circumference == 0){
				
				this.radius = (Math.sqrt(this.area/Math.PI));
				
			}
			
			if (this.radius == 0){
				
				this.radius = (this.diameter/2);
				
			}
			
			if (this.diameter == 0){
				
				this.diameter = (this.radius*2);
				this.radius = (this.diameter/2);
				
			}
			
			//Area = piR^2
			if (this.area == 0){
				
				this.area = (Math.PI*(Math.pow(this.radius, 2)));
				
			}
			
			if (this.radius == 0 && this.diameter == 0 && this.area == 0){
				
				this.diameter = (this.circumference/Math.PI);
				this.radius = (this.diameter/2);
				this.area = (Math.PI*(Math.pow(this.radius, 2)));
				
			}
			
			//Circumference = perimeter
			if (this.circumference == 0){
				
				this.radius = (Math.sqrt(this.area/Math.PI));
				this.circumference = ((2*Math.PI)*radius);
				
			} else {
				
			}																																									
			
		}
		
		public String getAllInfo(){
			NumberFormat formatter = new DecimalFormat("#0.00");
			calculate();
			if (this.diameter == 0 && this.radius == 0 && this.circumference == 0 && this.area == 0){
				
				return "No info given.";
				
			} else
				
			return ("Diameter: " + formatter.format(this.diameter) + "\nRadius: " +  formatter.format(this.radius) + 
					"\nCircumference: " + formatter.format(this.circumference) + "\nArea: " + formatter.format(this.area));
			
		}
		
	}

	public static void main(String[] args) 
	{	
		
		//With only radius given.
		circle x = new circle(0, 4, 0, 0); //D R C A
		System.out.println("~Circle x~\n" + x.getAllInfo() + "\n");
		
		//With only diameter given.
		circle y = new circle(14, 0, 0, 0);
		System.out.println("~Circle y~\n" + y.getAllInfo() + "\n");
		
		//With only circumference given.
		circle z = new circle(0, 0, 16, 0);
		System.out.println("~Circle z~\n" + z.getAllInfo() + "\n");
		
		//With only area given
		circle a = new circle(0, 0, 0, 3);
		System.out.println("~Circle a~\n" + a.getAllInfo() + "\n");
		
		//With no info given
		circle w = new circle(0, 0, 0, 0);
		System.out.println("~Circle w~\n" + w.getAllInfo() + "\n");
		
	}
	
}
