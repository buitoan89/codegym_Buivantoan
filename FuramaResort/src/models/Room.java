package models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id, String name, float areaUsed, float rentalCost, int maxNumberOfPeaple, String typeRent, String freeService) {
        super(id, name, areaUsed, rentalCost, maxNumberOfPeaple, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        return  "\n Id Service:"+ super.getId() +
                "\n Name Service:"+ super.getName()+
                "\n Area Service:"+ super.getAreaUsed()+
                "\n Rental Cost:"+ super.getRentalCost()+
                "\n Max Number Of People: " + super.getMaxNumberOfPeaple()+
                "\n Type Rent:" + super.getTypeRent()+
                "\n Free Service"+ this.freeService;
    }
}
