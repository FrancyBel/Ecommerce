package co.edu.uniminuto.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETblOrdenCliente.class)
public abstract class ETblOrdenCliente_ {

	public static volatile SingularAttribute<ETblOrdenCliente, Integer> numeroConfirmacion;
	public static volatile SingularAttribute<ETblOrdenCliente, ETblCliente> eTblClienteId;
	public static volatile SingularAttribute<ETblOrdenCliente, Date> fechaCreacion;
	public static volatile SingularAttribute<ETblOrdenCliente, Integer> id;
	public static volatile SingularAttribute<ETblOrdenCliente, BigDecimal> cantidad;
	public static volatile ListAttribute<ETblOrdenCliente, ETblProductoSolicitado> eTblProductoSolicitadoList;

}

