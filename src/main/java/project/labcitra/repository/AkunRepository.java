package project.labcitra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.labcitra.model.AkunModel;

@Repository
public interface AkunRepository extends JpaRepository<AkunModel, Long>{

}
