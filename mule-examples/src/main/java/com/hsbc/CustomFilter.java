package com.hsbc;

import org.mule.api.MuleMessage;
import org.mule.api.routing.filter.Filter;

public class CustomFilter implements Filter {

	@Override
	public boolean accept(MuleMessage message) {
		if(message.getInboundProperty("http.query.params") != null) {
			return true;
		}
	
		return false;
	}

}
