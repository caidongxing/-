package com.gx.service.receive.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gx.dao.receive.ReceiveMapper;
import com.gx.po.receive.Receive;
import com.gx.service.receive.ReceiveService;

@Transactional
@Service("receiveService")
public class ReceiveServiceImpl implements ReceiveService {
	@Autowired
	private ReceiveMapper receiveMapper;

	@Override
	public List<Receive> findAll() {
		// TODO Auto-generated method stub
		return this.receiveMapper.findAll();
	}

	@Override
	public void saveReceive(Receive receive) {
		// TODO Auto-generated method stub
		this.receiveMapper.insert(receive);
	}

	@Override
	public Receive findById(int id) {
		// TODO Auto-generated method stub
		return this.receiveMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateReceive(Receive receive) {
		// TODO Auto-generated method stub
		this.receiveMapper.updateByPrimaryKey(receive);
	}

	@Override
	public void deleteReceive(int id) {
		// TODO Auto-generated method stub
		this.receiveMapper.deleteByPrimaryKey(id);
	}

}
