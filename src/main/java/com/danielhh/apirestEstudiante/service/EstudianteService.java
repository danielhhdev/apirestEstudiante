package com.danielhh.apirestEstudiante.service;

import com.danielhh.apirestEstudiante.model.Estudiante;
import com.danielhh.apirestEstudiante.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianterepository;

    public void guardarEstudiante(Estudiante estudiante){
        estudianterepository.save(estudiante);
    }

    public List<Estudiante> obtenerTodos(){
        return estudianterepository.findAll();
    }

    /*
    Encapsulamos en un Optional el estudiante obtenido por el id
    Si hay un estudiante en el opcitonal entonces se retorna lo que haya en el optional
    sino se manda un estudiante nuevo
     */
    public Estudiante obtenerEstudiante(Integer id){
        Optional <Estudiante> opt =estudianterepository.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }else{
            return new Estudiante();
        }
    }

    public Estudiante actualizarEstudiante(Estudiante estudiante){
        return estudianterepository.save(estudiante);
    }

    public void elimarEstudiante(Integer id){
        estudianterepository.deleteById(id);
    }
}
