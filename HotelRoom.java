public class HotelRoom{ // Defining a PUBLIC HotelRoom class
    int roomNumber;
    Person guestOne; // Defining a guestOne that is of the Person class. 
    Person guestTwo; // Defining the guestTwo slot
    int number_guest = 0; // We have the number of guest set equal to 0. 
    
    HotelRoom(int number){
        roomNumber = number; // Defining the hotel room number 
        guestOne = null; // Both guests are null (not specified)
        guestTwo = null;
        number_guest = 0;

    }

    HotelRoom(){ // Empty hotel room (default)
        roomNumber = 123; // Everything in this constructor is default.
        guestOne = null;
        guestTwo = null;
        number_guest = 0;
    }


    void checkIn(Person guest){ // Check in function won't return anything.
            if (number_guest > 1){ // if statements. There is no while loop 
                System.out.println("Max capacity reached."); // Initial if statement checks if there are 2 guests inside the hotel room. 
                return ; 
            }

            if (guestOne == null){ // If room is empty, we set the first slot to be the guest, 
                guestOne = guest;
                guestTwo = null;
                number_guest = 1; // Add one to total number.
            }
            
            else if (guestOne!= null){ // ELSE is important because this make sure that this section is not repeated if the previous section(s) are ran.
                guestTwo = guest; // If the guestone slot is filled, set guest equal to the guestTwo slot.
                number_guest = 2; // Add one
                }
            
            else if (guestOne != null && guestTwo != null && number_guest == 2){ // Kind of a repeat of the first if statment, not really needed.
                System.out.println("Maximum capacity reached.");
            }   
        }

    void checkOut(Person guest){ // Checking people out
 
        if (guestTwo == null && guestOne == null){ // If room is empty, there is no one to check out.
            System.out.println("No one to check out.");
        } 

        if (guestOne == guest){ // If the first guest slot is the person you want to check out, then check out the first guest and subtract one from the total guest count.
            guestOne = null;
            number_guest--;
        }
            
        if (guestTwo == guest){ // If the second person is the guest, then switch that placeholder to null. Decrease the total guest count by 1. 
            guestTwo = null;
            number_guest--;
        }
        
    }

    int checkCapacity(){
        if(guestOne != null && guestTwo != null){ // If both are not null, 2 guests.
            System.out.println("There are 2 guests.");
            return 2;
        }
        if(guestOne == null && guestTwo == null){ // If both are null, 0.
            System.out.println("There are 0 guests.");
            return 0;
        }
        if (guestOne == null && guestTwo != null){ // If one of them is not null, then 1 guest.
            System.out.println("There is 1 guest");
            return 1;
        }

        if (guestOne != null && guestTwo == null){ // Same as the above method.
            System.out.println("There is 1 guest");
            return 1;
        }
        return 0; // Placeholder statement, beause checkCapacity() requires a return statement.

    }


    void printGuestInfo(){ // Printing out the guest attributes of the person class.
        System.out.println(guestOne.height); // height
        System.out.println(guestOne.age); // age
        System.out.println(guestOne.name); // name
        System.out.println(guestOne.hairColor); // hair color
        
    }

}