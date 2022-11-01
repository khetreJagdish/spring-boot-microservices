package com.bmc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("FanceWriter")
public class FanceWriter implements TextWriter {

	@Override
	public String writeText(String s) {
		return s+" fancy Text";
	}

}
