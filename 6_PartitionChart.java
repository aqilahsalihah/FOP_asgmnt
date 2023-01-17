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
public class partitiongraph extends Application{

    
    @Override
    public void start(Stage stage){
        
        //Defining the x axis
        CategoryAxis xaxis = new CategoryAxis();
        
        xaxis.setCategories(FXCollections.<String>
        observableArrayList(Arrays.asList(
        "Opteron","EPYC","v100s","k10","k40c","titan")));
        xaxis.setLabel("Partition");
        
        //Defining the y axis
        NumberAxis yaxis = new NumberAxis( );
        yaxis.setLabel("Number");
        
        //Creating Bar chart
        BarChart<String, Number> barChart = new BarChart<>(xaxis,yaxis);
        barChart.setTitle("Number of Partition");
        
        //Prepare XYChart.Series objects by setting data
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("CPU");
        series1.getData().add(new XYChart.Data<>("Opteron", 4509));
        series1.getData().add(new XYChart.Data<>("EPYC", 2756));
       
        
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("GPU");
        series2.getData().add(new XYChart.Data<>("v100s", 588));
        series2.getData().add(new XYChart.Data<>("k10", 428));
        series2.getData().add(new XYChart.Data<>("k40c", 295));
        series2.getData().add(new XYChart.Data<>("titan", 640));
        
       
        //Setting data to bar chart
        barChart.getData().addAll(series1, series2);
        
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
    public static void main(String[] args){
        launch(args);
    }
}
