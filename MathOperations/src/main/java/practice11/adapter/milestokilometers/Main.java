package practice11.adapter.milestokilometers;

public class Main {
    public static void main(String[] args) {
        DistanceSystem system = new DistanceSystem();
        MileInfo mileInfo = new MileInfo(100);
        system.printDistance(mileInfo);

        KmInfo kmInfo = new KmInfo(100);
        KmToMilesAdapter adapter = new KmToMilesAdapter(kmInfo);
        system.printDistance(adapter.getMiles());
    }
}
