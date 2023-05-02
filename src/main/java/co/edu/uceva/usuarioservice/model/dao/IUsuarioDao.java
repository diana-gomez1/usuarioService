package co.edu.uceva.usuarioservice.model.dao;
import co.edu.uceva.usuarioservice.model.entities.Usuario;
import org.springframework.data.repository.CrudRepository;


public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
}
