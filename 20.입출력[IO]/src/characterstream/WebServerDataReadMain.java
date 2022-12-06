package characterstream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception {
		/************** html(text) ******************/
		URL urlStr = new URL("https://i.guim.co.uk/img/static/sys-images/Guardian/Pix/pictures/2014/3/7/1394188793056/Flat-White-Coffee--012.jpg?width=620&quality=85&dpr=1&s=none");
		InputStream in = urlStr.openStream();
		FileOutputStream fout = new FileOutputStream("flatwhite.webp");
		while(true) {
			int readByte=in.read();
			if(readByte==-1)break;
			fout.write(readByte);
			//System.out.print((char)readByte);
		}
		
		in.close();
		fout.close();
		}
	}

