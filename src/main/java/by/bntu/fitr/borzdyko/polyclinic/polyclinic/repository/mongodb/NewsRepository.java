package by.bntu.fitr.borzdyko.polyclinic.polyclinic.repository.mongodb;

import by.bntu.fitr.borzdyko.polyclinic.polyclinic.model.mongo.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<News, String> {
}
