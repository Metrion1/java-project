import parts.Engine;
import parts.Wheel;

public class Car {
    private Engine engine;
    private Wheel[] wheels;

    public Engine getEngine() {
        return engine;
    }

    public void Engine(Engine engine) {
        if (engine == null) {
            throw new IllegalArgumentException("Engine cannot be null.");
        }
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        if (wheels == null || wheels.length == 0) {
            throw new IllegalArgumentException("Wheels cannot be null or empty.");
        }
        this.wheels = wheels;
    }
//add try catch block for the setWheels method to handle the exception and print a message to the console.

    public void setWheelsWithException(Wheel[] wheels) {
        try {
            setWheels(wheels);
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting wheels: " + e.getMessage());
        }
    }
// add overide method
@Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + java.util.Arrays.toString(wheels) + "]";
    }
    
}