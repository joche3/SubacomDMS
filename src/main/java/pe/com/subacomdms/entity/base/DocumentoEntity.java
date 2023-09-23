package pe.com.subacomdms.entity.base;

import java.util.Date;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class DocumentoEntity {
    private int id_registro;
    private String tipo_documento;
    private Date fecha_registro;
    private String descripcion_registro;
}
