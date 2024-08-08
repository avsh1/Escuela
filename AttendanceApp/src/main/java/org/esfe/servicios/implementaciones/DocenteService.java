package org.esfe.servicios.implementaciones;

import org.esfe.modelos.Docente;
import org.esfe.repositorios.IDocentesRepository;
import org.esfe.servicios.IDocentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService implements IDocentesService {
    @Autowired
    private IDocentesRepository docentesRepository;

    @Override
    public Page<Docente> buscarTodosPaginados(Pageable pageable) {
        return docentesRepository.findAll(pageable);
    }

    @Override
    public List<Docente> obtenerTodos() {
        return docentesRepository.findAll();
    }

    @Override
    public Optional<Docente> buscarPorId(Integer id) {
        return docentesRepository.findById(id);
    }

    @Override
    public Docente crearOEditar(Docente docente) {
        return docentesRepository.save(docente);
    }

    @Override
    public void eliminarPorId(Integer id) {
        docentesRepository.deleteById(id);

    }
}
