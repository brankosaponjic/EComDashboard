package brankosaponjic.ecomdashboard.service;

import brankosaponjic.ecomdashboard.entity.*;

import java.util.List;

public interface DashboardService {

    List<CompanyRevenue> getTodayRevenueDash();

    List<ProductCategory> getBestCategory();

    List<OrderReceived> getAllOrderReceived();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();

    EmployeeInformation findEmployee(final String pk);

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

    void deleteEmployee(EmployeeInformation employeeInformation);
}
