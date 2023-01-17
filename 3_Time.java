import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    protected String jobId;
    private String startTime;
    private String endTime;
    protected String partition;
    private long difference;
    private static long sum = 0;
    private static int count = 0;
    private static long avg;



    public Time(){}
    public Time(String s1, String s2){
        jobId = s1.substring(42,53);
        startTime = s1.substring(0,25);
        endTime = s2.substring(0,25);
        difference = diff();
        sum += difference;
        count++;
    }
    public String getJobId() {
        return jobId;
    }
    public String getStartTime() {
        return startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public String getPartition() {
        return partition;
    }

    public void display(){
        System.out.printf("%-15s %-30s %-30s %-25s %-13s", getJobId(), getStartTime(), getEndTime(), getPartition(), "time taken: ");
        timeDifference();
    }

    //method to calculate time difference
    public long diff(){
        SimpleDateFormat format = new SimpleDateFormat("'['yyyy-MM-dd'T'HH:mm:ss.SSS']'");
        Date d1 = null;
        Date d2 = null;
        try{
            d1 = format.parse(startTime);
            d2 = format.parse(endTime);

            difference= d2.getTime() - d1.getTime();

        } catch (Exception e){
            e.printStackTrace();
        }
        return difference;
    }
    public void timeDifference (){
            long diffSeconds = difference / 1000 % 60;
            long diffMinutes = difference / (60 * 1000) % 60;
            long diffHours = difference / (60 * 60 * 1000) % 24;
            long diffDays = difference / (24 * 60 * 60 * 1000);

            System.out.print(diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.print(diffSeconds + " seconds.\n");
    }

    //method to calculate the time avg
    public void averageTime(){
        avg = sum / count;

        long avgSeconds = avg / 1000 % 60;
        long avgMinutes = avg / (60 * 1000) % 60;
        long avgHours = avg / (60 * 60 * 1000) % 24;
        long avgDays = avg / (24 * 60 * 60 * 1000);

        System.out.println("\nAverage Time taken to complete a Job: ");
        System.out.print(avgDays + " days, ");
        System.out.print(avgHours + " hours, ");
        System.out.print(avgMinutes + " minutes, ");
        System.out.print(avgSeconds + " seconds.\n");
    }


}
