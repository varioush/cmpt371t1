package ca.sandstorm.luminance.test.gui;

import ca.sandstorm.luminance.gui.TextLabel;
import android.test.AndroidTestCase;

public class TextLabelTest extends AndroidTestCase{
	TextLabel _tl;
	
	protected void setUp() throws Exception {
		_tl = new TextLabel(0,0,0,0, "Hello");
		super.setUp();
	}
	
	public void testTextLabel() throws Exception {
		assertNotNull(_tl);
	}
	
}
