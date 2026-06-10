import java.util.Scanner;
import java.io.*;

public class Study_Tracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = 1;

        // Read previous day from file
        try {
            File file = new File("day.txt");

            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = br.readLine();

                if (line != null) {
                    day = Integer.parseInt(line) + 1;
                }

                br.close();
            }
        } catch (Exception e) {
            System.out.println("Error reading day file.");
        }

        System.out.println("===== Welcome to LearnTrack =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("What do you want to learn? ");
        String topic = sc.nextLine();

        System.out.print("Enter target study hours: ");
        int targetHours = sc.nextInt();

        System.out.println("\n===== DAY " + day + " =====");

        System.out.print("How many hours did you study today? ");
        int studiedHours = sc.nextInt();

        double percentage = ((double) studiedHours / targetHours) * 100;

        System.out.println("\n===== DAILY REPORT =====");
        System.out.println("Name: " + name);
        System.out.println("Topic: " + topic);
        System.out.println("Target Hours: " + targetHours);
        System.out.println("Studied Hours: " + studiedHours);
        System.out.printf("Progress: %.2f%%\n", percentage);

        if (studiedHours >= targetHours) {
            System.out.println("🎉 Goal Achieved!");
        } else if (studiedHours >= targetHours / 2) {
            System.out.println("👍 Good Progress. Keep Going!");
        } else {
            System.out.println("⚠ You need to study more.");
        }

        // Reminder message
        if (studiedHours == 0) {
            System.out.println("📚 You did not study today. Try to maintain consistency.");
        }

        // Save current day
        try {
            FileWriter fw = new FileWriter("day.txt");
            fw.write(String.valueOf(day));
            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving day.");
        }

        sc.close();
    }
}