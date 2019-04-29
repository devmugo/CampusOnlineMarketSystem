package models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TransactionClass.class)
public abstract class TransactionClass_ {

	public static volatile SingularAttribute<TransactionClass, Date> date;
	public static volatile SingularAttribute<TransactionClass, String> sellerid;
	public static volatile SingularAttribute<TransactionClass, String> itemsold;
	public static volatile SingularAttribute<TransactionClass, String> buyerid;
	public static volatile SingularAttribute<TransactionClass, Integer> transactionId;

}

