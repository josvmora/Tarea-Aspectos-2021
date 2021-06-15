import javafx.scene.layout.GridPane;

public aspect ObserverProtocol {
	
	pointcut changeColor(GridPane root) : call(* setStyle(*) ) && target (root);
	after(GridPane root): changeColor(root){
		String color = root.getStyle();
		color = color.replace("-fx-background-color:","");
		System.out.println("cambiando el color de la pantalla : New color set - "+color.toUpperCase()+"\n....Cambio realizado con exito");
	}
}
