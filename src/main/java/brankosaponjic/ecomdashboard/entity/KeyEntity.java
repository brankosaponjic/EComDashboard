package brankosaponjic.ecomdashboard.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class KeyEntity {
    @Id
    @Column(name = "PK", unique = true)
    private String pk;
}
