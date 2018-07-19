
import resources.validateOrderElimitaionHelper;
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
public class validateOrderElimitaion extends validateOrderElimitaionHelper
{
	/**
	 * Script Name   : <b>validateOrderElimitaion</b>
	 * Generated     : <b>19/07/2018 10:27:41</b>
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
		jmb().click(atPath("Order"));
		jmb().click(atPath("Admin->Orders..."));
		
		// Frame: Administration
		ok().click();
		
		// Frame: View Orders
		orderTable().performTest(orderTable_standardVP());
		deleteSelectedOrder().click();
		close().click();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().drag(atPath("Admin->Orders..."));
		
		// Frame: Administration
		ok().click();
		
		// Frame: View Orders
		orderTable().performTest(orderTable_standard_2VP());
		close().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

