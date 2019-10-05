public enum VehicleSize {
  SMALL, MEDIUM, BIG;
}

public abstract Vehicle {
  Slot slot;
  VehicleSize size;
  int plateNumber;
  int carType;
}

class ParkingLot {
  public ParkingLot() {
  }
  
  public checkIn(Vehicle vehicle) {
  }
  
  public checkOut(Vehicle vehicle) {
  }
}

class Slot {
  String slotId;
  Vehicle vehicle;
  boolean isOccupied;
}
