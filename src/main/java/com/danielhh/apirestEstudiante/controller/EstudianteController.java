package com.danielhh.apirestEstudiante.controller;

import com.danielhh.apirestEstudiante.model.Estudiante;
import com.danielhh.apirestEstudiante.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("api/estudiantes")
    public List<Estudiante> obtenerEstudiantes(){
        List<Estudiante> listaEstudiante=new ArrayList<>();
        Estudiante e=new Estudiante();
        e.setId(1);
        e.setNombres("Daniel");
        e.setApellidos("Hernandez");
        e.setEmail("daniel@hotmail.com");
        e.setNota(5D);

        Estudiante e2=new Estudiante();
        e2.setId(2);
        e2.setNombres("Patricia");
        e2.setApellidos("Martin");
        e2.setEmail("aptricia@hotmail.com");
        e2.setNota(8D);

        listaEstudiante.add(e);
        listaEstudiante.add(e2);

        return listaEstudiante;
    }

    @PostMapping("api/estudiante")
    public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante){
        System.out.println(estudiante);
        estudianteService.guardarEstudiante(estudiante);
        return estudiante;
    }

    @GetMapping("api/lista")
    public List<Estudiante> obtener(){
        return estudianteService.obtenerTodos();
    }

    @GetMapping("api/estudiantes/{id}")
    public Estudiante obtenerEstudiante(@PathVariable("id") Integer id){
        return estudianteService.obtenerEstudiante(id);
    }
    @PutMapping("api/estudiante")
    public void actualizarEstudiante(@RequestBody Estudiante estudiante){
        System.out.println(estudiante);
        estudianteService.actualizarEstudiante(estudiante);
    }

    @DeleteMapping("api/estudiante/{id}")
    public void eliminarEstudiante (@PathVariable("id") Integer id){
        estudianteService.elimarEstudiante(id);
    } 

}
