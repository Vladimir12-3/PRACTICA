package pe.edu.upeu.asistencia.modelo;

import jakarta.persistence.*;

import lombok.*;
import pe.edu.upeu.asistencia.enums.NombreEvento;
import pe.edu.upeu.asistencia.enums.Tipo;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Integer idEvento;

    @Enumerated(EnumType.STRING)
    @Column(name = "nombre_evento", length = 30, nullable = false)
    private NombreEvento nombreEvento;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private Tipo tipo;

    @Column(name = "estado_evento", length = 15, nullable = false)
    private String estadoEvento;

    @Column(name = "cantidad_registro", nullable = false)
    private int cantidadRegistro;
}