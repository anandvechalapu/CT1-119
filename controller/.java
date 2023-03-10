·       Calendar should appear on click of the date field.·       Ability to enter the date manually.·       Calendar should close automatically once date is selected.·       Ability to select the month from the drop down menu.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/selecting-dates")
public class DateController {

    @GetMapping
    public ModelAndView getDatePage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selecting-dates");
        return mav;
    }

}