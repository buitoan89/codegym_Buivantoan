package models;

public class Villa extends Services {
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String name, float areaUsed, float rentalCost, int maxNumberOfPeaple, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOfFloors) {
        super(id, name, areaUsed, rentalCost, maxNumberOfPeaple, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }


    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String  showInfor() {
        return "\n Id Service:"+ super.getId() +
                "\n Name Service:"+ super.getName()+
                "\n Area Service:"+ super.getAreaUsed()+
                "\n Rental Cost:"+ super.getRentalCost()+
                "\n Max Number Of People: " + super.getMaxNumberOfPeaple()+
                "\n Type Rent:" + super.getTypeRent()+
                "\n Room Standart:"+ this.roomStandard+
                "\n Convenent Description"+ this.convenientDescription+
                "\n Area Pool"+ this.areaPool+
                "\n Number of Floor"+ this.numberOfFloors;

    }
}
