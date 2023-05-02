package co.edu.uceva.usuarioservice.model.service;
import co.edu.uceva.usuarioservice.model.entities.Usuario;

import java.util.List;


public interface IUsuarioService {
    Usuario save(Usuario usuario);
    void delete(Usuario usuario);
    Usuario update(Usuario usuario);

    List<Usuario> findAll();
    Usuario findById(Long id);
}


