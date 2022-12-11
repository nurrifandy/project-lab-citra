package project.labcitra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.labcitra.model.PasienModel;

@Repository
public interface PasienRepository extends JpaRepository<PasienModel, Long>{

}
