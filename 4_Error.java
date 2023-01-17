import java.util.Arrays;

public class Error {
    private String user;
    private int count;
    private static int total = 0;

    public Error (String s){
        user = s.substring(6, s.length()-2);
        total++;
    }
    public String getUser(){
        return user;
    }
    public int getTotal(){
        return total;
    }

    //method to count duplicates in array
    public void displayFrequency(Error arr[], int n) {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        System.out.println();
        System.out.println("Errors");
        System.out.println("---------------------------------");
        System.out.printf("| %-20s | %6s |\n", "User", "Errors");
        System.out.println("---------------------------------");
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if ((arr[i].getUser()).equals(arr[j].getUser())) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.printf("| %-20s | %6d |\n", arr[i].getUser(), count);


//            System.out.println(arr[i].getUser() + " " + count);
        }
        System.out.println("---------------------------------");
        System.out.printf(" %-20s   %6d \n", "Total Errors:", getTotal());



    }

}
