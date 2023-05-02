package co.edu.uceva.usuarioservice.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Email(message = "Ingrese un correo valido")
    private String email;

    @NotNull
    @Size(min=8, max = 20, message = "La contraseña debe terner al menos 8 caracteres y maximo 20")
    private String contrasena;

    private String nombre;
    private String apellidos;

}
