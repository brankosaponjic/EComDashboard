package brankosaponjic.ecomdashboard.controller;

import brankosaponjic.ecomdashboard.entity.EmployeeInformation;
import brankosaponjic.ecomdashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restEndpointController {

    @Autowired
    private DashboardService dashboardService;

    @RequestMapping("/employees")
    public List<EmployeeInformation> getAllEmployees() {
        return dashboardService.getAllEmployee();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employee/add")
    public String saveEmployeeInfo(@RequestBody EmployeeInformation employeeInformation) {
        if (dashboardService.addEmployee(employeeInformation) !=null) {
            return "Employee data saved successfully!";
        } else {
            return "Error saving employee info";
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employee/delete")
    public String deleteEmployee(@RequestParam(name = "empId", required = true) String pk) {
        try{
            dashboardService.deleteEmployee(dashboardService.findEmployee(pk));
            return "Deleted";
        } catch (Exception e) {
            return "Error";
        }
    }
}