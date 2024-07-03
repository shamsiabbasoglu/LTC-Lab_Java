package main.student.service;

import lombok.RequiredArgsConstructor;
import main.student.dto.StudentDto;
import main.student.entity.StudentEntity;
import main.student.repo.StudentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;
    private final ModelMapper modelMapper;

    public StudentDto addStudent(StudentDto studentDto) {
        StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);
        return modelMapper.map(studentRepo.save(studentEntity), StudentDto.class);
    }

    public List<StudentDto> getAllStudents() {
        List<StudentEntity> studentEntities = studentRepo.findAll();
        return studentEntities.stream()
                .map(studentEntity -> modelMapper.map(studentEntity, StudentDto.class))
                .toList();
    }

    public StudentDto getStudentById(Long id) {
        StudentEntity studentEntity = studentRepo.findById(id).orElse(null);
        return modelMapper.map(studentEntity, StudentDto.class);
    }

    public String deleteStudentById(Long id) {
        if (studentRepo.existsById(id)) {
            StudentEntity student = studentRepo.findById(id).orElseThrow();
            studentRepo.deleteById(id);
            return student.getFirstName() + " "
                    + student.getLastName() + " deleted successfully";
        } else {
            return "Student not found";
        }
    }

    public StudentDto updateStudentById(Long id, StudentDto studentDto) {
        StudentEntity studentEntity = studentRepo.findById(id).orElseThrow();
        modelMapper.map(studentDto, studentEntity);
        return modelMapper.map(studentRepo.save(studentEntity), StudentDto.class);
    }
}
