package com.ra.controller;

import com.ra.entity.StudentEntity;
import com.ra.entity.StudentRequest;
import com.ra.service.StudentService;
import com.ra.service.Upfile;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {
    @Autowired
    private StudentService service;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private Upfile upfile;

    @GetMapping("/Home")
    public String showAll(Model model) {
        model.addAttribute("student", service.showAll());
        return "/home";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("student", new StudentRequest());
        return "/add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute("student") StudentRequest studentRequest) {
        studentRequest.setImageUrl(upfile.upload(studentRequest.getImg()));
        StudentEntity student = modelMapper.map(studentRequest, StudentEntity.class);
        service.add(student);
        return "redirect:/Home";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") int id) {
        StudentEntity studentEntity = service.findID(id);
        StudentRequest request = modelMapper.map(studentEntity, StudentRequest.class);
        model.addAttribute("student", request);
        return "/update";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("student") StudentRequest request) {
        StudentEntity studentEntity = modelMapper.map(request, StudentEntity.class);
        studentEntity.setId(id);
        studentEntity.setImageUrl(upfile.upload(request.getImg()));
        service.update(studentEntity);
        return "redirect:/Home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        service.delete(id);
        return "redirect:/Home";
    }

}
