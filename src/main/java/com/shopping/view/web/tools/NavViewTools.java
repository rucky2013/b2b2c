package com.shopping.view.web.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.foundation.domain.Navigation;
import com.shopping.foundation.service.INavigationService;

@Component
public class NavViewTools {

	@Autowired
	private INavigationService navService;

	public List<Navigation> queryNav(int location, int count) {
		List navs = new ArrayList();
		Map params = new HashMap();
		params.put("display", Boolean.valueOf(true));
		params.put("location", Integer.valueOf(location));
		params.put("type", "sparegoods");
		navs = this.navService.query(
				"select obj from Navigation obj where obj.display=:display and obj.location=:location and obj.type!=:type order by obj.sequence asc",
				params, 0, count);
		return navs;
	}
}
