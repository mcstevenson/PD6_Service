package co.listeningear.codefest.repository;

import co.listeningear.codefest.entity.JobDetailEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<JobDetailEntity, Integer> {

}
