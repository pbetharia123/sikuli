package SikuliTest.sikuli;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class launchTab {
	
	@BeforeTest
	public void openApp() throws IOException{
		Runtime rt = Runtime.getRuntime();
		rt.exec("C:\\Program Files\\Tableau\\Tableau 10.5\\bin\\tableau.exe");
		
	}
	
	public static void opentab() throws Exception
	{
		
		screenRecorder src = new screenRecorder();
		
		Screen s = new Screen();
		//s.click("img/tablaue_desktop_icon.png");
		//s.doubleClick("img/tablaue_desktop_icon.png");
		
		s.wait(new Pattern("img/msexcel.png"),500);
		s.click("img/msexcel.png");
		s.click("img/exceldatabse.png");
		s.click("img/open.png");
				
		s.wait(new Pattern("img/order_table.png"),500);
		
		Pattern pt1 = new Pattern("img/order_table.png");
		Pattern pt2 = new Pattern("img/Drag_sheet_here");
		
		s.dragDrop(pt1, pt2);
		
		Date startdt = new Date();
		s.wait("img/record_count.png",500);
		Date enddt = new Date();
		
		long diff = enddt.getTime() - startdt.getTime();
		System.out.println("Time taken is "+diff/1000);
		//src.stopRec();
		
	}
	
	@Test
	public static void mysqltest() throws FindFailed, IOException, AWTException
	{
		System.out.println("This is MySQL test");
		screenRecorder src = new screenRecorder();
		src.startRecord();
			
		Screen s = new Screen();
		//s.click("img/tablaue_desktop_icon.png");
		//s.doubleClick("img/tablaue_desktop_icon.png");
		s.wait(new Pattern("img/msexcel.png"),500);
		
		s.click("img/mysql.png");
		
		s.click("img/mysqlservername.png");
		s.type("a", KeyModifier.CTRL);
		s.type(Key.BACKSPACE);
		s.type("img/mysqlservername.png","localhost");
		
		s.click("img/mysqlusername.png");
		s.type("a", KeyModifier.CTRL);
		s.type(Key.BACKSPACE);
		s.type("img/mysqlusername.png","root");
		
		s.type("img/mysqlpassword.png","Newuser123");
		s.click("img/mysqlsignin.png");
		
		src.stopRecord();
		
	}
	
	
}
