
import resources.Script2Helper;
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
public class Script2 extends Script2Helper
{
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>19/07/2018 09:09:49</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
		
		// Frame: ClassicsCD
		classicsCD().click(atPoint(615,392));
		classicsCD(ANY,MAY_EXIT).close();
	 * @since  2018/07/19
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		tree2().click(atPath("Composers->Beethoven->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Beethoven->Symphony No. 9"));
		album().click(atText("Details"));
		placeOrder().click();
		
	
		// Frame: Member Logon
		newCustomer().click();
		ok().click();
		
		// Frame: Place an Order
		quantity().click(atPoint(58,11));
		placeAnOrder().inputKeys("{BKSP}2");
		
		//verificar que las opciones de tarjeta son correctos
		
		// Frame: Place an Order
		creditCombo().performTest(creditCombo_listVP(), 2.0, 20.0);
		creditCombo().performTest(creditCombo_standard_2VP(), 2.0, 
		                            20.0);
		
		//verificar el objeto en si
		
		
		cardNumberIncludeTheSpaces().click(atPoint(55,3));
		placeAnOrder().inputChars("3524 6942 3923 1254");
		expirationDate().click(atPoint(29,14));
		placeAnOrder().inputChars("08/22");
		name().click(atPoint(180,10));
		name().hover(atPoint(180,9));
		placeAnOrder().inputKeys("Fred Nichols{TAB}");
		placeAnOrder().inputKeys("Street 8{TAB}");
		placeAnOrder().inputKeys("New yo{BKSP}{BKSP}York, 62124{TAB}");
		placeAnOrder().inputChars("4476341387");
		placeOrder2().click();
		
		// 
		yourOrderHasBeenReceivedYourOr().click();
		aceptar().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

