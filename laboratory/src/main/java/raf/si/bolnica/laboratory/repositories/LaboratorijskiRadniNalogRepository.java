package raf.si.bolnica.laboratory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raf.si.bolnica.laboratory.entities.LaboratorijskiRadniNalog;
import raf.si.bolnica.laboratory.entities.Uput;

@Repository
public interface LaboratorijskiRadniNalogRepository extends JpaRepository<LaboratorijskiRadniNalog, Long> {
    LaboratorijskiRadniNalog findByLaboratorijskiRadniNalogId(Long id);
}
