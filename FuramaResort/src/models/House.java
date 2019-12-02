package models;

public class House extends Services {
    private String roomStandard;
    private String convenientDescription;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String name, float areaUsed, float rentalCost, int maxNumberOfPeaple, String typeRent, String roomStandard, String convenientDescription, int numberOfFloors) {
        super(id, name, areaUsed, rentalCost, maxNumberOfPeaple, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return "\n Id Service:"+ super.getId() +
                "\n Name Service:"+ super.getName()+
                "\n Area Service:"+ super.getAreaUsed()+
                "\n Rental Cost:"+ super.getRentalCost()+
                "\n Max Number Of People: " + super.getMaxNumberOfPeaple()+
                "\n Type Rent:" + super.getTypeRent()+
                "\n Room Standart:"+ this.roomStandard+
                "\n Convenent Description"+ this.convenientDescription+
                "\n Number of Floor"+ this.numberOfFloors;
    }
}
