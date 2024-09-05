package com.bookstore.controller;

import lombok.RequiredArgsConstructor;
import com.bookstore.dto.requestdto.CategoryRequestDto;
import com.bookstore.dto.responsedto.CategoryResponseDto;
import com.bookstore.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("/create")
    public CategoryResponseDto addCategory(@RequestBody CategoryRequestDto requestDto) {
        return categoryService.createCategory(requestDto);
    }

    @GetMapping("/getAll")
    public List<CategoryResponseDto> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/getId/{id}")
    public CategoryResponseDto getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @DeleteMapping("/deleteId/{id}")
    public CategoryResponseDto deleteCategoryById(@PathVariable Long id) {
        return categoryService.deleteCategoryById(id);
    }
}
