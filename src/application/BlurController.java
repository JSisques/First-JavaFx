package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;

public class BlurController {
	
	@FXML
	private Pane pane;
	private boolean desenfoque;
	
	@FXML
    public void initialize() {           
             pane.setEffect(new GaussianBlur(5));
//             mypane.setEffect(new GaussianBlur(10));
    }
	
	@FXML
    public void setblur() {
		if (desenfoque) {
			pane.setEffect(new GaussianBlur(0));
			desenfoque = false;
		} else {
			pane.setEffect(new GaussianBlur(5));
			desenfoque = true;
		}
             
//             mypane.setEffect(new GaussianBlur(10));
    }
	
	@FXML
    public void setFocus() {           
             pane.setEffect(new GaussianBlur(0));
//             mypane.setEffect(new GaussianBlur(10));
    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
}
