import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line = "";
        int lineCount = 0;

        //read file
        try {
            Scanner input = new Scanner(new FileInputStream(
                    "C:\\Users\\Aqilah\\Documents\\UM\\WIX1002 FUNDAMENTALS OF PROGRAMMING\\Project FOP\\extracted_log"));
            while (input.hasNextLine()) {
                lineCount++;
                line += input.nextLine();
                if (input.hasNextLine())
                    line += ";;";
            }
            input.close();
            System.out.println("Read file successful");
        } catch (IOException e){
            System.out.println("Something went wrong");
        }

        //initialize array
        String[] logLine = line.split(";;");
        String[][] log = new String[logLine.length][];
        for (int i = 0; i < logLine.length; i++) {
            log[i] = logLine[i].split(" ");

        }

        //count jobs
        Job jobs = new Job(log);
        int n = 0;
        int p = 0;
        String jobId;
        Partition[] partitions = new Partition[jobs.getJobStarted()];
        Time[] allocatedJobs = new Time[jobs.getTotalJobs()];
        for (int i = 0; i < log.length; i++) {
            if (log[i].length > 2) {
                if (log[i][2].equals("Allocate")) {
                    partitions[p] = new Partition(log[i][6]);
                    jobId = log[i][3];
                    for (int j = 0; j < log.length; j++) {
                        if (log[j].length > 2) {
                            if (log[j][1].equals("_job_complete:") && log[j][3].equals("done")) {
                                if (jobId.equals(log[j][2])){
                                    allocatedJobs[n] = new Time(logLine[i], logLine[j]);
                                    n++;
                                }
                            }
                        }
                    }
                }
            }
        }

        //count error
        int numError=0;
        for (int i = 0; i < log.length; i++) {
            if(log[i].length>3){
                if (log[i][3].equals("association")) {
                    numError++;
                }
            }
        }

        //initialize errors array
        Error[] errors = new Error[numError];
        int e = 0;
        for (int i = 0; i < log.length; i++) {
            if(log[i].length>3){
                if (log[i][3].equals("association")) {
                    errors[e] = new Error(log[i][5]);
                    e++;
                }
            }
        }

        //display tables
        jobs.display();
        allocatedJobs[0].averageTime();
        partitions[0].diplayPartiton();
        errors[0].displayFrequency(errors, errors.length);
    }
}
