package graph;
import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 *
 * @author airin
 */
public class Job extends Application {

    @Override
    public void start(Stage stage){
        
        //Defining the x axis
        CategoryAxis xaxis = new CategoryAxis();
        
        xaxis.setCategories(FXCollections.<String>
        observableArrayList(Arrays.asList(
        "Jobs created", "Jobs completed", "Jobs created & completed")));
        xaxis.setLabel("Jobs");
        
        //Defining the y axis
        NumberAxis yaxis = new NumberAxis( );
        yaxis.setLabel("Value");
        
        //Creating Bar chart
        BarChart<String, Number> barChart = new BarChart<>(xaxis,yaxis);
        barChart.setTitle("Number of Jobs Within Time Range");
        
        //Prepare XYChart.Series objects by setting data
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        //series1.setName("CPU");
        series.getData().add(new XYChart.Data<>("Jobs created", 9216));
        series.getData().add(new XYChart.Data<>("Jobs completed", 8479));
        series.getData().add(new XYChart.Data<>("Jobs created & completed", 7532));
        
        //Setting data to bar chart
        barChart.getData().addAll(series);
        
        //Creating a Group object
        Group root = new Group(barChart);
        
        //Creating a scene object
        Scene scene = new Scene(root, 600,500);
        
        //Setting title to the stage
        stage.setTitle("Bar Chart");
        
        //Adding scene to the stage
        stage.setScene(scene);
        
        //Displaying contents of stage
        stage.show();
         
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
