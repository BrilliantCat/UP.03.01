package shop;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Frame extends JFrame {    
    public GameField gameField;
    public BackgroundPanel backgroundPanel;
    
    public Frame(GameField gameField) {
        this.gameField = gameField;
        backgroundPanel = new BackgroundPanel("W:\\__________Programs\\Works\\Warehouse_management\\Shop\\src\\shop\\1.jpg"); 
        setContentPane(backgroundPanel); // Устанавливаем backgroundPanel как contentPane            
        gameField.setBounds(0, 380, 900, 400);  // Размеры и координаты gameField       
        backgroundPanel.add(gameField);
        initComponents();  
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1120, 800); //  размер JFrame в конструкторе
        setLocationRelativeTo(null);
    }       
    public static class GameField extends JPanel {
        public GameField(){
            setOpaque(false);
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Current = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        _current = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Pole1 = new javax.swing.JTextField();
        Pole2 = new javax.swing.JTextField();
        Order = new javax.swing.JButton();
        Pole3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("             Gribs^Shop");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Add.setText("Добавить товар на склад");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Current.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Current.setForeground(new java.awt.Color(255, 255, 51));
        Current.setText("     _");

        Update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(46, 46, 231));
        Update.setText("Обновить  ");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        input.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input.setText("-");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        _current.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        _current.setForeground(new java.awt.Color(255, 255, 51));
        _current.setText("Количество товара:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Купить товар со склада");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Pole1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pole1.setText("Сколько товара:");

        Pole2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pole2.setForeground(new java.awt.Color(102, 255, 51));
        Pole2.setText("Результат сделки");

        Order.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Order.setText("Заказать товар");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });

        Pole3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pole3.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Update)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(Pole3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input)
                                    .addComponent(Pole1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(_current)
                                .addGap(18, 18, 18)
                                .addComponent(Current, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Pole2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Current)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_current))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pole3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pole2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pole1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                .addComponent(Exit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        String str = input.getText(); 
        
        try{
        Shop.score = Shop.score + Integer.parseInt(str);
        str = String.valueOf(Shop.score);
        Current.setText(str);
        input.setText("---");
        Pole3.setText("---");
        }
        catch(NumberFormatException a){
            input.setText("Error!");
        }
         
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String str = String.valueOf(Shop.score);
         Current.setText(str);
    }//GEN-LAST:event_UpdateActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        
        String str = Pole3.getText();
        try
        {
            Shop.temp = Integer.parseInt(str);
            input.setText(str);
            Pole3.setText("Готов к добавлению!");
            
            
        }
        catch(NumberFormatException a)
        {
            Pole3.setText("Введите количество товара:");
        }
    }//GEN-LAST:event_OrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try
        {
            Shop.temp = Integer.parseInt(Pole1.getText());
            if(Shop.score - Shop.temp<0)
            {
                Pole1.setText("Нет товара");
                Pole2.setText("Error");
            }
            else{
                Shop.score = Shop.score - Shop.temp;
                Current.setText(String.valueOf(Shop.score));
                Pole2.setText("Сделка состоялась");
                Pole1.setText("---");
            }
        }
        catch(NumberFormatException e)
        {
            Pole1.setText("Сколько покупаем:");
            Pole2.setText("Error");
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
        
    public class BackgroundPanel extends JPanel {
        public Image backgroundImage;
        public static Random random = new Random();
        public float dropLeft = 200;
        public float dropTop = 500;
        public Image logo = Shop.logo; // Получаем логотип из класса Shop
 
        public BackgroundPanel(String imagePath) {
            try {
                backgroundImage = ImageIO.read(Shop.class.getResourceAsStream("1.jpg")); // Загрузка изображения
            } 
            catch (IOException e) { System.err.println("Не удалось загрузить изображение."); e.printStackTrace(); }
    
            addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                float dropRight = dropLeft + logo.getWidth(null);
                float dropBottom = dropTop + logo.getHeight(null);

                boolean isDrop = x >= dropLeft && x <= dropRight && y >= dropTop && y <= dropBottom;

                if (isDrop) {
                    dropTop = 400 + random.nextInt(200);
                    dropLeft = 100 + random.nextInt(800);
                    repaint(); // Перерисовываем панель, чтобы отобразить новое положение логотипа
                }
            }
        });
    }
             
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        if (logo != null) {
            g.drawImage(logo, (int) dropLeft, (int) dropTop, null);
        }
    }
    
    // Геттеры для доступа к координатам извне (если нужно)
    public float getDropLeft() {
        return dropLeft;
    }

    public float getDropTop() {
        return dropTop;
    }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Current;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Order;
    private javax.swing.JTextField Pole1;
    private javax.swing.JTextField Pole2;
    private javax.swing.JTextField Pole3;
    private javax.swing.JButton Update;
    private javax.swing.JLabel _current;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
