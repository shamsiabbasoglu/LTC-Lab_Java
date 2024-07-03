package main.student.controller;

import lombok.RequiredArgsConstructor;
import main.student.dto.StudentDto;
import main.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/create")
    public StudentDto create(@RequestBody StudentDto student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getAll")
    public List<StudentDto> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/findById/{id}")
    public StudentDto findById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Long id) {
        return studentService.deleteStudentById(id);
    }

    @PutMapping("/updateById/{id}")
    public StudentDto updateById(@PathVariable Long id, @RequestBody StudentDto student) {
        return studentService.updateStudentById(id, student);
    }
}
