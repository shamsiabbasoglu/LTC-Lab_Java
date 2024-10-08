package com.bookstore.controller;

import lombok.RequiredArgsConstructor;
import com.bookstore.dto.responsedto.goodreadsdto.Root;
import com.bookstore.service.GoodReadsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GoodReadsController {
    private final GoodReadsService goodReadsService;

    @GetMapping("/get{input}")
    public List<Root> getBooks(@PathVariable String input) {
        return goodReadsService.getAuthorBooks(input);
    }
}
