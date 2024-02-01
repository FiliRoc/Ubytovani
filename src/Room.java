package ROOM

public class Room {
    private String name;
    double pricePerDay;
    private int roomNO;

    public Room(double pricePerDay, name name, roomNO roomNO) {
        this.pricePerDay = pricePerDay;
        this.name = name;
        this.roomNO = roomNO;
    }


    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getRoomNO() {
        return roomNO;
    }

    public void setRoomNO(int roomNO) {
        this.roomNO = roomNO;
    }
}
