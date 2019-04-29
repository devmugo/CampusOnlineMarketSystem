package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Upload.class)
public abstract class Upload_ {

	public static volatile SingularAttribute<Upload, Date> date;
	public static volatile SingularAttribute<Upload, byte[]> image;
	public static volatile SingularAttribute<Upload, String> nationalid;
	public static volatile SingularAttribute<Upload, Integer> itemindex;
	public static volatile SingularAttribute<Upload, Double> price;
	public static volatile SingularAttribute<Upload, String> category;
	public static volatile SingularAttribute<Upload, String> cond;
	public static volatile SingularAttribute<Upload, String> brand;
	public static volatile SingularAttribute<Upload, String> age;

}

