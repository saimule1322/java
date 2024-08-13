package datatypes;

public class Long_short {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     long seconds;
     long days;
     long months;
     long years;
     
     years=5;
      
     months = years*12;
     days = months*30;
     seconds = days*60*60;
     
     System.out.println("no of years"+years);
     System.out.println("no of months"+months);
     System.out.println("no of days"+days);
     System.out.println("no of seconds"+seconds);
     
	}

}
