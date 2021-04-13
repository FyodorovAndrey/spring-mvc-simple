package com.nvfredy.controller;

import com.nvfredy.domain.Customer;
import com.nvfredy.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {

    private final CustomerServiceImpl service;

    public CustomerController(CustomerServiceImpl service) {
        this.service = service;
    }


    @RequestMapping("/")
    public String modelAndView(Model model) {

        List<Customer> customers = service.findAll();

        model.addAttribute("customers", customers);

        return "index";
    }

    @RequestMapping("/create")
    public String createNewCustomerForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCustomer(Customer customer) {
        service.createCustomer(customer);
        return "redirect:/";
    }

    @RequestMapping("/edit")
    public String editCustomer(@RequestParam Long id, Model model) {
        Customer customer = service.getOneById(id);

        model.addAttribute("customer", customer);

        return "edit";
    }

    @RequestMapping("/delete")
    public String deleteCustomer(@RequestParam Long id) {
        service.deleteCustomerById(id);
        return "redirect:/";
    }

    @RequestMapping("/search")
    public String search(@RequestParam String keyword, Model model) {
        List<Customer> customerList = service.search(keyword);

        model.addAttribute("customers", customerList);

        return "search";
    }
}
