package com.lewish.asciiflow.client.social;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.lewish.asciiflow.client.CssStyles;

public class PlusOneWidget extends Composite {

	public PlusOneWidget() {
		HTML html = new HTML("<g:plusone size=\"large\"></g:plusone>");
		html.getElement().setId("plusone-widget");
		html.setStyleName(CssStyles.PlusOneWidget);
		initWidget(html);
	}
}