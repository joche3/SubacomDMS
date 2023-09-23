package pe.com.subacomdms.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import pe.com.subacomdms.entity.base.DocumentoEntity;


@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)

public class UsuarioEntity extends DocumentoEntity{
    private int id_usuario;
    private String usuario_nombres;
    private String usuario_apellidos;
    private String usuario_email;  
}
