import java.io.File;

import javax.imageio.ImageIO;

import com.googlecode.javacv.FFmpegFrameGrabber;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FFmpegFrameGrabber g = new FFmpegFrameGrabber("");
		g.start();

		for (int i = 0 ; i < 10 ; i++) {
		    ImageIO.write(g.grab().getBufferedImage(), "png", new File("frame-dump/video-frame-" + i + ".png"));
		}

		g.stop();
	}

}
