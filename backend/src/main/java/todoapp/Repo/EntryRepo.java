package todoapp.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import todoapp.Entries.Entries;
@Repository
public interface EntryRepo extends MongoRepository<Entries, String> {

}
