package com.example.Remington.servicios.impl;

        import java.util.List;

        import com.example.Remington.model.Asignatura;
        import com.example.Remington.repository.AsignaturaRepository;
        import com.example.Remington.servicios.AsignaturaService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;


@Service
public class AsignaturaServiceImpl  implements AsignaturaService {


    @Autowired
    private AsignaturaRepository asignaturaRepository;


    @Override
    public Asignatura saveAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);

    }

    @Override
    public List<Asignatura> getAllAsignatura() {
        return (List<Asignatura>) asignaturaRepository.findAll();

    }

    @Override
    public void delete(Integer id) {
        asignaturaRepository.deleteById(id);

    }

    @Override
    public Asignatura findById(Integer id) {
        return asignaturaRepository.findById(id).orElse(null);
    }
}
