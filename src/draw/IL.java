package draw;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class IL {
    public static BufferedImage[] wall = new BufferedImage[12];
    public static BufferedImage point_pick;

    public static void load() {
        try {
            for (int i = 0; i < 12; i++) {
                wall[i] = ImageIO.read(new File("rsc/tiles/" + (i + 1) + ".png"));

            }
            point_pick = ImageIO.read(new File("rsc/tiles/14.png"));
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

}
