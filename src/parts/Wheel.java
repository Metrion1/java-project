package parts;

public class Wheel {
    private double size; // size of the wheel in inches
    private double pressure; // pressure of the wheel in PSI

    public Wheel(double size, double pressure) {
            try{
        setSize(size);
        setPressure(pressure);
    }catch(
    IllegalArgumentException e)
    {
        System.out.println("Error creating wheel: " + e.getMessage());
    }catch(
    Exception e)
    {
        System.out.println("An unexpected error occurred while creating wheel: " + e.getMessage());
    }
   
    }
        //setSize(size);
        // setPressure(pressure);
    public void setSize(double size) {
        // precondition: size must be positive.
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive.");
        }

        // postcondition: size is set to the given value.
        this.size = size;
    }

    public void setPressure(double pressure) {
        // precondition: pressure must be non-negative.
        if (pressure < 0) {
            throw new IllegalArgumentException("Pressure cannot be negative.");
        }

        // postcondition: pressure is set to the given value.
        this.pressure = pressure;
    }

    public double getSize() {
        return size;
    }

    public double getPressure() {
        return pressure;
    }

    // overide method
@Override
    public String toString() {
        return "Wheel [size=" + size + ", pressure=" + pressure + "]";
    }
}

