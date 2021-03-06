/**
 * @author Tyler Kelley
 * @author CS2263 Homework 2 Isaac Griffith
 * @version 2.1.0
 * @since 1.0.0
 */
package edu.isu.cs.cs2263;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.ListView;

/**
 * Class App which extends the javaFX Application
 */
public class App extends Application{
    /**
     * Default constructor for App
     */
    public App() {}

    /**
     * Make the App class a singleton using the helper class
     */
    private static class Helper{
        private static final App INSTANCE = new App();

    }

    /**
     * Get method that will get the one specific instance of our list
     * @return the helper instance so only one instance is created for usage
     */
    public static App getInstance(){
        return Helper.INSTANCE;
    }

    /**
     * Variables and objects used to connect to our other classes
     */
    IOManager Students = new IOManager();
    String filePath = "C:/Users/Tyler Kelley//Desktop//CS_2263/cs2263_hw02/cs2263-hw02/students.json";

    /**
     * Override method to create our javaFX window
     * @param stage our current display of our javaFX window
     * @throws Exception of creating a new javaFX pane to display
     */
    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("JavaFX Application for Homework 2");
        //create our application using a flow pane
        FlowPane display = new FlowPane();
        //generate a label that is a certain size of the window
        Label label = new Label("Is Taking");
        label.setMaxSize(600,600);
        //create a list for the courses
        ListView courses = new ListView();
        courses.setMaxSize(800,300);
        //create a list for the students
        ListView studentsList = new ListView();
        studentsList.setMaxSize(500, 300);
        //event handler for when a students name is clicked on it will display their courses
        studentsList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
        {courses.getItems().clear();
            courses.getItems().add("Courses:");
            courses.getItems().add(Students.readData(filePath));
        });
        //create a button that has an event handler to load in the student names to the student list
        Button button = new Button("Load Data");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                studentsList.getItems().clear();
                studentsList.getItems().add("Students:");
                //Students.readData("Student&Courses.json");
                studentsList.getItems().add(Students.readData(filePath));
            }
        });
        //display all of the javaFX elements into a new scene
        display.getChildren().add(studentsList);
        display.getChildren().add(label);
        display.getChildren().add(courses);
        display.getChildren().add(button);
        display.setAlignment(Pos.CENTER);
        //add spacing between the elements
        display.setHgap(25);
        display.setVgap(25);
        //create a scene to be displayed in the window of javaFX
        Scene scene = new Scene(display, 675,400);
        stage.setScene(scene);
        //show the javaFX creation with the flow plane
        stage.show();
    }

    /**
     * Main method to start the program
     * @param args argument
     */
    public static void main(String[] args) {
        //launch the javaFX application
        Application.launch(args);
    }
}
