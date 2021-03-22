package brankosaponjic.ecomdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "brankosaponjic.ecomdashboard.repository")
@EntityScan(basePackages = "brankosaponjic.ecomdashboard.entity")
public class EcomdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomdashboardApplication.class, args);
    }
}