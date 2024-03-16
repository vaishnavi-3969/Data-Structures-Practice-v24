package Advanced_Java_Programming_LL.WildCard;

public class House extends Building{
    public int noOfRooms = 10;

    @Override
    public String toString(){
        return ("houes");
    }
    public int getNoOfRooms(){
        return noOfRooms;
    }
    public void setNoOfRooms(int noOfRooms){
        this.noOfRooms = noOfRooms;
    }
}
