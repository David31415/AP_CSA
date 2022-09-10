public class HotelRoom{ // Defining a PUBLIC HotelRoom class
    int roomNumber;
    Person guestOne; // Defining a guestOne that is of the Person class. 
    Person guestTwo; 
    int number_guest = 0;
    
    HotelRoom(int number){
        roomNumber = number; // Defining the hotel room number 

    }

    void checkIn(Person guest){

        while (number_guest <=2 ){
            if (guestOne == null){
                guestOne = guest;
                number_guest = 1;
            }
            
            if (guestOne!= null){
                guestTwo = guest;
                number_guest = 2;
                }
            
            if (guestOne != null && guestTwo != null && number_guest == 2){
                System.out.println("Maximum capacity reached.");
                number_guest++;
            }   
        }
            

        }

    void checkOut(Person guest){
        if (guestOne == guest){
            guestOne = null;
            number_guest = 0;
        }
        else{
            guestTwo = null;
            number_guest = 1;
            }
        }

    int checkCapacity(){
        if(guestOne != null && guestTwo != null){
            System.out.println("There are 2 guests.");
            return 2;
        }
        if(guestOne == null && guestTwo == null){
            System.out.println("There are 0 guests.");
            return 0;
        }
        if (guestOne == null && guestTwo != null){
            System.out.println("There is 1 guest");
            return 1;
        }

        if (guestOne != null && guestTwo == null){
            System.out.println("There is 1 guest");
            return 1;
        }
        return 0;

    }


    void printGuestInfo(){
        System.out.println(guestOne.height);
        System.out.println(guestOne.age);
        System.out.println(guestOne.name);
        System.out.println(guestOne.hairColor);
        
    }

}