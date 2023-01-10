/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hauntedhouse;
import java.awt.Component;
import javax.swing.ImageIcon; 
import javax.swing.JOptionPane;

/**
 *
 * @author Rahshann
 */
public class HauntedHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ImageIcon beginHere = new ImageIcon("Da Pic.png");
    ImageIcon floor2 = new ImageIcon("floor2.png");
    ImageIcon HauntedHouse = new ImageIcon("Haunted House.jpeg");
    ImageIcon Rules = new ImageIcon("Rules1.jpeg");
    ImageIcon ScaredPerson = new ImageIcon("Haunted Person.jpeg");
    ImageIcon Nightmare = new ImageIcon("Nightmare.jpeg");
    ImageIcon Choice1 = new ImageIcon("hauntedhouse2.jpeg");
    ImageIcon LRoom = new ImageIcon("LivingRoom.jpeg");
    ImageIcon DRoom = new ImageIcon("diningRoom.jpeg");
    ImageIcon CanDoor = new ImageIcon("CanDoor.jpeg");
    ImageIcon Shadow = new ImageIcon("Shadow.jpeg");
    ImageIcon Kitchen = new ImageIcon("Kitchen.jpeg");
    ImageIcon SecondFloor = new ImageIcon("SecondFloor.jpeg");
    ImageIcon HallDoor = new ImageIcon("HallDoor.jpeg");
    ImageIcon Bed1 = new ImageIcon("Bed1.jpeg");
    ImageIcon Bed2 = new ImageIcon("Bed2.jpeg");
    ImageIcon MasterBed = new ImageIcon("MasterBed.jpeg");
    ImageIcon Hall = new ImageIcon("Hall.jpeg");
    ImageIcon Bed2MasterBed = new ImageIcon("TwoDoors.jpeg");

    
    
    Object[] options = {"Living Room.", "Dining Room.", "Go Upstairs."};
    Object[] drOptions = {"Check Candelabra", "Enter through door"};
    Object[] firstchoice = {"Go into front bedroom", "Go down the hall"};
    Object[] secondChoice = {"Open door to second bedroom", 
        "Open door to Master bedroom"};
    
        /* UserInput*/
        Component frame = null;
        
        /*Lines 33-42 are objects to call methods*/
        UserInfo name = new UserInfo();
        UserInfo LivingRoom = new UserInfo();
        UserInfo DinningRoom = new UserInfo();
        UserInfo GoUpstairs = new UserInfo();
        Floor1Rooms LRBRselect = new Floor1Rooms();
        Floor1Rooms DRselect = new Floor1Rooms();
        Floor1Rooms KitPanselect = new Floor1Rooms();
        Floor2Rooms FrontBRtoMB = new Floor2Rooms();
        Floor2Rooms SecondBRtoMB = new Floor2Rooms();
        Floor2Rooms MasterBR = new Floor2Rooms();
        
        
        /*Introduction messages, rules, and userInfo- lines 51-68*/
        JOptionPane.showMessageDialog(null, 
                "THE HAUNTED HOUSE ON MELBOURY ROAD!","Haunted House",
                JOptionPane.INFORMATION_MESSAGE,HauntedHouse);
        JOptionPane.showMessageDialog(null, """
                                       RULES: 
               *Explore the Haunted House
               *Select where you'd like to go from choices
               *Either pick up an object in the room or move forward
               *BE CAREFUL WHICH OBJECT YOU PICK UP, IT COULD BE DANGEROUS!""",
                "Haunted House",JOptionPane.INFORMATION_MESSAGE,Rules);

        String userInfo = (String) JOptionPane.showInputDialog(frame,
                "Please Enter Your Name:\n",
                "Welcome, My Next Victim!",
                JOptionPane.PLAIN_MESSAGE,
                ScaredPerson, null, null);
        
        if (userInfo != null) {
            name.setUserInfo(userInfo);
        }

        /*user location lines 73-75*/
        JOptionPane.showMessageDialog(frame, 
                "Welcome to the Nightmare, " + name.getUserInfo() + "!", 
                "Haunted House",JOptionPane.INFORMATION_MESSAGE,
                Nightmare);
        JOptionPane.showMessageDialog(null,
                " <--- Here is your location ", "Haunted House Map",
                JOptionPane.INFORMATION_MESSAGE, beginHere);

        String userChoice = (String) JOptionPane.showInputDialog(
                frame,name.getUserInfo()+ ", "+
                """
                              where would you like to go first?
                             Living Room, Dining Room, or Go Upstairs""",
                "Don't Be Scared!", JOptionPane.PLAIN_MESSAGE,
                Choice1, options, "Living Room.");

        if (userChoice.equals("Living Room.")) { /*user chooses Living Room*/
            LivingRoom.setUserInfo(userChoice);
            JOptionPane.showMessageDialog(frame, 
                    "You have now entered the Living Room.",
                    "Haunted House",JOptionPane.INFORMATION_MESSAGE,
                    LRoom);
            LRBRselect.LRtoBRSelect(); /*Calling Method to get nested if statements in class Floor1Rooms*/    
        }
        else if (userChoice.equals("Dining Room.")) {/*user chooses Dining Room*/
            DinningRoom.setUserInfo(userChoice);
            JOptionPane.showMessageDialog(frame,
                        "You have now entered the Dining Room.","Haunted House",
                        JOptionPane.INFORMATION_MESSAGE,DRoom);
            String drChoice = (String) JOptionPane.showInputDialog(
                frame, 
                """
                            There is a Check Candelabra in here.
                Would you like to check it or move forward through the door?""",
                "Fear is all around you!",
                JOptionPane.PLAIN_MESSAGE, CanDoor,
                drOptions, "Check Candelabra");
        if(drChoice.equals("Check Candelabra")) {
            JOptionPane.showMessageDialog(frame, """
            IT BEGINS TO LIGHT UP BY ITSELF AND YOU NOTICE A DEATH SHADOW!!!
                            YOU STORED ZERO ITEMS.     
                                GAME OVER!!!!""","Haunted House",
                                JOptionPane.INFORMATION_MESSAGE,
                                Shadow);
                    
                }
        if(drChoice.equals("Enter through door")){
            JOptionPane.showMessageDialog(frame,
                    "You have now entered the Kitchen.","Haunted House",
                    JOptionPane.INFORMATION_MESSAGE, Kitchen);
    KitPanselect.KitchenToPantrySelect();/*Calling Method to get nested if statements in class Floor1Rooms*/   
             
    
    }
            
            
            
            
            
           
                
}
        else if (userChoice.equals("Go Upstairs.")) {/*user chooses go upstairs*/
            GoUpstairs.setUserInfo(userChoice);
            JOptionPane.showMessageDialog(frame,
                    "Welcome to the second Floor.","Haunted House",
                    JOptionPane.INFORMATION_MESSAGE,SecondFloor);
            JOptionPane.showMessageDialog(null,
                    " <--- Here is your location ",
                    "Haunted House Map",
                    JOptionPane.INFORMATION_MESSAGE, floor2);
            String objectChoice = (String) JOptionPane.showInputDialog(
                    frame,
                    """
                                                                                    
            Would you like to open door to front bedroom or go forward down the hall?""",
                    "Are you scared yet?",
                    JOptionPane.PLAIN_MESSAGE,
                    HallDoor, firstchoice,
                    "Go into front bedroom");
            if(objectChoice.equals("Go into front bedroom")){
                JOptionPane.showMessageDialog(frame,
                         "You are now in the front bedroom.","Haunted House",
                         JOptionPane.INFORMATION_MESSAGE, Bed1);
                FrontBRtoMB.BR1toMasterBath();
              }
            else if(objectChoice.equals("Go down the hall")){
                JOptionPane.showMessageDialog(frame,
                             "You walk down to the end of the hall.",
                             "Haunted House",
                             JOptionPane.INFORMATION_MESSAGE, Hall);
                String Hw2Choice = (String) JOptionPane.showInputDialog(
                        frame, """
                        You have come up to two doors. You can choose to:   
                    Open door to second bedroom, Open door to Master bedroom""",
                        "WHY ARE YOU STILL HERE!!!",
                        JOptionPane.PLAIN_MESSAGE, Bed2MasterBed,
                        secondChoice,
                        "Open door to second bedroom");
                if(Hw2Choice.equals("Open door to second bedroom")){
                    JOptionPane.showMessageDialog(frame,
                         "You have now entered the second bedroom.",
                         "Haunted House",
                         JOptionPane.INFORMATION_MESSAGE, Bed2);
                    SecondBRtoMB.SecondBedtoMaster();
                        }
                        
                    
              
        
                if(Hw2Choice.equals("Open door to Master bedroom")){
                    JOptionPane.showMessageDialog(frame,
                         "You have now entered the Master bedroom.",
                         "Haunted House",
                         JOptionPane.INFORMATION_MESSAGE,
                         MasterBed);
                    MasterBR.MasterBed();
                                }
                            }
}

        JOptionPane.showMessageDialog(frame,
                             "THANK YOU PLAYING MY HAUNTED HOUSE GAME, "
                                     +name.getUserInfo()+ "!");
    }
    }
    




       
    





