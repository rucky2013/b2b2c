package com.shopping.core.dialect;

import org.hibernate.Hibernate;
import org.hibernate.dialect.MySQL5Dialect;

public class SystemMySQL5Dialect extends MySQL5Dialect {
	public SystemMySQL5Dialect() {
		registerHibernateType(-1, Hibernate.TEXT.getName());
	}
}