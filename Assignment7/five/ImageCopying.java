package five;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopying {
	public static void main(String[] args) throws IOException {
//		creating the file object
		//try
		File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/five/image.jpg");
		File copypath = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/five/copiedImage.jpg");
		FileInputStream inputStream = new FileInputStream(file);
		FileOutputStream outputStream = new FileOutputStream(copypath);

		byte b[] = new byte[1024];
		while (inputStream.read(b) != -1) {
			outputStream.write(b);
		}
		System.out.println("Image is copyied");
		inputStream.close();
		outputStream.close();
	}
}
