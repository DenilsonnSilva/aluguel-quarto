package entities;

public class Rent {
    private String occupantName;
    private String occupantEmail;
    private int roomNumber;

    public Rent(String occupantName, String occupantEmail, int roomNumber) {
        this.occupantName = occupantName;
        this.occupantEmail = occupantEmail;
        this.roomNumber = roomNumber;
    }

    public String getOccupantName() {
        return occupantName;
    }

    public void setOccupantName(String occupantName) {
        this.occupantName = occupantName;
    }

    public String getOccupantEmail() {
        return occupantEmail;
    }

    public void setOccupantEmail(String occupantEmail) {
        this.occupantEmail = occupantEmail;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return roomNumber + ": " + occupantName + ", " + occupantEmail;
    }
}
