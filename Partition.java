public class Partition extends Time {
    private static int opteron = 0;
    private static int epyc = 0;
    private static int v100s = 0;
    private static int k10 = 0;
    private static int k40c = 0;
    private static int titan = 0;
    private static int total = 0;

    public Partition(String s1){
        partition = s1;
        count(partition);
        total++;
    }

    public void count (String partition) {
        if (partition.equals("Partition=cpu-opteron")) {
            opteron++;
        } else if (partition.equals("Partition=cpu-epyc")) {
            epyc++;
        } else if (partition.equals("Partition=gpu-v100s")) {
            v100s++;
        } else if (partition.equals("Partition=gpu-k10")) {
            k10++;
        } else if (partition.equals("Partition=gpu-k40c")) {
            k40c++;
        } else if (partition.equals("Partition=gpu-titan")) {
            titan++;
        }
    }
    public void diplayPartiton(){
        System.out.println();
        System.out.println("Partition");
        System.out.println("---------------------------------");
        System.out.printf("| %-20s | %6s |\n", "Types", "Number");
        System.out.println("---------------------------------");
        System.out.printf("| %-20s | %6d |\n", "CPU opteron", opteron);
        System.out.printf("| %-20s | %6d |\n", "CPU EPYC", epyc);
        System.out.printf("| %-20s | %6d |\n", "GPU v100s", v100s);
        System.out.printf("| %-20s | %6d |\n", "GPU k10", k10);
        System.out.printf("| %-20s | %6d |\n", "GPU k40c", k40c);
        System.out.printf("| %-20s | %6d |\n", "GPU titan", titan);
        System.out.println("---------------------------------");
        System.out.print("Total Partition: \t");
        System.out.println(total);
    }
}
