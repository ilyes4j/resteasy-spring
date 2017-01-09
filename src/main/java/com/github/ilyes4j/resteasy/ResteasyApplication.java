package com.github.ilyes4j.resteasy;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class ResteasyApplication extends Application {
	public ResteasyApplication() {
		super();
	}
}
