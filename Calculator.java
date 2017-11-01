import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application{
	
	TextField in1;
	TextField in2;
	Button buttonadd;
	Button buttonsub;
	Button buttonmult;
	Button buttondiv;
	Label label1;
	Label label2;
	Label label3;
	int answer;
	int value1;
	int value2;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Calculator");
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		Scene scene = new Scene(grid, 400, 275);
		stage.setScene(scene);
		label1 = new Label("Number 1:");
		label2 = new Label("Number 2:");
		label3 = new Label();
		in1 = new TextField();
		in2 = new TextField();
		buttonadd = new Button("+");
		buttonsub = new Button("-");
		buttonmult = new Button("*");
		buttondiv = new Button("/");
		grid.add(label1, 0, 1);
		grid.add(label2, 0, 2);
		grid.add(in1, 1, 1);
		grid.add(in2, 1, 2);
		grid.add(buttonadd, 0, 0);
		grid.add(buttonsub, 1, 0);
		grid.add(buttonmult, 2, 0);
		grid.add(buttondiv, 3, 0);
		grid.add(label3, 3, 1);
		
		buttonadd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				value1 = Integer.valueOf(in1.getText());
				value2 = Integer.valueOf(in2.getText());
				answer = value1 + value2;
				label3.setText("Answer: " + answer);
			}
		});
		
		buttonsub.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				value1 = Integer.valueOf(in1.getText());
				value2 = Integer.valueOf(in2.getText());
				answer = value1 - value2;
				label3.setText("Answer: " + answer);
			}
		});
		
		buttonmult.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				value1 = Integer.valueOf(in1.getText());
				value2 = Integer.valueOf(in2.getText());
				answer = value1 * value2;
				label3.setText("Answer: " + answer);
			}
		});
		
		buttondiv.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				value1 = Integer.valueOf(in1.getText());
				value2 = Integer.valueOf(in2.getText());
				answer = value1 / value2;
				label3.setText("Answer: " + answer);
			}
		});
		
		stage.show();
	}
}
