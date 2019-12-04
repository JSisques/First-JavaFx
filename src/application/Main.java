package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 500, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
			//comment
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
		
}
