package Activity4;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;


public class DrawLines extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
		    //BorderPane root = new BorderPane();
			
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/DrawLines.fxml"));
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Draw Rainbow");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}