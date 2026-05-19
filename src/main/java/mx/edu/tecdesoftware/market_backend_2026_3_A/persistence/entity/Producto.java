package mx.edu.tecdesoftware.market_backend_2026_3_A.persistence.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table (name = "prductos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column (name = "id_categoria")
    private Integer id_categoria;

    @Column (name = "coodigo_barras")
    private String codigoBarras;

    @Column (name = "precio_venta")
    private Double precioVenta;

    @Column (name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;


}