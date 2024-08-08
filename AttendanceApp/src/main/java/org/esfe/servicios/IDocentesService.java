package org.esfe.servicios;

import org.esfe.modelos.Docente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocentesService {
    Page<Docente>buscarTodosPaginados(Pageable pageable);

    List<Docente> obtenerTodos();

    Optional<Docente> buscarPorId(Integer id);

    Docente crearOEditar(Docente docente);

     void eliminarPorId(Integer id);
}
