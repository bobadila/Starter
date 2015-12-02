package com.github.eprudnikov.web;

import com.github.eprudnikov.service.EmployeeService;
import com.github.eprudnikov.service.VacationService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Just an example of how controller could be implemented.
 */
@Controller
public class WelcomeController {
    private static Log logger = LogFactory.getLog(WelcomeController.class);

    @Autowired
    private VacationService vacationService;

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String welcome(@RequestParam(name = "name", required = false, defaultValue = "world") String name,
                          Model model) {
        logger.info("Welcome page is called.");

        model.addAttribute("name", name);
        model.addAttribute("employees", employeeService.findAll());
        return "welcome";
    }

    @RequestMapping("/employee_vacations/{id}")
    public String employeeVacations(@PathVariable long id, Model model) {
        logger.info("Vacations page for employee with id=" + id + " is called.");

        model.addAttribute("employee", employeeService.findById(id));
        return "employee";
    }
}
