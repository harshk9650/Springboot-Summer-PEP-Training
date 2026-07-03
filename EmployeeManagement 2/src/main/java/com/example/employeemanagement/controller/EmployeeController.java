package com.example.employeemanagement.controller;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String home() {
        return "index"; // Simple menu page
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/create")
    public String createEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "create";
        }
        
        // Set Salary based on Designation
        if ("PROG".equals(employee.getDesignation())) {
            employee.setSalary(25000.0);
        } else if ("MANG".equals(employee.getDesignation())) {
            employee.setSalary(30000.0);
        } else if ("TEST".equals(employee.getDesignation())) {
            employee.setSalary(20000.0);
        }
        
        employeeRepository.save(employee);
        return "redirect:/display";
    }

    @GetMapping("/display")
    public String displayEmployees(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "display";
    }

    @GetMapping("/raise-salary")
    public String showRaiseSalaryForm(Model model) {
        return "raise_salary";
    }

    @PostMapping("/raise-salary")
    public String raiseSalary(@RequestParam("name") String name, 
                              @RequestParam("percentage") Integer percentage, 
                              Model model) {
        
        if (percentage < 1 || percentage > 10) {
            model.addAttribute("error", "Percentage must be between 1 and 10.");
            return "raise_salary";
        }

        Optional<Employee> empOpt = employeeRepository.findByName(name);
        if (empOpt.isEmpty()) {
            model.addAttribute("error", "Employee not found.");
            return "raise_salary";
        }

        Employee emp = empOpt.get();
        double currentSalary = emp.getSalary();
        double increase = currentSalary * (percentage / 100.0);
        emp.setSalary(currentSalary + increase);
        employeeRepository.save(emp);

        return "raise_success";
    }

    @GetMapping("/exit")
    public String exitPage() {
        return "exit";
    }
}
