package org.sample.framework.utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GraphicsUtils {
	public static void resize(String path, int width, int height) {
		try {
	        BufferedImage image = ImageIO.read(new FileInputStream(path));
	        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_FAST);
	        BufferedImage bufferedImage = new BufferedImage(width, height, image.getType());
	        Graphics2D graphics = bufferedImage.createGraphics();
	        graphics.drawImage(resizedImage, 0, 0, null);
	        graphics.dispose();
	        ImageIO.write(bufferedImage, "png", new FileOutputStream(path));
		} catch (IOException ex) {
			Report.log(Status.WARNING, "Graphics fail: " + ex.getMessage());
		}
	}
}
