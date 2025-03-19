package homework_6.tasks.task4;

public class Main {
    public static void main(String[] args) {
        Storage priorityQueue = new Storage();

        Task wakeUp = new Task("Wake up", 1);
        Task wash = new Task("Wash my face", 2);
        Task eat = new Task("Have a breakfast", 3);
        Task go = new Task("Go for a walk", 4);

        priorityQueue.addTask(wakeUp);
        priorityQueue.addTask(wash);
        priorityQueue.addTask(eat);
        priorityQueue.addTask(go);

        priorityQueue.print();
        System.out.println();

        priorityQueue.performTask();
        priorityQueue.performTask();
        priorityQueue.print();

    }
}
