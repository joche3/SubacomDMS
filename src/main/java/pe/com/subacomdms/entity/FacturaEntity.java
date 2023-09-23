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

public class FacturaEntity extends DocumentoEntity{
    private String id_factura;
    private String numero_factura;
    private Date fecha_emision;
    private int ruc_cliente;
    private String razon_social;
    private float monto_total;
    private boolean estado_comprobante;
}
