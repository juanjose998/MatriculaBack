package com.example.Remington.servicios;

        import java.util.List;

        import com.example.Remington.model.Asignatura;

public interface AsignaturaService {


    public Asignatura saveAsignatura(Asignatura asignatura);
    public List<Asignatura> getAllAsignatura();
    public void delete(Integer id);
    public Asignatura findById(Integer id);

}
