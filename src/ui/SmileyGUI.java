package ui;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class SmileyGUI {

    @FXML
    private Pane pane;
    
    private final static int RADIUS = 30;

    @FXML
    public void clickOnPane(MouseEvent event) {
    	double x = event.getSceneX();
    	double y = event.getSceneY();
    	
    	Circle face = new Circle(RADIUS, Color.YELLOW);
    	face.setLayoutX(x);
    	face.setLayoutY(y);    	
    	pane.getChildren().add(face);
    	
    	Circle leftEye = new Circle(RADIUS/10, Color.BLACK);
    	leftEye.setLayoutX(x-RADIUS/3);
    	leftEye.setLayoutY(y-RADIUS/3);    	
    	pane.getChildren().add(leftEye);
    	
    	Circle rightEye = new Circle(RADIUS/10, Color.BLACK);
    	rightEye.setLayoutX(x+RADIUS/3);
    	rightEye.setLayoutY(y-RADIUS/3);    	
    	pane.getChildren().add(rightEye);
    	
    	Arc smile = new Arc(x,y,(RADIUS*2)/3,(RADIUS*2)/3,180,180);
    	pane.getChildren().add(smile);
    	
    	Arc smile2 = new Arc(x,y+RADIUS/8,(RADIUS*2)/4,(RADIUS*2)/4,180,180);
    	smile2.setFill(Color.WHITE);
    	pane.getChildren().add(smile2);
    }
}
