package net.engineeringdigest.journal.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import net.engineeringdigest.journal.entity.User;

public interface UserRepository extends MongoRepository<User, ObjectId>{
	
	User findByUser(String username);

}
