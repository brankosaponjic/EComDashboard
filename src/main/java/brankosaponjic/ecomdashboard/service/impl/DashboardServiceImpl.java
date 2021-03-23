package brankosaponjic.ecomdashboard.service.impl;

import brankosaponjic.ecomdashboard.entity.*;
import brankosaponjic.ecomdashboard.repository.*;
import brankosaponjic.ecomdashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DashboardServiceImpl implements DashboardService {
    @Autowired
    private CompanyRevenueRepository companyRevenueRepository;

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private EmployeeInformationRepository employeeInformationRepository;

    @Autowired
    private OrderCollectionStatusRepository orderCollectionStatusRepository;

    @Autowired
    private OrderReceivedRepository orderReceivedRepository;

    @Override
    public List<CompanyRevenue> getTodayRevenueDash() {
        return companyRevenueRepository.findAll();
    }

    @Override
    public List<ProductCategory> getBestCategory() {
        return productCategoryRepository.findByBestCategory(true);
    }

    @Override
    public List<OrderReceived> getAllOrderReceived() {
        return orderReceivedRepository.findAll();
    }

    @Override
    public List<OrderCollectionStatus> getOrderCollection() {
        return orderCollectionStatusRepository.findAll();
    }

    @Override
    public List<EmployeeInformation> getAllEmployee() {
        return employeeInformationRepository.findAll();
    }

    @Override
    public EmployeeInformation findEmployee(String pk) {
        return employeeInformationRepository.findByPk(pk);
    }

    @Override
    public EmployeeInformation addEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public void deleteEmployee(EmployeeInformation employeeInformation) {
        employeeInformationRepository.delete(employeeInformation);
    }
}
