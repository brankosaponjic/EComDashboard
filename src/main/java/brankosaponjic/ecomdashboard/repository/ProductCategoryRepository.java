package brankosaponjic.ecomdashboard.repository;

import brankosaponjic.ecomdashboard.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier(value = "ProductCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
    List<ProductCategory> findByBestCategory(boolean bestCategory);
}
