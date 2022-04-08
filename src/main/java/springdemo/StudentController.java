package springdemo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
@Slf4j
public class StudentController {

    @RequestMapping("/showform")
    public String showForm(Model model){
        model.addAttribute("student",new Student());
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        log.info(theStudent.getFirstName()+" "+theStudent.getFirstName());
        return "student-confirmation";
    }


}
