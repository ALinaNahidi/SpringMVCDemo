package springdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showform")
    public String showForm(Model model){
        model.addAttribute("student",new Student());
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        System.out.println("Student name is :"+theStudent.getFirstName()+" "+
                theStudent.getLastName());
        return "student-confirmation";
    }


}