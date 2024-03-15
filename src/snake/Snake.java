/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.awt.*;


/**
 *
 * @author alu10825617
 */
public class Snake {
    
    private List<Node> nodes;
    private Direction direction;
    private int nodesToGrow;
    
    public Snake() {
       nodes = new ArrayList<Node>();
       nodes.add(new Node(Board.NUM_ROWS/2, Board.NUM_COLS/2));
       nodes.add(new Node(Board.NUM_ROWS/2, Board.NUM_COLS/2));
       nodes.add(new Node(Board.NUM_ROWS/2, Board.NUM_COLS/2));
       nodes.add(new Node(Board.NUM_ROWS/2, Board.NUM_COLS/2));
       direction = Direction.RIGHT;
       nodesToGrow = 0;
    }
    
    public void paint(Graphics g, int squareWidth, int squareHeight) {
        boolean firstNode = true;
        Color color;
        for (Node node: nodes) {
            if (firstNode) {
                color = Color.orange;
                firstNode = false;
            } else {
                color = Color.yellow;
            }
            Util.drawSquare(g, nodesToGrow, nodesToGrow, color, squareWidth, squareHeight);
        }
    }
 
    
    
           
    
    
}
