package Planner;

import java.util.Date;

public class Task<T> implements Printer{
    private int id;
    private Date dateOfCreating;
    private T priority;
    private Date deadLine;
    private String author;


    public Task(int id, Date dateOfCreating , T priority, Date  deadline, String author) {
        this.id = id;
        this.dateOfCreating = dateOfCreating;
        this.priority = priority;
        this.deadLine =   deadline ;
        this.author = author;
    }
        public T getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Документ № %d:\n Дата создания %s\n Приоритет: %s\n Конец срока сдачи: %s\n Создатель: %s".formatted(
                this.id,
                this.dateOfCreating,
                this.priority,
                this.deadLine,
                this.author);
    }
}
