package com.orgi.sdf;

import org.springframework.stereotype.Component;

import com.zitlab.palmyra.api2db.handler.SaveHandler;
import com.zitlab.palmyra.cinch.pojo.Tuple;

@Component("save/Users")
public class SaveUsers implements SaveHandler{

	@Override
	public int aclCheck(String subType, String action, Tuple item) {
		return 7;
	}
}