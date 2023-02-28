package Planner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Task> arrayWithPrio = new ArrayList<>();
        LowPriority lowPriority = new LowPriority();
        OrdinaryPriority ordinaryPriority = new OrdinaryPriority();
        HighPriority highPriority = new HighPriority();


        Calendar forFirstTask =  new GregorianCalendar(2023,Calendar.FEBRUARY,1);
        Date first = forFirstTask.getTime();

        forFirstTask.add(Calendar.HOUR,+504);
        Date deadLine = forFirstTask.getTime();
        Calendar now = new GregorianCalendar();
        Date nov = now.getTime();
        now.add(Calendar.HOUR,+504);
        Date deadLineNow = now.getTime();

        Task<LowPriority> task1;
        task1 = new Task<>(1, first, lowPriority,  deadLine , "Админ");
        arrayWithPrio.add(task1);

        Task<OrdinaryPriority> task2 = new Task<>(2, nov, ordinaryPriority, deadLineNow, "Админ");
        arrayWithPrio.add(task2);

        Task<HighPriority> task3 = new Task<>(3,nov, highPriority, deadLineNow, "Админ");
        arrayWithPrio.add(task3);

        for (Task tsk: arrayWithPrio) {
            System.out.println(tsk);
            System.out.println();
            tsk.print(tsk);
        }
    }
}