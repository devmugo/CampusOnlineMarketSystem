package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Users.class)
public abstract class Users_ {

	public static volatile SingularAttribute<Users, String> firstName;
	public static volatile SingularAttribute<Users, String> lastName;
	public static volatile SingularAttribute<Users, String> pwencrypt;
	public static volatile SingularAttribute<Users, String> nationalId;
	public static volatile SingularAttribute<Users, String> phone;
	public static volatile SingularAttribute<Users, String> residence;
	public static volatile SingularAttribute<Users, String> email;

}

