package com.danielhh.apirestEstudiante.controller;

import com.danielhh.apirestEstudiante.model.Estudiante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstudianteController {

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



}
