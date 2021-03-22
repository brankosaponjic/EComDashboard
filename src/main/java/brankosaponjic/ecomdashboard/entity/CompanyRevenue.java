package brankosaponjic.ecomdashboard.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "CompanyRevenue", schema = "eComDashApp")
public class CompanyRevenue extends KeyEntity{

    @Column(name = "Revenue_Month", nullable = false)
    private String _month;
    @Column(name = "revenue", nullable = false)
    private double revenue;
    @Column(name = "expense")
    private double expense;
    @Column(name = "margins")
    private double margins;

}