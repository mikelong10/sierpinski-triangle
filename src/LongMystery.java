import java.awt.*;

public class LongMystery {

    private Point pointA, pointB, pointC;

    public LongMystery(int aX, int aY, int bX, int bY, int cX, int cY) {
        this.pointA = new Point(aX, aY);
        this.pointB = new Point(bX, bY);
        this.pointC = new Point(cX, cY);
    }

    public void draw(Graphics2D g2) {
        int currentX = 400;
        int currentY = 400;
        Point current = new Point(400, 400);
        for (int i = 0; i < 100000; i++) {
            int randomPoint = (int)(Math.random()*3) + 1;
            int randomColor = (int)(Math.random()*3) + 1;
            if (randomColor == 1)
                g2.setColor(Color.blue);
            else if (randomColor == 2)
                g2.setColor(Color.RED);
            else if (randomColor == 3)
                g2.setColor(Color.white);
            if (randomPoint == 1) {
                currentX = (pointA.x + currentX)/2;
                currentY = (pointA.y + currentY)/2;
                g2.drawLine(currentX, currentY, currentX+1, currentY);
            }
            else if (randomPoint == 2) {
                currentX = (pointB.x + currentX)/2;
                currentY = (pointB.y + currentY)/2;
                g2.drawLine(currentX, currentY, currentX+1, currentY);
            }
            else if (randomPoint == 3) {
                currentX = (pointC.x + currentX)/2;
                currentY = (pointC.y + currentY)/2;
                g2.drawLine(currentX, currentY, currentX+1, currentY);
            }
        }

    }

}
