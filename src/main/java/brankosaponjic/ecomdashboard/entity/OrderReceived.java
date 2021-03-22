package brankosaponjic.ecomdashboard.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "OrderReceived", schema = "eComDashApp")
public class OrderReceived extends KeyEntity{
    private int orderReceived;
    private String dateReceived;
}
