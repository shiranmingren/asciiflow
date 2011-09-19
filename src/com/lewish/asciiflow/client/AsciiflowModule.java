//Copyright Lewis Hemens 2011
package com.lewish.asciiflow.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.lewish.asciiflow.client.resources.AsciiflowClientBundle;
import com.lewish.asciiflow.client.resources.AsciiflowCss;
import com.lewish.asciiflow.shared.Compressor;

public class AsciiflowModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(Compressor.class).to(ClientCompressor.class).in(Singleton.class);
	}

	@Provides
	@Singleton
	public AsciiflowCss getCss(AsciiflowClientBundle clientBundle) {
		return clientBundle.css();
	}
}
