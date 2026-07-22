package parts;

public class Engine {
    //Diesle, gasoline, electric, hybrid.
    private String type;
    //horsepower of the engine.
    private int horsepower;

    public Engine(String type, int horsepower) {
        try{
       setType(type);
       setHorsepower(horsepower);
    }catch(IllegalArgumentException e) {
        System.out.println("Error creating engine: " + e.getMessage());
    }catch(Exception e) {
        System.out.println("An unexpected error occurred while creating engine: " + e.getMessage());
    }
    }

    public void setHorsepower(int horsepower) {
        //precondiotion: horsepower must be non-negative.
        if (horsepower < 0 ) {
            throw new IllegalArgumentException("Horsepower cannot be negative.");
        }

        //postcondition: horsepower is set to the given value.
        this.horsepower = horsepower;
    }

public void setType(String type) {
    //trim and convert to lowercase for consistency
    type = type.trim().toLowerCase();
    /*if type == null || type.isEmpty()) {
        throw new IllegalArgumentException("Engine type cannot be null or empty.");
    }*/
    
    //precondition: type must be a valid engine type.
    if (type == null ||
        type == "" || 
        type != "diesel" ||
        type != "gasoline" || 
        type != "electric" || 
        type != "hybrid") {
        throw new IllegalArgumentException("Invalid engine type.");
    }
}

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return "Engine [type=" + type + ", horsepower=" + horsepower + "]";
    }

    //overide method
//add try catch block for the setWheels method to handle the exception and print a message to the console.
}
