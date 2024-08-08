package org.esfe.servicios.implementaciones;

import org.esfe.modelos.Grupo;
import org.esfe.repositorios.IGrupoRepositorios;
import org.esfe.servicios.interfaces.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService implements IGrupoService {

    @Autowired
    private IGrupoRepositorios grupoRepositorios;

    @Override
    public Page<Grupo> buscarTodosPaginados(Pageable pageable) {
        return grupoRepositorios.findAll(pageable);
    }

    @Override
    public List<Grupo> obtenerTodos() {
        return grupoRepositorios.findAll();
    }

    @Override
    public Optional<Grupo> buscarPorId(Integer Id) {
        return grupoRepositorios.findById(Id);
    }

    @Override
    public Grupo crearOEditar(Grupo grupo) {
        return grupoRepositorios.save(grupo);
    }

    @Override
    public void eliminarPorId(Integer Id) {
        grupoRepositorios.deleteById(Id);

    }
}
