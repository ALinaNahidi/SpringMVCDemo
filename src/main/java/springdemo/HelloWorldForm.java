package springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/hello")
public class HelloWorldForm {

    //To get the data first
    @RequestMapping("/showform")
    public String showForm(){

        return "HelloWorld-form";
    }

    //To process data
    @RequestMapping("/processedform")
    public String processForm(){
        return "ProcessedForm";
    }

    @RequestMapping("/processedform1")
    public String processedFromVersion2(@RequestParam("studentName") String sName, Model model){
        String name = sName.toUpperCase();
        String result = "Hey! " + name;

        model.addAttribute("message",result);

        return "ProcessedForm";

    }

}
