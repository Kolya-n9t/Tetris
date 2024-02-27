import javax.swing.*;

public class WindowGame {
    public static final int WIDTH = 445;
    public static final int HEIGHT = 629;
    private Board board;
    private Tittle tittle;
    private JFrame jFrame;

    public static void main(String[] args) {
        WindowGame windowGame = new WindowGame();
    }
    public void startTetris(){
            jFrame.remove(tittle);
            jFrame.addMouseMotionListener(board);
            jFrame.addMouseListener(board);
            jFrame.add(board);
            board.startGame();
            jFrame.revalidate();
    }

    public WindowGame() {
        jFrame = new JFrame("Tetris");
        jFrame.setSize(WIDTH, HEIGHT);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        board = new Board();
        tittle = new Tittle(this);
        jFrame.addKeyListener(board);
        jFrame.addKeyListener(tittle);
        jFrame.add(tittle);
        jFrame.setVisible(true);
    }

}
