package mock.museum;

import java.util.ArrayList;
import java.util.List;

public class Museum {
    private List<Ticket> list;

    public Museum() {
        this.list = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        list.add(ticket);
    }

    public int showSumAllTickets() {
        return list.stream().mapToInt(Ticket::getPrice).sum();
    }
}