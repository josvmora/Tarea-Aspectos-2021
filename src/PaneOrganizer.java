import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {

	private Button color_1;
	private Button color_2;
	private Button color_3;
	private GridPane root;
	
	public PaneOrganizer() {
		
		createContent();
	}
	
	public Pane getRoot() {
		
		return root;
	}
	
	public void createContent() {
		
		root = new GridPane();
		color_1 = new Button("Color 1");
		color_2 = new Button("Color 2");
		color_3 = new Button("Color 3");
		
		root.add(color_1, 0, 0);
		root.add(color_2, 0, 1);
		root.add(color_3, 0, 2);
		
		root.setHgap(10);
		root.setVgap(10);
		
		root.setAlignment(Pos.CENTER);
		
		root.setPadding(new Insets(20,20,20,20));
		
		
		
		color_1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				
				root.setStyle("-fx-background-color:red");;
			}
		});
		
		
		color_2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent ae) {
				root.setStyle("-fx-background-color:blue");
				
			}
		});
		
		
		color_3.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent ae) {
				root.setStyle("-fx-background-color:yellow");
			}
		});
		
	}
}
