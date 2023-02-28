package Planner;

import java.io.*;

public interface Printer {
    default void print(Task tsk) throws IOException {
        FileWriter fileToWrite = new FileWriter("src/main/java/Planner/Tasks.csv", true);
        fileToWrite.write(tsk + "\n");
        fileToWrite.flush();
        fileToWrite.close();
    }
}
