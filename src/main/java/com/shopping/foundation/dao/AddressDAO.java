package com.shopping.foundation.dao;

import org.springframework.stereotype.Repository;

import com.shopping.core.base.GenericDAO;
import com.shopping.foundation.domain.Address;

@Repository("addressDAO")
public class AddressDAO extends GenericDAO<Address> {
}
