import javafx.application.Platform;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.geometry.Insets;

import javafx.geometry.Pos;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.RadioButton;

import javafx.scene.control.TextField;

import javafx.scene.control.ToggleGroup;

import javafx.scene.control.Tooltip;

import javafx.scene.layout.BorderPane;

import javafx.scene.layout.GridPane;

import javafx.scene.layout.HBox;

import javafx.scene.layout.Pane;

import javafx.scene.layout.VBox;

/**

* This panel is the basic panel, inside which other panels are placed.

* Before beginning to implement, design the structure of your GUI in order to

* understand what panels go inside which ones, and what buttons or other components

* go in which panels.

* @author

ralexander

*

*/

//make the main panel's layout be a VBox

public class FXMainPane extends VBox {

//student Task #2:

// declare five buttons, a label, and a textfield
	private Button button1, button2, button3, button4, button5;
	private Label feedbackLabel;
	private TextField textField;

// declare two HBoxes
	private HBox hBox1, hBox2;

//student Task #4:

// declare an instance of DataManager
    private DataManager dataManager;


/**

* The MainPanel constructor sets up the entire GUI in this approach. Remember to

* wait to add a component to its containing component until the container has

* been created. This is the only constraint on the order in which the following

* statements appear.

*/

FXMainPane() {

//student Task #2:

// instantiate the buttons, label, and textfield
	button1 = new Button("Hello");
	button2 = new Button("Howdy");
	button3 = new Button("Chinese");
	button4 = new Button("Clear");
	button5 = new Button("Exit");

	feedbackLabel = new Label("Feedback:");
	textField = new TextField();

// instantiate the HBoxes
	hBox1 = new HBox();
	hBox2 = new HBox();

//student Task #4:

// instantiate the DataManager instance
	dataManager = new DataManager();

// set margins and set alignment of the components

hBox1.setSpacing(10);
hBox1.setAlignment(Pos.CENTER);

hBox2.setSpacing(10);
hBox2.setAlignment(Pos.CENTER);

setSpacing(15);
setPadding(new Insets(20));
setAlignment(Pos.CENTER);

textField.setPrefWidth(250);



//student Task #3:

// add the label and textfield to one of the HBoxes
    hBox2.getChildren().addAll(feedbackLabel, textField);


// add the buttons to the other HBox
    hBox1.getChildren().addAll(button1, button2, button3, button4, button5);


// add the HBoxes to this FXMainPanel (a VBox)

    getChildren().addAll(hBox1, hBox2);

    ButtonHandler handler = new ButtonHandler();

    button1.setOnAction(handler);
    button2.setOnAction(handler);
    button3.setOnAction(handler);
    button4.setOnAction(handler);
    button5.setOnAction(handler);


}

//Task #4:

// create a private inner class to handle the button clicks

private class ButtonHandler implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent e) {

        if (e.getSource() == button1) {
            textField.setText(dataManager.getHello());
        }
        else if (e.getSource() == button2) {
            textField.setText(dataManager.getHowdy());
        }
        else if (e.getSource() == button3) {
            textField.setText(dataManager.getChinese());
        }
        else if (e.getSource() == button4) {
            textField.clear();
        }
        else if (e.getSource() == button5) {
            Platform.exit();
        }
    }
}


}