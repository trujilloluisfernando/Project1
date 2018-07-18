
import resources.Script1Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author DELL
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>18/07/2018 17:18:47</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/18
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		placeOrder().click();
		
		// Frame: Member Logon
		nameCombo().click();
		nameCombo().drag(atText("Tony Miatta"));
		password().drag(atPoint(27,17), atPoint(27,16));
		memberLogon().inputChars("yolq");
		rememberPassword().clickToState(SELECTED);
		ok().drag();
		
		// Frame: Place an Order
		quantity().click(atPoint(75,9));
		placeAnOrder().inputKeys("{BKSP}5");
		cardNumberIncludeTheSpaces().click(atPoint(52,15));
		placeAnOrder().inputChars("4823 3019 4728 1029");
		creditCombo().drag();
		creditCombo().click(atText("Amex"));
		expirationDate().click(atPoint(25,2));
		placeAnOrder().inputChars("12");
		expirationDate().click(SHIFT_LEFT, atPoint(25,2));
		placeAnOrder().inputKeys("/{BKSP}{ExtRight}{ExtRight}/12{BKSP}{BKSP}21");
		relatedItems().click();
		
		// 
		customList().click(atPoint(73,40));
		addToOrder().click();
		
		// Frame: Place an Order
		placeOrder2().click();
		
		// 
		yourOrderHasBeenReceivedYourOr().click();
		aceptar().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).maximize();
	}
}

