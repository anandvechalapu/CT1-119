·       User should be able to select the date, month, year in calendar.·       User should be able to enter the date manually.·       Drop down menu should be selectable to select the month.·       Date should be displayed as per selection done by the user.·       Once date and year is selected automatically calendar should be closed.

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class SelectingDatesService {

    public Calendar selectDateMonthYearCalendar(Calendar calendar) {
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        return calendar;
    }

    public void selectDateMonthYearManually(int date, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, date);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);
        calendar.setTimeInMillis(calendar.getTimeInMillis());
    }

    public void selectMonthFromDropDownMenu(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month);
        calendar.setTimeInMillis(calendar.getTimeInMillis());
    }

}