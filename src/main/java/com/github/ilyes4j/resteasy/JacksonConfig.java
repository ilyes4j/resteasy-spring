package com.github.ilyes4j.resteasy;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Provider
@Component
public class JacksonConfig implements ContextResolver<ObjectMapper> {
	private ObjectMapper objectMapper;

	public JacksonConfig() {
		this.objectMapper = new ObjectMapper();
		this.objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	}

	public ObjectMapper getContext(Class<?> objectType) {
		return objectMapper;
	}
}
