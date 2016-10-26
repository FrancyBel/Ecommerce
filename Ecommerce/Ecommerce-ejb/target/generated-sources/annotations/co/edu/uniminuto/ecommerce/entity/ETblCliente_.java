package co.edu.uniminuto.ecommerce.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETblCliente.class)
public abstract class ETblCliente_ {

	public static volatile ListAttribute<ETblCliente, ETblOrdenCliente> eTblOrdenClienteList;
	public static volatile SingularAttribute<ETblCliente, String> ciudadRegion;
	public static volatile SingularAttribute<ETblCliente, String> ccNumero;
	public static volatile SingularAttribute<ETblCliente, String> direccion;
	public static volatile SingularAttribute<ETblCliente, Integer> id;
	public static volatile SingularAttribute<ETblCliente, String> telefono;
	public static volatile SingularAttribute<ETblCliente, String> nombre;
	public static volatile SingularAttribute<ETblCliente, String> email;

}

