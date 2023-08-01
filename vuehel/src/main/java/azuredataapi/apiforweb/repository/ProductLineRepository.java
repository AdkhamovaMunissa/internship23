package azuredataapi.apiforweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import azuredataapi.apiforweb.model.ProductLine;

@EnableJpaRepositories
@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine, Long>{
    List<ProductLine> findByFullProductLine(String fullProductLine);
}
