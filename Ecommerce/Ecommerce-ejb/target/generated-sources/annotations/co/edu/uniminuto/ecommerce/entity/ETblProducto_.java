package co.edu.uniminuto.ecommerce.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETblProducto.class)
public abstract class ETblProducto_ {

	public static volatile SingularAttribute<ETblProducto, String> descripcion;
	public static volatile SingularAttribute<ETblProducto, Integer> precio;
	public static volatile SingularAttribute<ETblProducto, ETblCategoria> eTblCategoriaId;
	public static volatile SingularAttribute<ETblProducto, Integer> id;
	public static volatile SingularAttribute<ETblProducto, Date> ultimaModificacion;
	public static volatile SingularAttribute<ETblProducto, String> nombre;
	public static volatile ListAttribute<ETblProducto, ETblProductoSolicitado> eTblProductoSolicitadoList;

}

