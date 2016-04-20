package com.shopping.foundation.dao;

import org.springframework.stereotype.Repository;

import com.shopping.core.base.GenericDAO;
import com.shopping.foundation.domain.Activity;

@Repository("activityDAO")
public class ActivityDAO extends GenericDAO<Activity> {
}
