package com.john.mana.Repository;

import com.john.mana.Model.Student;
import com.john.mana.Model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
}
