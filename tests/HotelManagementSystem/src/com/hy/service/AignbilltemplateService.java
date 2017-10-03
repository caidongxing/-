package com.hy.service;

import java.io.Serializable;

import com.hy.page.Page;
import com.hy.po.Aignbilltemplate;

public interface AignbilltemplateService extends BaseService<Aignbilltemplate, Serializable> {

	Page<Aignbilltemplate> queryPage(String templatename,Page<Aignbilltemplate> page);
}
