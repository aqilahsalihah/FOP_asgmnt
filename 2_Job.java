public class Job {
    private String jobId;
    private static int jobStarted = 0;
    private static int jobEnded = 0;
    private static int totalJobs = 0;

    public Job (String[][] arr){
         countJobStart(arr);
         countJobEnd(arr);
         countTotalJob(arr);
    }
    public void countJobStart(String[][] arr){
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length > 2) {
                if (arr[j][2].equals("Allocate")) {
                    jobStarted++;
                }
            }
        }
    }
    public void countJobEnd(String[][] arr){
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length > 2) {
                if (arr[j][1].equals("_job_complete:") && arr[j][3].equals("done")) {
                    jobEnded++;
                }
            }
        }
    }
    public void countTotalJob(String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > 2) {
                if (arr[i][2].equals("Allocate")) {
                    jobId = arr[i][3];
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j].length > 2) {
                            if (arr[j][1].equals("_job_complete:") && arr[j][3].equals("done")) {
                                if (jobId.equals(arr[j][2])){
                                    totalJobs++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public int getJobStarted() {
        return jobStarted;
    }

    public  int getJobEnded() {
        return jobEnded;
    }

    public  int getTotalJobs() {
        return totalJobs;
    }
    public void display(){
        System.out.println("Jobs");
        System.out.println("---------------------------------");
        System.out.printf("| %-20s | %6s |\n", "Jobs", "Total");
        System.out.println("---------------------------------");
        System.out.printf("| %-20s | %6d |\n", "Jobs Started",getJobStarted());
        System.out.printf("| %-20s | %6d |\n", "Jobs Ended",getJobEnded());
        System.out.printf("| %-20s | %6d |\n", "Total Jobs",getTotalJobs());
        System.out.println("---------------------------------");
    }
}
