package springdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
@Slf4j
public class CustomerController {

    //add an initbinder to convert trim input string
    //to remove whitespaces to resolve issue for our validation

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }




    @RequestMapping("/showform")
    public String showCustomerForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer theCustomer
    , BindingResult theBindingResult){

        log.info("{}",theBindingResult);

        if (theBindingResult.hasErrors()){
            return "customer-form";
        }
        else {
            return "customer-confirmation";
        }
    }
}
