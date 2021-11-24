package GUI.Snake.Snakev3;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 600;
    public static final int UNIT_SIZE = 25;
    public static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    public static final int DELAY = 170;

    int x[] = new int[GAME_UNITS];
    int y[] = new int[GAME_UNITS];

    int bodyParts = 6;
    int applesEaten = 0;
    int appleX;
    int appleY;
    boolean running = true;
    char direction = 'R';
    Timer timer;
    Random random;

    GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setFocusable(true);
        this.setBackground(Color.DARK_GRAY);
        this.addKeyListener(new MyKeyAdapter());

        startGame();
    }

    public void startGame() {
        newApple();
        timer = new Timer(DELAY, this);
        timer.start();

    }

    public void gameOver(Graphics g) {
        this.setBackground(Color.BLACK);
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));
        g.drawString("Game Over!", 100, 300);

        g.setColor(Color.red);
        g.setFont(new Font("Ink Free", Font.BOLD, 40));
        g.drawString("Nice try!", 200, 35);

        g.setColor(Color.green);
        g.drawString("Your score is: "+applesEaten, 150, 85);
    }

    public void checkCollisions() {
        for (int i = bodyParts; i > 0; i--) {
            // Head collides with body
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }

            // head collides with right border
            if (x[0] > SCREEN_WIDTH) {
                running = false;
            }

            // head collides with left border
            if (x[0] < 0) {
                running = false;
            }

            // head collides with top border
            if (y[0] < 0) {
                running = false;
            }

            // head collides with bottom border
            if (y[0] > SCREEN_HEIGHT) {
                running = false;
            }
            if (!running) {
                timer.stop();
            }
        }

    }

    public void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            applesEaten++;
            bodyParts++;
            newApple();

        }
    }

    public void newApple() {
        random = new Random();
        appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {
            g.setColor(Color.black);

            for (int i = 0; i < (SCREEN_HEIGHT / UNIT_SIZE); i++) {
                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i * UNIT_SIZE, SCREEN_HEIGHT, i * UNIT_SIZE);
            }
            for (int i = 0; i < bodyParts; i++) {
                g.setColor(Color.RED);
                g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
                if (i == 0) {
                    g.setColor(Color.GREEN);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(22, 158, 24));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);

                    g.setColor(Color.red);
                    g.setFont(new Font("Ink Free", Font.BOLD, 40));
                    g.drawString("Score: "+applesEaten, 250, 35);
                }

            }
        } else {
            gameOver(g);
        }
    }

    public void move() {
        for (int i = bodyParts; i >= 1; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }
        switch (direction) {
        case 'R':
            x[0] = x[0] + UNIT_SIZE;
            break;
        case 'L':
            x[0] = x[0] - UNIT_SIZE;
            break;
        case 'U':
            y[0] = y[0] - UNIT_SIZE;
            break;
        case 'D':
            y[0] = y[0] + UNIT_SIZE;
            break;

        default:
            break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {
            move();
            checkCollisions();
            checkApple();
        }
        repaint();

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                if (direction != 'R') {
                    direction = 'L';
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != 'L') {
                    direction = 'R';
                }
                break;
            case KeyEvent.VK_UP:
                if (direction != 'D') {
                    direction = 'U';
                }
                break;

            case KeyEvent.VK_DOWN:
                if (direction != 'U') {
                    direction = 'D';
                }
                break;

            default:
                break;
            }
        }

    }

}
