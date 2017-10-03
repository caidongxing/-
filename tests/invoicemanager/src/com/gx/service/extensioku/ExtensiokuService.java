package com.gx.service.extensioku;

import java.util.List;

import com.gx.po.extensioku.Extensioku;
import com.gx.vo.ExtensiokuVo;

public interface ExtensiokuService {
	
	public void save(Extensioku extensioku);
	
	public void delete(int id);
	
	public List<ExtensiokuVo> findBymedium(int medium);
	
	public List<Extensioku> findOnReturn(int medium);
	
	public List<ExtensiokuVo> findBymediumAndType(int medium,int type);
}
