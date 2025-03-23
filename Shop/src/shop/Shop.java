package shop;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Shop {
    public static int score = 0;
    public static int temp = 0;
    public static Image logo;
    public static float drop_left = 200;
    public static float drop_top = 500;


    public static void main(String[] args) throws IOException {
        try {
            logo = ImageIO.read(Shop.class.getResourceAsStream("2.jpg")); // Загрузка изображения
        } catch (IOException e) {
            System.err.println("Не удалось загрузить изображение. ");
            e.printStackTrace();
        }
        
        Frame.GameField game_field = new Frame.GameField();
        Frame frame = new Frame(game_field);  // Передаем game_field в Frame

        java.awt.EventQueue.invokeLater(() -> frame.setVisible(true));
        
        
    }
}