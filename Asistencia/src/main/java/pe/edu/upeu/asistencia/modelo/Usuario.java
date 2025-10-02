package pe.edu.upeu.asistencia.modelo;


import jakarta.persistence.*;
import lombok.*;
import pe.edu.upeu.asistencia.enums.Perfil;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(length = 8, nullable = false)
    private String dni;

    @Column(length = 60, nullable = false)
    private String clave;

    @Enumerated(EnumType.STRING)
    @Column(length = 16, nullable = false)
    private Perfil perfil;
}