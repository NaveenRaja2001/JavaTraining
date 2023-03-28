
import java.time.*;
import java.util.Scanner;

public class Lorry {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Getting the Average Speed
		System.out.println("Enter the average speed (km/hr");
		int averageSpeed = Integer.parseInt(sc.nextLine());
		//Getting the starting date 
		System.out.println("Enter the journey starting date");
		int startingDay = 0, startingMonth = 0, startingYear = 0;
		String startingDate[] = sc.nextLine().split(":");
		try {
		//Spliting them into day , month and year
			startingDay = Integer.parseInt(startingDate[0]);
			startingMonth = Integer.parseInt(startingDate[1]);
			startingYear = Integer.parseInt(startingDate[2]);
		} catch (Exception e) {
			System.out.println("Date format is  wrong!");
			System.exit(0);
		}
		
		LocalDate date = LocalDate.of(startingYear, startingMonth, startingDay);
		// Getting the journey starting time
		System.out.println("Enter the journey starting time");
		String startingTime[] = sc.nextLine().split(":");
		int startingHour = 0, startingMinute = 0;
		try {
			startingHour = Integer.parseInt(startingTime[0]);
			startingMinute = Integer.parseInt(startingTime[1]);
		} catch (Exception e) {
			System.out.println("Time format wrong!");
			System.exit(0);
		}
		
		LocalTime time = LocalTime.now();
			time = LocalTime.of(startingHour, startingMinute);
			
		System.out.println("Enter the distance to be travelled in kms:");
		int distance = Integer.parseInt(sc.nextLine());

		// Calculate time of arrival
        LocalDateTime arrival = CalculateTime.calculateArrival(averageSpeed, distance, date, time, startingHour,startingMinute);

		// Print time of arrival
        System.out.println("Expected time of arrival: " +arrival);
		sc.close();
	}
}
