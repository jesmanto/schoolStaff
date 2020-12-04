public class Principal extends Staff { //inheritance
    Principal(String idColor, boolean parkingSpace){

        //Calling the super constructor
        super(idColor, parkingSpace);
    }

    /**
     * List of Overridden methods
     * @return
     */
    @Override //Polymorphism
    public String getIdColor() {
        return "black";
    }
    @Override
    public int getAgeLimit(){
        return 50;
    }

    @Override
    public String getSalary(){
        return "100,000";
    }
}
