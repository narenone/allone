
package nara.one.naraone.ui;

import com.xdev.ui.XdevAbsoluteLayout;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevNativeButton;
import com.xdev.ui.XdevTextArea;
import com.xdev.ui.XdevView;

public class MainView extends XdevView {

	/**
	 * 
	 */
	public MainView() {
		super();
		this.initUI();
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.absoluteLayout = new XdevAbsoluteLayout();
		this.button = new XdevButton();
		this.nativeButton = new XdevNativeButton();
		this.textArea = new XdevTextArea();
	
		this.button.setCaption("Button");
		this.nativeButton.setCaption("NativeButton");
	
		this.absoluteLayout.addComponent(this.button, "left:122px; top:53px");
		this.absoluteLayout.addComponent(this.nativeButton, "left:122px; top:112px");
		this.textArea.setWidth(160, Unit.PIXELS);
		this.textArea.setHeight(144, Unit.PIXELS);
		this.absoluteLayout.addComponent(this.textArea, "left:281px; top:112px");
		this.absoluteLayout.setSizeFull();
		this.setContent(this.absoluteLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevNativeButton nativeButton;
	private XdevAbsoluteLayout absoluteLayout;
	private XdevButton button;
	private XdevTextArea textArea; // </generated-code>


}
