package com.hy.service;

import java.io.Serializable;
import java.util.List;

import com.hy.po.Membercard;

public interface MembercardService extends BaseService<Membercard, Serializable> {

	List<Membercard> findByNumber(String Number);
}
