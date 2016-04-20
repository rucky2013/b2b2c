package com.shopping.manage.admin.tools;

import org.springframework.stereotype.Component;

import com.shopping.foundation.domain.Area;

@Component
public class AreaManageTools {

	public String generic_area_info(Area area) {
		String area_info = "";
		if (area != null) {
			area_info = area.getAreaName() + " ";
			if (area.getParent() != null) {
				String info = generic_area_info(area.getParent());
				area_info = info + area_info;
			}
		}
		return area_info;
	}
}
