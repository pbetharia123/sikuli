package platform_test;

import java.io.IOException;
import java.util.Date;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Qliksense_install {

	@BeforeTest
	public void qliksense_installation(){
		
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("D:\\qliksense\\Qlik_Sense_Desktop_setup.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void qliksense_runtime() throws FindFailed{
		Screen qlk = new Screen();
		Pattern pr = new Pattern("img/qlik_install");
		
		Date startdt = new Date();
		
		qlk.wait(pr,1000);
		qlk.click(pr);
		
		qlk.wait("img/qlik_iagree_img.png",500);
		qlk.click("img/qlik_iagree_img.png");
		qlk.click("img/qlk_agree_next.png");
		
		qlk.wait("img/qlik_install_img.png");
		qlk.click("img/qlik_install_img.png");
		
		while (qlk.exists("img/qlik_install_finish.png")!=null);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		qlk.wait("img/qlik_install_finish.png");
		
		Date enddt = new Date();
		long diff = enddt.getTime() - startdt.getTime();
		System.out.println("Time taken is "+diff/1000);
	}
	
	
}
