
import resources.crearNuevoUsuarioHelper;
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
public class crearNuevoUsuario extends crearNuevoUsuarioHelper
{
	/**
	 * Script Name   : <b>crearNuevoUsuario</b>
	 * Generated     : <b>19/07/2018 10:06:06</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/19
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaB");
		
		// Frame: ClassicsCD
		album().click(atText("Details"));
		jmb().click(atPath("Order"));
		jmb().click(atPath("Help->About Classics Java"));
		
		// Frame: About ClassicsCD
		bannerJpg().click();
		ok().click();
		
		// Frame: ClassicsCD
		jmb().drag(atPath("Admin"));
		jmb().click(atPath("Admin->Orders..."));
		
		// Frame: Administration
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().click(atPath("Help->About Classics Java"));
		
		// Frame: About ClassicsCD
		bannerJpg().performTest(BannerJpg_BannerJpgVP());
		ok2().click();
		
		// Frame: View Orders
		orderTable().click(atCell(atRow("ORDERID", "10", "CUSTID", 
                                  "10", "ORDERDATE", "3/12/98"), 
                            atColumn("CARDTYPE")), 
                     atPoint(21,4));
		deleteSelectedOrder().click();
		close().click();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().drag(atPath("Admin->Orders..."));
		
		// Frame: Administration
		ok2().click();
		
		// Frame: View Orders
		orderTable().drag(atCell(atRow("ORDERID", "10", "CUSTID", "10", 
                                 "ORDERDATE", "3/12/98"), 
                           atColumn("CARDTYPE")), 
                    atPoint(35,8), atCell(
                                        atRow(
                                        "ORDERID", "10", "CUSTID", 
                                        "10", "ORDERDATE", "3/12/98"), 
                                        atColumn("CARDTYPE")), 
                    atPoint(34,7));
		deleteSelectedOrder().click();
		close().click();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().click(atPath("Admin->Customers..."));
		
		// Frame: Administration
		ok2().click();
		
		// Frame: View Customers
		custTable().setState(Action.vScroll(91));
		custTable().click(atCell(atRow("CUSTID", "19", "NAME", 
                                 "Jill Sanford", "STREET", 
                                 "80 West End"), 
                           atColumn("CITYSTATEZIP")), 
                    atPoint(71,0));
		deleteSelectedCustomer().drag();
		close2().drag();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().click(atPath("Admin->Options..."));
		
		// Frame: Administration
		administration().nClickDragToScreenPoint(
                                        2, LEFT, atPoint(102,139), 
                                        toScreenPoint(
                                        78, 154));
		ok2().click();
		
		// Frame: ClassicsCD
		jmb().drag(atPath("Admin"));
		jmb().click(atPath("Admin->Options..."));
		
		// Frame: Administration
		ok2().drag();
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().click(atPath("Admin->Clear Database"));
		
		// Frame: Administration
		ok2().click();
		
		// Frame: Clear Data?
		yes().click();
		
		// 
		aceptar().click();
		
		// Frame: ClassicsCD
		jmb().drag(atPath("Admin"));
		jmb().click(atPath("Admin->Orders..."));
		
		// Frame: Administration
		ok2().drag();
		
		// Frame: View Orders
		close().click();
	}
}

