package mysql_all_test;


import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import SikuliTest.sikuli.screenRecorder;

public class MySQL_connection {
	
	@Test
	public static void mysqltest() throws FindFailed, IOException, AWTException
	{
		Mysql_img_objects imgobj = new Mysql_img_objects();
		
				
		System.out.println("This is MySQL test");
		screenRecorder src = new screenRecorder();
		src.startRecord();
			
		Screen s = new Screen();
		//s.click("img/tablaue_desktop_icon.png");
		//s.doubleClick("img/tablaue_desktop_icon.png");
		s.wait(new Pattern(imgobj.msexcel_icon),500);
		
		s.click(imgobj.mysql_icon);
		
		s.wait(imgobj.mysqlservername,1500);
		s.click(imgobj.mysqlservername);
		s.type("a", KeyModifier.CTRL);
		s.type(Key.BACKSPACE);
		s.type(imgobj.mysqlservername,"localhost");
		
		s.click(imgobj.mysqlusername);
		s.type("a", KeyModifier.CTRL);
		s.type(Key.BACKSPACE);
		s.type(imgobj.mysqlusername,"root");
		
		s.type(imgobj.mysqlpassword,"Newuser123");
		s.click(imgobj.mysqlsignin);
		
		src.stopRecord();
		
	}
	
}
