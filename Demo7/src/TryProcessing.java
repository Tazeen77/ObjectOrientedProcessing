import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int ball1Speed = 0;
    private int ball2Speed = 0;
    private int ball3Speed = 0;
    private int ball4Speed = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

 
    private void drawCircle1() {
        ellipse(ball1Speed ,HEIGHT/5, DIAMETER,DIAMETER);
        ball1Speed++;


    }
    private void drawCircle2() {
        ellipse(ball2Speed ,2*HEIGHT/5, DIAMETER,DIAMETER);
        ball2Speed+=2;
    }

    private void drawCircle3() {
        ellipse(ball3Speed ,3*HEIGHT/5, DIAMETER,DIAMETER);
        ball3Speed+=3;
    }

    private void drawCircle4() {
        ellipse(ball4Speed ,4*HEIGHT/5, DIAMETER,DIAMETER);
        ball4Speed+=4;
    }
    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();

    }
}
