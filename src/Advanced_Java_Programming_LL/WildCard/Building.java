package Advanced_Java_Programming_LL.WildCard;

public class Building {
    public int noOfRooms = 7;

    @Override
    public String toString() {
        return ("building");
    }

    public int getNoOfRooms(){
        return noOfRooms;
    }
    public void setNoOfRooms(int noOfRooms){
        this.noOfRooms = noOfRooms;
    }
}
