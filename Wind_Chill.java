import java.util.Scanner;

public class Wind_Chill {
	
	
	
	public static void main (String[] args) {
		//variables
		double Temperature,Wind_Speed,Wind_Chill,Exit;
		final int min_Temp= -45,
				max_Temp= 40,
				max_Speed = 60,
				min_Speed =5;
		
		boolean out_Range = true;
		Scanner User_Input = new Scanner (System.in);
		String Output_request1 = "Simply in enter the temperature in Fahrenheit (must be >= -45 and <= 40):";
		String Output_request2 = "Enter the wind speed (must be >= 5 and <= 60):";
		//Text Output
		System.out.println("Hello, this project is designed to calculate wind chill");
		
		
		//While loop to determine if in range of Fahrenheit
	do {
		out_Range=true;
		do {
			
			System.out.print(Output_request1);
			Temperature = User_Input.nextInt();
			
			if (Temperature >= min_Temp && Temperature <= max_Temp) {
				out_Range=false;
			}
		
			else {
				System.out.println("The Following Fahrenheit is not in the range of >= -45 and <= 40");
			}
		}while (out_Range ==true); 
		
		System.out.println("perfect!\n");
		out_Range=true;
		System.out.print(Output_request2);
		
		
		do{
			Wind_Speed = User_Input.nextInt();
			
			if (Wind_Speed >= min_Speed && Wind_Speed <= max_Speed) {
				out_Range=false;
			}
		
			else {
				System.out.println("The Following wind speed is not in the range of >= 5 and <= 60");
				System.out.print(Output_request2);
				}
		}while (out_Range ==true);
		
		
		// Wind Chill (oF) = 35.74 + 0.6215T - 35.75(V0.16) + 0.4275T(V0.16), 
		Wind_Chill=35.74 + (0.6215*Temperature)-35.75*(Math.pow(Wind_Speed,0.16))+((0.4275*Temperature)*(Math.pow(Wind_Speed, 0.16)));
		System.out.println("Your calculated Wind Chill is:"+ Wind_Chill);
		
		System.out.println("Would you like to calculate a new Wind Chill? ");
		System.out.println("Enter \'-1\' to end the program:");
		Exit= User_Input.nextInt();
	} while(Exit!=-1);
		
		
		System.out.println("Programer's name: Carlos Gutierrez\n");
		System.out.println("Program has now ended");
	
}
}
