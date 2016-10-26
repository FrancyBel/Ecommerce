package co.edu.uniminuto.ecommerce.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ETblCategoria.class)
public abstract class ETblCategoria_ {

	public static volatile SingularAttribute<ETblCategoria, String> path;
	public static volatile SingularAttribute<ETblCategoria, Integer> id;
	public static volatile ListAttribute<ETblCategoria, ETblProducto> eTblProductoList;
	public static volatile SingularAttribute<ETblCategoria, String> nombre;

}

