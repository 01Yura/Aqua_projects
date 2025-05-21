package mock.museum;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        museum.addTicket(new NormalTicket(100,0));
        museum.addTicket(new NormalTicket(100, 0));
        museum.addTicket(new NormalTicket(100, 0));

        museum.addTicket(new StudentTicket(100, 50));
        System.out.println(museum.showSumAllTickets());
    }
}
