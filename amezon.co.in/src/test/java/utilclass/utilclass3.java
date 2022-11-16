package utilclass;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import baseclass.baseclass;
public class utilclass3 extends baseclass {	
	public static void screenshotget() throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("G:\\eclips prg\\org.infosy.services\\Screenshot2"+timestamp()+".jpeg");
		FileHandler.copy(source, dest);	
	}
	public static String timestamp() {	
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()); 
	}
	
}
