
public aspect ObserverProtocol {
	
	PaneOrganizer pane = new PaneOrganizer();
	
	pointcut changeColor() : execution(* handle(*) ) ;
	after():changeColor(){
		System.out.println("Color:");
		
	}

}
