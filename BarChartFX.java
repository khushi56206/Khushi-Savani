import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class BarChartFX extends Application {

    public void start(Stage stage) {
        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);

        VBox projects = createBar("Projects — 20%", 20, Color.RED);
        VBox quizzes = createBar("Quizzes — 10%", 10, Color.BLUE);
        VBox midterm = createBar("Midterm Exams — 30%", 30, Color.GREEN);
        VBox finals = createBar("Final Exam — 40%", 40, Color.ORANGE);

        root.getChildren().addAll(projects, quizzes, midterm, finals);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Grade Distribution");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String text, int percentage, Color color) {
        int scale = 5;
        Rectangle bar = new Rectangle(50, percentage * scale);
        bar.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(5);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
