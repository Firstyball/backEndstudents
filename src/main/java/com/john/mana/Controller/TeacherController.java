package com.john.mana.Controller;

import com.john.mana.Model.Student;
import com.john.mana.Model.Teacher;
import com.john.mana.Repository.StudentRepository;
import com.john.mana.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/profesores")
public class TeacherController {


    @Autowired
    private TeacherRepository teacherRepository;

    @PostMapping("/create")
    public void CreateTeacher(@RequestBody Teacher teacher){
        teacherRepository.insert(teacher);
    }

    @DeleteMapping("/delete/{id}")
    public void DeleteTeacher(@PathVariable String id){
        teacherRepository.deleteById(id);
    }

    @GetMapping("/list")
    public List<Teacher> ListTeacher(){
        return teacherRepository.findAll();
    }

    @PutMapping("/update")
    public Teacher UpdateTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
