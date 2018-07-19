
import resources.Script3Helper;
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
public class Script3 extends Script3Helper
{
	/**
	 * Script Name   : <b>Script3</b>
	 * Generated     : <b>19/07/2018 09:47:31</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/19
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		classicsCD().resize(727, 590);
		compositorsTree().click(atPath("Composers->Mozart"));
		compositorsTree().click(atPath("Composers->Mozart->Location(PLUS_MINUS)"));
		compositorsTree().click(atPath("Composers->Mozart->Symphony in C, No. 41: Jupiter"));
		album().click(atText("Details"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
		
		// Frame: Place an Order
		quantity().click(atPoint(67,14));
		placeAnOrder().inputChars("5");
		_24025().click();
		_24025().performTest(_24025_textVP(), 2.0, 20.0);
		creditCombo().click();
		creditCombo().click(atText("Amex"));
		cardNumberInputWithSpaces().click(atPoint(28,15));
		placeAnOrder().inputKeys("4829 1823 28391{BKSP} 4938");
		cardNumberInputWithSpaces().performTest(
                                        CardNumberIncludeTheSpaces_textVP(), 
                                        2.0, 20.0);
		expirationDate().drag(atPoint(55,10), atPoint(54,11));
		placeAnOrder().inputChars("12/23");
		name().performTest(Name_standardVP(), 2.0, 20.0);
		relatedItems().click();
		
		// 
		customList().performTest(CustomList_standardVP());
		addToOrder().drag();
		
		// Frame: Place an Order
		placeOrder2().click();
		
		// 
		yourOrderHasBeenReceivedYourOr().click();
		aceptar().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

