package com.github.eprudnikov.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.eprudnikov.service.VacationService;

/**
 * Just an example of how controller could be implemented.
 */
@Controller
public class WelcomeController {
    private static Log logger = LogFactory.getLog(WelcomeController.class);

    @Autowired
    private VacationService vacationService;

    @RequestMapping("/")
    public String welcome(@RequestParam(name = "name", required = false, defaultValue = "world") String name,
                          Model model) {
        logger.info("Welcome page is called.");

        model.addAttribute("name", name);
        model.addAttribute("vacations", vacationService.findAll());
        return "welcome";
    }
}
