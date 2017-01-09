package com.github.ilyes4j.resteasy;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class MesssageServiceImpl implements MessageService {

	public Date getMessage() {
		return new Date();
	}
}
