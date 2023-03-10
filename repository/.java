·       Ability to select the date, month and year as per the user's requirement.

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DateRepository extends JpaRepository<Date, Long> {
	
	// Method to access calendar to set date, month, year
	public Date getDateByCalendar(Date date);
	
	// Method to select the date, month, year in calendar
	public Date getDateBySelection(Date date, int month, int year);
	
	// Method to open the calendar and enter the dates manually 
	public Date getDateByManualEntry(Date date);
	
	// Method to select the month from the drop down menu
	public Date getDateByMonth(int month);
	
	// Method to display date as per selection done by the user
	public Date getSelectedDate(Date date);
	
	// Method to select the month from the drop down menu
	public Date getMonthBySelection(int month);
	
	// Method to close the calendar automatically once date and year is selected
	public Date closeCalendar(Date date, int year);
	
	// Method to click the functionalities displayed on page
	public Date clickFunctionality(Date date);
	
	// Method to select the date, month, year as per the user's requirement
	public Date getDateByUserSelection(Date date, int month, int year);
	
}