package co.edu.uceva.usuarioservice.model.service;

import co.edu.uceva.usuarioservice.model.dao.IUsuarioDao;
import co.edu.uceva.usuarioservice.model.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
    @Autowired
    IUsuarioDao usuarioDao;
    @Override
    public Usuario save(Usuario usuario){
        return usuarioDao.save(usuario);
    }
    @Override
    public void delete(Usuario usuario){
        usuarioDao.delete(usuario);
    }
    @Override
    public Usuario update(Usuario usuario){
        return usuarioDao.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }


    @Override
    public Usuario findById(Long id) {
        return (Usuario) usuarioDao.findById(id).get();
    }

}
