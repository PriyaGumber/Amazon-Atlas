package JavaTraining;

// Abstract class defining the blueprint for gadgets
abstract class Remote {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Remote {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

class ACRemote extends Remote {
    @Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}

// Additional concrete classes
class FanRemote extends Remote {
    @Override
    void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class CoolerRemote extends Remote {
    @Override
    void turnOn() {
        System.out.println("Cooler is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

// Main class to demonstrate abstraction

class Task040 {
    public static void main(String[] args) {
        Remote tvRemote = new TVRemote();
        tvRemote.turnOn();
        tvRemote.turnOff();

        Remote acRemote = new ACRemote();
        acRemote.turnOn();
        acRemote.turnOff();

        Remote fanRemote = new FanRemote();
        fanRemote.turnOn();
        fanRemote.turnOff();

        Remote coolerRemote = new CoolerRemote();
        coolerRemote.turnOn();
        coolerRemote.turnOff();
    }
}





