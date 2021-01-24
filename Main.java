import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int dimension = 20; // Default dimension
        int shape = 1; // Default to square grid type

        // Default blank canvas, blank, black canvas
        StdDraw.setXscale(0, dimension);
        StdDraw.setYscale(0, dimension);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledSquare(dimension / 2.0, dimension / 2.0, dimension / 2.0);

        // ---Adding in the color options---
        // Red
        StdDraw.setPenColor(Color.red);
        StdDraw.filledRectangle((1.5/20)*dimension, (19.0/20)*dimension, (1.5/20)*dimension, (1.0/20)*dimension);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text((1.5/20)*dimension, (19.0/20)*dimension, "Red");

        // Orange
        StdDraw.setPenColor(Color.orange);
        StdDraw.filledRectangle(4.5, 19, 1.5, 1);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(4.5, 19, "Orange");

        // Yellow
        StdDraw.setPenColor(Color.yellow);
        StdDraw.filledRectangle(7.5, 19, 1.5, 1);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(7.5, 19, "Yellow");

        // Green
        StdDraw.setPenColor(Color.green);
        StdDraw.filledRectangle(10.5, 19, 1.5, 1);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(10.5, 19, "Green");

        // Blue
        StdDraw.setPenColor(Color.blue);
        StdDraw.filledRectangle(13.5, 19, 1.5, 1);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(13.5, 19, "Blue");

        // Purple
        StdDraw.setPenColor(138, 43, 226);
        StdDraw.filledRectangle(16.5, 19, 1.5, 1);
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.text(16.5, 19, "Purple");

        // Clear
        StdDraw.setPenColor(Color.white);
        StdDraw.filledSquare(19, 19, 1);
        StdDraw.setPenColor(Color.black);
        StdDraw.text(19, 19, "CLR");

        // ---Setting Up Grid Type and Grid Size---
        // Grid Type
        StdDraw.setPenColor(Color.darkGray);
        StdDraw.filledRectangle(dimension / 2.0, 17.5, dimension / 2.0, 0.5);
        StdDraw.setPenColor(Color.white);
        StdDraw.text(1.5, 17.5, "Grid type:");
        StdDraw.filledCircle(3.75, 17.5, 0.3);
        StdDraw.filledSquare(5.25, 17.5, 0.3);

        // Grid Size
        StdDraw.setPenColor(Color.gray);
        StdDraw.filledRectangle(10.5, 17.5, 1.25, 0.4);
        StdDraw.filledRectangle(13.5, 17.5, 1.25, 0.4);
        StdDraw.filledRectangle(16.5, 17.5, 1.25, 0.4);

        StdDraw.setPenColor(Color.white);
        StdDraw.text(7.5, 17.5, "Grid size:");
        StdDraw.text(10.5, 17.5, "20x18");
        StdDraw.text(13.5, 17.5, "40x36");
        StdDraw.text(16.5, 17.5, "60x54");

        // Overarching while loop, handles real-time drawing.
        StdDraw.setPenColor(Color.black);
        while(true){
            double xPos;
            double yPos;
            if(StdDraw.isMousePressed()){
                xPos = StdDraw.mouseX();
                yPos = StdDraw.mouseY();

                if (yPos < dimension - (3.0/20)*dimension){ // Handling drawing on the grid
                    switch (shape){
                        case 0: StdDraw.filledCircle(Math.floor(xPos) + (0.5), Math.floor(yPos) + (0.5), 0.5); break;
                        case 1: StdDraw.filledSquare(Math.floor(xPos) + (0.5), Math.floor(yPos) + (0.5), 0.5); break;
                    }
                }else if(yPos < dimension - (2.0/20)*dimension && yPos > dimension -
                        (3.0/20)*dimension){ // Handling grid type and size
                    if (xPos >= (3.0/20)*dimension && xPos < (4.5/20)*dimension){
                        shape = 0;
                    }
                    if (xPos >= (4.5/20)*dimension && xPos < (6.0/20)*dimension){
                        shape = 1;
                    }
                    if (xPos >= (9.25/20)*dimension && xPos <= (11.75/20)*dimension) {
                        dimension = 20;
                        StdDraw.setXscale(0, dimension);
                        StdDraw.setYscale(0, dimension);
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle((dimension) / 2.0, (dimension - (3.0/20)*dimension) / 2.0, (10.0/20)*dimension, (8.5/20)*dimension);
                    }
                    if (xPos >= (12.25/20)*dimension && xPos <= (14.75/20)*dimension){
                        dimension = 40;
                        StdDraw.setXscale(0, dimension);
                        StdDraw.setYscale(0, dimension);
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle((dimension) / 2.0, (dimension - (3.0/20)*dimension) / 2.0, (10.0/20)*dimension, (8.5/20)*dimension);
                    }
                    if (xPos >= (15.25/20)*dimension && xPos <= (17.75/20)*dimension){
                        dimension = 60;
                        StdDraw.setXscale(0, dimension);
                        StdDraw.setYscale(0, dimension);
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle((dimension) / 2.0, (dimension - (3.0/20)*dimension) / 2.0, (10.0/20)*dimension, (8.5/20)*dimension);
                    }

                }else{ // Handling color changes / clear screen
                    if (xPos >= 0 && xPos < (3.0/20)*dimension) StdDraw.setPenColor(Color.red);
                    if (xPos >= (3.0/20)*dimension && xPos < (6.0/20)*dimension) StdDraw.setPenColor(Color.orange);
                    if (xPos >= (6.0/20)*dimension && xPos < (9.0/20)*dimension) StdDraw.setPenColor(Color.yellow);
                    if (xPos >= (9.0/20)*dimension && xPos < (12.0/20)*dimension) StdDraw.setPenColor(Color.green);
                    if (xPos >= (12.0/20)*dimension && xPos < (15.0/20)*dimension) StdDraw.setPenColor(Color.blue);
                    if (xPos >= (15.0/20)*dimension && xPos < (18.0/20)*dimension) StdDraw.setPenColor(138, 43, 226);
                    if (xPos >= (18.0/20)*dimension && xPos < (20.0/20)*dimension){
                        StdDraw.setPenColor(Color.black);
                        StdDraw.filledRectangle((dimension) / 2.0, (dimension - (3.0/20)*dimension) / 2.0, (10.0/20)*dimension, (8.5/20)*dimension);
                    }
                }
            }
        }
    }
}
