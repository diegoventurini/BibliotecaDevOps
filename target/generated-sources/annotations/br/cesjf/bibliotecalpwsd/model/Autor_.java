package br.cesjf.bibliotecalpwsd.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Autor.class)
public abstract class Autor_ {

	public static volatile ListAttribute<Autor, Livro> livroList;
	public static volatile SingularAttribute<Autor, String> nome;
	public static volatile SingularAttribute<Autor, Integer> id;

	public static final String LIVRO_LIST = "livroList";
	public static final String NOME = "nome";
	public static final String ID = "id";

}

