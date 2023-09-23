package pe.com.subacomdms.entity;

import java.util.Date;
import lombok.*;
import lombok.experimental.SuperBuilder;
import pe.com.subacomdms.entity.base.DocumentoEntity;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)

public class BoletaEntity extends DocumentoEntity{
    private String id_boleta;
    private String numero_boleta;
    private Date fecha_emision;
    private int dni_cliente;
    private float monto_total;
    private boolean estado_comprobante;
}
