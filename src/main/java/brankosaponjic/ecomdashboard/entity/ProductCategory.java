package brankosaponjic.ecomdashboard.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ProductCategory", schema = "eComDashApp")
public class ProductCategory extends KeyEntity{
    private String categoryName;
    private int percentage;
    private boolean bestCategory;
}
