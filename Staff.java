public class Staff {
    Staff(String idColor,boolean parkingSpace){
        this.idColor = idColor;
        this.parkingSpace = parkingSpace;
    }

    public String getIdColor() {
        return idColor;
    }

    void setIdColor(String idColor) { // Encapsulation
        this.idColor = idColor;
    }

    private  String idColor;

    boolean parkingSpace;


    /**
     * List of new methods
     * @return
     */
    public int getAgeLimit(){
        return 35;
    }

    public String getSalary(){
        return "150,000";
    }

    public String disMiss(String staffName){
        return staffName + " has been successfully dismissed";
    }
    
}
