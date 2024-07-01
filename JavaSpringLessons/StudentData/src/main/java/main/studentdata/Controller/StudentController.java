package main.studentdata.Controller;

import lombok.RequiredArgsConstructor;
import main.studentdata.Dto.StudentDto;
import main.studentdata.Entity.Student;
import main.studentdata.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/create")
    public Student create(@RequestBody StudentDto student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/updateById/{id}")
    public Student updateById(@PathVariable Long id, @RequestBody StudentDto student) {
        return studentService.updateStudentById(id, student);
    }
}
