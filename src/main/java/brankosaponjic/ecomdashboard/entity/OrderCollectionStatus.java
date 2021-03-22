package brankosaponjic.ecomdashboard.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "OrderCollectionStatus", schema = "eComDashApp")
public class OrderCollectionStatus extends KeyEntity{
    private int newOrders;
    private double revenue;
    private int shipped;
    private int returned;
}