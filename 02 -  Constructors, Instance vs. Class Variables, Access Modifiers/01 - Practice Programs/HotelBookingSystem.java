class HotelBooking{

    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking(){
        setGuestName("Unknown");
        setRoomType("Unknown");
        setNights(0);
    }

    HotelBooking(String guestName,String roomType,int nights){
        setGuestName(guestName);
        setRoomType(roomType);
        setNights(nights);
    }

    HotelBooking(HotelBooking another){
        setGuestName(another.getGuestName());
        setRoomType(another.getRoomType());
        setNights(another.getNights());
    }

    public String getGuestName(){
        return guestName;
    }
    public void setGuestName(String guestName){
        this.guestName = guestName;
    }

    public String getRoomType(){
        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public int getNights(){
        return nights;
    }
    public void setNights(int nights){
        this.nights = nights;
    }

}

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Ankit", "Double-Bed", 2);
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println(b1.getGuestName());
        System.out.println(b2.getRoomType());
        System.out.println(b3.getRoomType());
    }
}
