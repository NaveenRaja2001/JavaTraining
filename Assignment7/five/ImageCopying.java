package five;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopying {
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
//		creating the file object
		try {
			File file = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/five/image.jpg");
			File copypath = new File("/Users/naveenraja/eclipse-workspace/Assignment7/src/five/copiedImage.jpg");
			inputStream = new FileInputStream(file);
			outputStream = new FileOutputStream(copypath);

			byte b[] = new byte[1024];
			while (inputStream.read(b) != -1) {
				outputStream.write(b);
			}
			System.out.println("Image is copyied");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
