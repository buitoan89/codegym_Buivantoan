package models;

public abstract class Services {
    private String id;
    private String name;
    private double areaUsed;
    private double rentalCost;
    private int maxNumberOfPeaple;
    private String typeRent;

    public Services() {
    }

    public Services(String id, String name, double areaUsed, double rentalCost, int maxNumberOfPeaple, String typeRent) {
        this.id = id;
        this.name = name;
        this.areaUsed = areaUsed;
        this.rentalCost = rentalCost;
        this.maxNumberOfPeaple = maxNumberOfPeaple;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberOfPeaple() {
        return maxNumberOfPeaple;
    }

    public void setMaxNumberOfPeaple(int maxNumberOfPeaple) {
        this.maxNumberOfPeaple = maxNumberOfPeaple;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInfor();

}
