package de.empulse.springbootin10steps.repository;

import de.empulse.springbootin10steps.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO: Add class description
 *
 * @author Tycho Schottelius, empulse GmbH, 2020-04-01
 */
// the repository for the class representing the collection. extends MongoRepository and provides
// the entity class and the data-type of the uniqueIdentifier.
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
