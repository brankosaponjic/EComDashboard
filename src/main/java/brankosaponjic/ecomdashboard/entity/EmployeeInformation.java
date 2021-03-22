package brankosaponjic.ecomdashboard.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "EmployeeInformation", schema = "eComDashApp")
public class EmployeeInformation extends KeyEntity{

    @Column(name = "Employee_Name")
    private String _name;
    private String position;
    private String officeLocation;
    private int age;
    private Date startDate;
    private double salary;
}