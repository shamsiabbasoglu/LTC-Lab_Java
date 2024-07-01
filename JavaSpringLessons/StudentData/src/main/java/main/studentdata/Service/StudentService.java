package main.studentdata.Service;

import lombok.RequiredArgsConstructor;
import main.studentdata.Dto.StudentDto;
import main.studentdata.Entity.Student;
import main.studentdata.Repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public Student addStudent(StudentDto studentDto) {
        Student student = Student.builder()
                .firstName(studentDto.getFirstName())
                .lastName(studentDto.getLastName())
                .email(studentDto.getEmail())
                .age(studentDto.getAge())
                .build();
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    public void deleteStudentById(Long id) {
        if (studentRepo.existsById(id)) {
            Student student = getStudentById(id);
            studentRepo.deleteById(id);
            System.out.println(student.getFirstName() + " "
                    + student.getLastName() + " deleted successfully");
        } else {
            System.out.println("Student not found");
        }
    }

    public Student updateStudentById(Long id, StudentDto studentDto) {
        if (studentRepo.existsById(id)) {
            Student oldStudent = getStudentById(id);
            oldStudent.setFirstName(studentDto.getFirstName());
            oldStudent.setLastName(studentDto.getLastName());
            oldStudent.setEmail(studentDto.getEmail());
            oldStudent.setAge(studentDto.getAge());
            return studentRepo.save(oldStudent);
        } else {
            Student newStudent = Student.builder()
                    .firstName(studentDto.getFirstName())
                    .lastName(studentDto.getLastName())
                    .email(studentDto.getEmail())
                    .age(studentDto.getAge())
                    .build();
            return studentRepo.save(newStudent);
        }
    }
}
