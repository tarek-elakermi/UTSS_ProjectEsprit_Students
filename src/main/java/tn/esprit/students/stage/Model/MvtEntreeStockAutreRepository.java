package tn.esprit.students.stage.Model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MvtEntreeStockAutreRepository extends MongoRepository<MvtEntreeStockAutre, String> {

}
