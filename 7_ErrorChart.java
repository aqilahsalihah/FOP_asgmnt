package graph;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author airin
 */
public class ErrorGraph extends Application {
    final static String n1 = "f4ww4z";
    final static String n2 = "shahreeza";
    final static String n3 = "mk_98";
    final static String n4 = "lobbeytan";
    final static String n5 = "tingweijing";
    final static String n6 = "xinpeng";
    final static String n7 = "aznul";
    final static String n8 = "hass";
    final static String n9 = "liew.wei.shiung";
    final static String n10 = "roland";
    final static String n11 = "janvik";
    final static String n12 = "lin0618";
    final static String n13 = "fahmi8";
    final static String n14 = "farhatabjani";
    final static String n15 = "kurk";
    final static String n16 = "fairus";
    final static String n17 = "manoj";
    final static String n18 = "han";
    final static String n19 = "aah";
    final static String n20 = "hva170037";
    final static String n21 = "yatyuan.lim";
    final static String n22 = "ongkuanhung";
    final static String n23 = "chiuling";
    final static String n24 = "noraini";
    final static String n25 = "hongvin";
    final static String n26 = "htt_felicia";
    
    @Override
    public void start(Stage stage){
        stage.setTitle("Error Horizontal Bar Chart");
        
        final NumberAxis xaxis = new NumberAxis();  //Defining x axis
        
        final CategoryAxis yaxis = new CategoryAxis(); //Defining y axis
        
        //Creating bar chart
        final BarChart<Number,String> bc = 
                new BarChart<Number,String>(xaxis,yaxis);
        
        bc.setTitle("Error made by Users");
        xaxis.setLabel("Amount of error made");
        
        //Making the number on horizontal graph senget, easier to read
        xaxis.setTickLabelRotation(90);
        
        yaxis.setLabel("Username");
       
        //Prepare XYChart.Series objects by setting data
        XYChart.Series series = new XYChart.Series();
        series.getData().add(new XYChart.Data(4,n1));
        series.getData().add(new XYChart.Data(6,n2));
        series.getData().add(new XYChart.Data(24,n3));
        series.getData().add(new XYChart.Data(3,n4));
        series.getData().add(new XYChart.Data(2,n5));
        series.getData().add(new XYChart.Data(1,n6));
        series.getData().add(new XYChart.Data(2,n7));
        series.getData().add(new XYChart.Data(1,n8));
        series.getData().add(new XYChart.Data(3,n9));
        series.getData().add(new XYChart.Data(4,n10));
        series.getData().add(new XYChart.Data(4,n11));
        series.getData().add(new XYChart.Data(4,n12));
        series.getData().add(new XYChart.Data(1,n13));
        series.getData().add(new XYChart.Data(3,n14));
        series.getData().add(new XYChart.Data(1,n15));
        series.getData().add(new XYChart.Data(10,n16));
        series.getData().add(new XYChart.Data(4,n17));
        series.getData().add(new XYChart.Data(11,n18));
        series.getData().add(new XYChart.Data(12,n19));
        series.getData().add(new XYChart.Data(5,n20));
        series.getData().add(new XYChart.Data(1,n21));
        series.getData().add(new XYChart.Data(1,n22));
        series.getData().add(new XYChart.Data(2,n23));
        series.getData().add(new XYChart.Data(4,n24));
        series.getData().add(new XYChart.Data(9,n25));
        series.getData().add(new XYChart.Data(21,n26));
        
       
        
        Scene scene = new Scene(bc,1000,800);
        
        bc.getData().add(series);
        
        stage.setScene(scene);
        
        stage.show();
    }
  
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
