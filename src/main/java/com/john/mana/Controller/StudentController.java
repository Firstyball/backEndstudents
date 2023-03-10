package com.john.mana.Controller;



import com.john.mana.Model.Student;
import com.john.mana.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/create")
    public void CreateStudent(@RequestBody Student student){
        studentRepository.insert(student);
    }

    @DeleteMapping("/delete/{id}")
    public void DeleteStudent(@PathVariable String id){
        studentRepository.deleteById(id);
    }


    @GetMapping("/list")
    public List<Student> ListStudent(){
        return studentRepository.findAll();
    }

    @PutMapping("/update")
    public Student UpdateStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}
