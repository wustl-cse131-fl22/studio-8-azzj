package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	public String toString() {
		if(holiday == true) {
			return "month: " + month  + "," + "day: " + day
					+ "year: " + year + " " + "is holiday"; 
		}
		else {
			return "month: " + month  + "," + "day: " + day
					+ "year: " + year + " " + "is not holiday";
		}
		
	}

	
	
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public static void main(String[] args) {
		List<Date> list = new LinkedList<>();
		Date d1 = new Date(10,27,2022,false);
		Date d2 = new Date(6,7,2001,true);
		list.add(d1);
		list.add(d2);
		System.out.println(list);

		
		HashSet<Date> set = new HashSet<>();
		set.add(d1);
		set.add(d2);
		System.out.println(set);
    }

}
