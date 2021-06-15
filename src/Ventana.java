import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ventana extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		PaneOrganizer rootContainer = new PaneOrganizer();
		Scene scene = new Scene(rootContainer.getRoot(),400,500);
		
		primaryStage.setTitle("Menu");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
		// este es el main :v
}
