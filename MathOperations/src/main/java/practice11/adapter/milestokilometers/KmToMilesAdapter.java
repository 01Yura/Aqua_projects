package practice11.adapter.milestokilometers;

public class KmToMilesAdapter {
    KmInfo kmInfo;

    public KmToMilesAdapter(KmInfo kmInfo) {
        this.kmInfo = kmInfo;
    }

    public MileInfo getMiles() {
        double miles = kmInfo.getDistance() * 0.621731;
        miles = (double) Math.round(miles * 100) / 100;
        return new MileInfo(miles);
    }
}
