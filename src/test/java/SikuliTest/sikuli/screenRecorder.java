package SikuliTest.sikuli;

import java.io.File;
import java.io.IOException;

import org.monte.media.math.Rational;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;

import helper.SpecializedScreenRecorder;

import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
import java.awt.*;

public class screenRecorder {
	
	public ScreenRecorder sr;
	
	public void startRecord() throws IOException, AWTException {
		
		File file = new File("D:\\MSTR ScreenRecorder videos");
			         
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         int width = screenSize.width;
         int height = screenSize.height;
         Rectangle captureSize = new Rectangle(0,0, width, height);
         
         GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
         
         this.sr = new SpecializedScreenRecorder(gc, captureSize,
                 new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                 new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                      CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                      DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                      QualityKey, 1.0f,
                      KeyFrameIntervalKey, 15 * 60),
                 new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                      FrameRateKey, Rational.valueOf(30)),
                 null, file, "MyVideo");
         
        this.sr.start();
		System.out.println("Recording has started");
	}
	
	public void stopRecord() throws IOException, AWTException {		
		this.sr.stop();
		System.out.println("Recording has stopped");		
	}
    		
 
}



