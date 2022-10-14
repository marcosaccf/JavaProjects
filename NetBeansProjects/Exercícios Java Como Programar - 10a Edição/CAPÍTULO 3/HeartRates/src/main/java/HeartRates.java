// Exercício 3.16: HeartRates.java

import java.util.Calendar;

public class HeartRates {
	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;

	public HeartRates(String firstName, String lastName, int day, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = day;
		this.day = month;
		this.year = year;
	}

	public int getAge() {
		return Calendar.getInstance().get(Calendar.YEAR) - year;
	}

	public int getMaximumHeartRate() {
		return 220 - getAge();
	}

	public String getTargetHeartRate() {
		return String.format("%.0f-%.0f", getMaximumHeartRate() * 0.5, getMaximumHeartRate() * 0.85);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
        
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}