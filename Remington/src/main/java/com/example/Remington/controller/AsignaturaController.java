package com.example.Remington.controller;

        import java.util.List;

        import com.example.Remington.model.Asignatura;
        import com.example.Remington.servicios.AsignaturaService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.DeleteMapping;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.PutMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/asignatura")
public class AsignaturaController {

    @Autowired
    private AsignaturaService asignaturaService;


    @PostMapping("/add")
    public Asignatura add(@RequestBody Asignatura asignatura){
        return asignaturaService.saveAsignatura(asignatura);
    }


    @GetMapping("/listarAsignatura")
    public List<Asignatura> getAllAsignatura(){
        return asignaturaService.getAllAsignatura();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminar(@PathVariable Integer id){
        asignaturaService.delete(id);
    }

    @PutMapping("/actualizar/{id}")
    public Asignatura actualizar(@RequestBody Asignatura asignatura , @PathVariable Integer id){
        Asignatura asignaturaActual = asignaturaService.findById(id);
        asignaturaActual.setCodigo(asignatura.getCodigo());
        asignaturaActual.setCreditos(asignatura.getCreditos());
        asignaturaActual.setDescripcion(asignatura.getDescripcion());
        asignaturaActual.setNombre(asignatura.getNombre());
        asignaturaActual.setPre_requisito(asignatura.getPre_requisito());
        asignaturaActual.setDocente(asignatura.getDocente());

        return asignaturaService.saveAsignatura(asignaturaActual);

    }

    @GetMapping("/{id}")
    public Asignatura obtenerAsignaturaPorId(@PathVariable Integer id){
        return  asignaturaService.findById(id);
    }


}
