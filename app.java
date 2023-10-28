import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PetDisplayApp extends Application {
    private ImageView imageView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Pet Display");

        ToggleGroup toggleGroup = new ToggleGroup();

        
        RadioButton dogRadioButton = new RadioButton("Dog");
        dogRadioButton.setToggleGroup(toggleGroup);
        RadioButton catRadioButton = new RadioButton("Cat");
        catRadioButton.setToggleGroup(toggleGroup);
        RadioButton rabbitRadioButton = new RadioButton("Rabbit");
        rabbitRadioButton.setToggleGroup(toggleGroup);
        RadioButton parrotRadioButton = new RadioButton("Parrot");
        parrotRadioButton.setToggleGroup(toggleGroup);
        RadioButton fishRadioButton = new RadioButton("Fish");
        fishRadioButton.setToggleGroup(toggleGroup);

        
        Image dogImage = new Image("dog.jpg");
        Image catImage = new Image("cat.jpg");
        Image rabbitImage = new Image("rabbit.jpg");
        Image parrotImage = new Image("parrot.jpg");
        Image fishImage = new Image("fish.jpg");

        imageView = new ImageView();
        imageView.setFitWidth(300);
        imageView.setFitHeight(300);

        
        dogRadioButton.setOnAction(event -> imageView.setImage(dogImage));
        catRadioButton.setOnAction(event -> imageView.setImage(catImage));
        rabbitRadioButton.setOnAction(event -> imageView.setImage(rabbitImage));
        parrotRadioButton.setOnAction(event -> imageView.setImage(parrotImage));
        fishRadioButton.setOnAction(event -> imageView.setImage(fishImage));

      
        HBox layout = new HBox(20);
        layout.getChildren().addAll(
            dogRadioButton, catRadioButton, rabbitRadioButton, parrotRadioButton, fishRadioButton);

       
        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
