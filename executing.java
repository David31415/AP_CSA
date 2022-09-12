class Main{
    public static void main(String[] args_){
        Person Bob = new Person(178.0, 50,"Bob","Blond");
        Person Carlos = new Person(190.0, 19,"Carlos","White");
        Person Robert = new Person(160.0, 12,"Robert","Dark");
        HotelRoom House = new HotelRoom(1);
        House.checkIn(Bob);
        House.checkIn(Carlos);
        House.checkCapacity();
    }
}