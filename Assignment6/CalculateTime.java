import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

class CalculateTime {
	// Calculates the time of arrival
	static LocalDateTime calculateArrival(int speed, int distance, LocalDate date, LocalTime time, int startingHour,
			int startingMinute) {
		int drivingHoursPerDay = 8;
		int drivingHoursLeft = drivingHoursPerDay;
		boolean isHoliday = validateHoliday(date);
		while (distance > 0) {
			// changing the date to next date since the current date is holiday or driving
			// hour per is over
			while (isHoliday || drivingHoursLeft == 0) {

				date = date.plusDays(1);
				time = LocalTime.of(startingHour, startingMinute);
				// checking the next day ishoiliday or not
				isHoliday = validateHoliday(date);
				// making new days driving hours to 8(driving hours per day)
				drivingHoursLeft = drivingHoursPerDay;
			}

			//calculating maximum distance the lorry can travel within drivinghoursLeft
			int maxDistance = drivingHoursLeft * speed;
			
			if (distance <= maxDistance) {
				int hours = distance / speed;
				int minutes = (distance % speed) * 60 / speed;
				time = time.plusHours(hours).plusMinutes(minutes);

				distance = 0;
			} else {
				time = time.plusHours(drivingHoursLeft);
				distance -= maxDistance;
				drivingHoursLeft = 0;
			}
		}

		System.out.println(date);
		System.out.println(time);

		return LocalDateTime.of(date, time);
	}

	static boolean validateHoliday(LocalDate date) {
		// Storing the date in month day format
		MonthDay monthDay = MonthDay.of(date.getMonthValue(), date.getDayOfMonth());
//		government holidays
		if (monthDay.equals(MonthDay.of(1, 1)) || monthDay.equals(MonthDay.of(1, 26))
				|| monthDay.equals(MonthDay.of(5, 2)) || monthDay.equals(MonthDay.of(4, 14))
				|| monthDay.equals(MonthDay.of(8, 15))) {
			return true;
		} else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) // sundays
		{
			return true;
		} else if (date.getDayOfWeek() == DayOfWeek.SATURDAY && date.getDayOfMonth() > 7 // Second saturday
				&& date.getDayOfMonth() <= 14) {
			return true;
		} else {
			return false;
		}
	}
}