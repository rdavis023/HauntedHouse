/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hauntedhouse;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Rahshann
 */
public class Floor2Rooms {
    
    Object[] bedroom1choices = {"Inspect the rocking chair", "Look through window",
        "Open door to the bathroom"};
    Object[] bathroom1choices = {"Look at the mirror", "Inspect the shower",
        "Open door to the second bedroom"};
    Object[] bedroom2choices = {"Inspect doll house", "Open the dresser",
        "Open door to the hallway"};
    Object[] HallChoice = {"Open door to Master bedroom", "Go home"};
    Object[] secondBR2Choice = {"Inspect doll house", "Open the dresser",
        "Open door to bathroom"};
    Object[] secondBath1Choice = {"Look at the mirror", "Inspect the shower",
        "Open door to the front bedroom"};
    Object[] secondBR1Choice = {"Inspect the rocking chair",
        "Look through window", "Open door to the hallway"};
    Object[] hallwayChoice2 = {"Go back down the hall and open Master bedroom door",
        "Go home"};
    Object[] masterBRchoice = {"Open jewelry box", "Open door to Master bathroom"};
    Object[] masterBathChoice = {"Investigate lamp", "Check the shower"};
    Object[] YesNoOption = {"Yes", "No"};
    Component frame = null;
   
    ImageIcon Bed1 = new ImageIcon("Bed1.jpeg");
    ImageIcon Bed2 = new ImageIcon("Bed2.jpeg");
    ImageIcon MasterBed = new ImageIcon("MasterBed.jpeg");
    ImageIcon Hall = new ImageIcon("Hall.jpeg");
    ImageIcon Alert = new ImageIcon("alert.jpeg");
    ImageIcon Running = new ImageIcon("Running away.jpeg .jpg");
    ImageIcon Door = new ImageIcon("Creepy Door.jpeg");
    ImageIcon Chair = new ImageIcon("chair.jpeg");
    ImageIcon SwingSet = new ImageIcon("Swingset.jpeg");
    ImageIcon Bathroom = new ImageIcon("BathroomUp.jpeg");
    ImageIcon MirrorFace = new ImageIcon("MirrorFace.jpeg");
    ImageIcon ScaryShower = new ImageIcon("ScaryShower.jpeg");
    ImageIcon Lamp = new ImageIcon("lamp.jpeg");
    ImageIcon DollHouse = new ImageIcon("dolls.jpeg");
    ImageIcon MasterBath = new ImageIcon("MasterBath.jpeg");
    ImageIcon Cursed = new ImageIcon("necklace.jpeg");
    ImageIcon Ghost = new ImageIcon("Ghost.jpeg");
    ImageIcon Genie = new ImageIcon("genie.jpeg");
    ImageIcon Demon = new ImageIcon("demon.jpeg");
    ImageIcon EmptyShower = new ImageIcon("EmptyShower.jpeg");
    
    
    
    
    public void BR1toMasterBath() {
        String objectChoice2 = (String) JOptionPane.showInputDialog(frame,
                """
                        You have three options in this room. You can:   
   Inspect the rocking chair, Look through the window, or Open door to the bathroom""", 
                "I can smell your FEAR", JOptionPane.PLAIN_MESSAGE,
                Alert, bedroom1choices, 
                "Inspect the rocking chair");
        if (objectChoice2.equals("Inspect the rocking chair")) {
            JOptionPane.showMessageDialog(frame,
                    "The chair starts rocking backing and forth by itself!"
            ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                            Chair);
            JOptionPane.showMessageDialog(frame, """
                              You quickly run out the house scared!! 
                                    You stored no items!
                                            GAME OVER!!""","Haunted House",
                                            JOptionPane.INFORMATION_MESSAGE,
                                            Running);
            
        }
        if (objectChoice2.equals("Look through window")) {
            JOptionPane.showMessageDialog(frame, """
                              You see a child on a swingset just swinging
                                        back and forth!! 
                                    Then he suddenly disappears!
                                            ""","Haunted House",
                                            JOptionPane.INFORMATION_MESSAGE,
                                            SwingSet);
            JOptionPane.showMessageDialog(frame, """
                              You high tail it out of the house in FEAR!! 
                                    You stored no items!
                                            GAME OVER!!""","Haunted House",
                                            JOptionPane.INFORMATION_MESSAGE,
                                            Running);
           
        }
        if (objectChoice2.equals("Open door to the bathroom")) {
            JOptionPane.showMessageDialog(frame,
                    "You have now entered the bathroom."
                    ,"Haunted House",
                                 JOptionPane.INFORMATION_MESSAGE,
                                            Bathroom);
            String BathRChoice = (String) JOptionPane.showInputDialog(
                    frame, """
                    You have three options in this room. You can:   
        Look at the mirror, Inspect the shower, Open door to the second bedroom""",
                    "Danger is all around!",
                    JOptionPane.PLAIN_MESSAGE, Alert,
                    bathroom1choices,
                    "Look at the mirror");
            if (BathRChoice.equals("Look at the mirror")) {
                JOptionPane.showMessageDialog(frame, """
                        YOU SEE A BLOODY FACE LOOKING BACK AT YOU!
                                IT TAKES YOUR SOUL.
                               YOU STORED ZERO ITEMS.
                                    GAME OVER!!!!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    MirrorFace);
                
            }
            if (BathRChoice.equals("Inspect the shower")) {
                JOptionPane.showMessageDialog(frame, """
                THE ROOM SUDDENLY STARTS TO STEAM UP, AND YOU FEEL SOMEONE'S 
                            FINGERS TOUCH THE BACK OF YOUR NECK!
                                                   ""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    ScaryShower);
                JOptionPane.showMessageDialog(frame, """
                            YOU RUN HOME BACK TO MAMA!!
                                YOU STORED ZERO ITEMS.
                                    GAME OVER!!!!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    Running);
                
            }
            if (BathRChoice.equals("Open door to the second bedroom")) {
                JOptionPane.showMessageDialog(frame,
                        "You have now entered the second bedroom.",
                        "Haunted House",
                        JOptionPane.INFORMATION_MESSAGE, Bed2);
                String BRChoice = (String) JOptionPane.showInputDialog(
                        frame, """
                        You have three options in this room. You can:   
                Inspect doll house, Open the dresser, Open door to the hallway""",
                        "HAHA... It's ok to be SCARED!",
                        JOptionPane.PLAIN_MESSAGE,
                        Alert, bedroom2choices,
                        "Inspect doll house");
                if (BRChoice.equals("Inspect doll house")) {
                    JOptionPane.showMessageDialog(frame,
                       "THE DOLLS START DANCING, DOING THE STANKY LEG!!"
                    ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                            DollHouse);
                    JOptionPane.showMessageDialog(frame, """
                            YOU RUN AS FAST AS USAIN BOLT ALL THE WAY HOME!!
                                        YOU STORED ZERO ITEMS.
                                            GAME OVER!!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Running);
                    

                }
                if (BRChoice.equals("Open the dresser")) {
                    JOptionPane.showMessageDialog(frame, """
                                    A GHOST FLIES OUT THE MOMENT
                                     YOU OPEN IT AND GOES RIGHT
                                        THROUGH YOUR BODY!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Ghost);
                    JOptionPane.showMessageDialog(frame, """
                            YOU RUN OUT THE HOUSE AS FAST AS YOU CAN!!
                                        YOU STORED ZERO ITEMS.
                                            GAME OVER!!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Running);
                    
                }
                if (BRChoice.equals("Open door to the hallway")) {
                    JOptionPane.showMessageDialog(frame,
                            "Welcome back to the hallway.",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE,
                            Hall);
                    String HwChoice = (String) JOptionPane.showInputDialog(
                            frame, """
                    You've almost reached the end of the tour....HAHA....
                                HOW DO YOU FEEL? You can choose to:   
Continue exploring by opening up the door to the Master bedroom, or Go home.""",
                            "GET OUT MY HOUSE!!", 
                            JOptionPane.PLAIN_MESSAGE, Door, 
                            HallChoice, 
                            "Open door to Master bedroom");
                    if (HwChoice.equals("Open door to Master bedroom")) {
                        JOptionPane.showMessageDialog(frame,
                                "You have now entered the Master bedroom."
                        ,"Haunted House",
                        JOptionPane.INFORMATION_MESSAGE,MasterBed);
                        String MBedChoice = (String) JOptionPane.showInputDialog(
                                frame, """
                            You have two options in this room. You can:   
                          Open jewelry box, Open door to Master bathroom""",
                                "YOU WON'T LIKE ME WHEN I'M MAD!!!",
                                JOptionPane.PLAIN_MESSAGE, Alert,
                                masterBRchoice, 
                                "Open jewelry box");
                        if (MBedChoice.equals("Open jewelry box")) {
                            JOptionPane.showMessageDialog(frame, """
                                    YOU FOUND THE CURSED HOPE DIAMOND!!"""
                            ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                            Cursed);
                            JOptionPane.showMessageDialog(frame, """
        SUDDENLY YOU BEGIN TO SEE DEMONS COMING TO CARRY YOU TO THE AFTERLIFE!!
                                YOU STORED ZERO ITEMS.
                                    GAME OVER!!!!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    Demon);
                            
                        }
                        if (MBedChoice.equals("Open door to Master bathroom")) {
                            JOptionPane.showMessageDialog(frame,
                             "You have now entered the Master bathroom."
                            ,"Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                            MasterBath);
                            String MBathChoice = (String) JOptionPane.showInputDialog(
                                    frame, """
                                You have two options in this room. You can:   
                                    Investigate lamp, Check the shower""",
                                    "I DESPISE WHEN PEOPLE DISTURB MOTHER!!!",
                                    JOptionPane.PLAIN_MESSAGE,
                                    Alert, masterBathChoice,
                                    "Investigate lamp");
                            if (MBathChoice.equals("Investigate lamp")) {
                                JOptionPane.showMessageDialog(frame, 
                                        """
                                                         YOU RUB THE LAMP AND A
                                                         GENIE POPS OUT WHO SAYS
                                                         HE WILL GRANT YOU THREE
                                                         WISHES."""
                                ,"Haunted House",
                                     JOptionPane.INFORMATION_MESSAGE,
                                            Genie);
                                String YesNoChoice = (String) JOptionPane.showInputDialog(
                                        frame, """
                              Would you like to store the lamp in your backpack?   
                                                                             """,
                                        "HOW DARE YOU FIND THAT!!!",
                                        JOptionPane.PLAIN_MESSAGE, 
                                        Lamp, YesNoOption,
                                        "Yes");
                                if (YesNoChoice.equals("Yes")) {
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                           CONGRADULATIONS! YOU'VE FOUND A RARE
                                           GENIE LAMP AND CHOSE TO STORE IT. """);
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                                         YOU WENT HOME WITH A
                                                         MYSTICAL TREASURE.
                                                         LAMP STORED.
                                                         YOU WIN!!!!!""");
                                    
                                }
                                if (YesNoChoice.equals("No")) {
                                    JOptionPane.showMessageDialog(
                                            frame,
                           "Ok, instead you chose to check the shower.");
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                           YOU SUDDENLY HEAR SINGING IN THE 
                                           SHOWER, BUT NO ONE IS THERE."""
                                    ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    EmptyShower);
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                           YOU DECIDE THAT THIS LIFESTYLE IS NOT 
                                           FOR YOU, SO YOU RUN BACK HOME.
                                                   YOU STORED NOTHING.
                                                        GAME OVER!!!""",
                                            "Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                            Running);
                                    
                                }
                            }
                            if (MBathChoice.equals("Check the shower")) {
                                JOptionPane.showMessageDialog(frame,
                                        """
                                           YOU SUDDENLY HEAR SINGING IN THE 
                                           SHOWER, BUT NO ONE IS THERE."""
                                ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    EmptyShower);
                                JOptionPane.showMessageDialog(frame,
                                        """
                                           YOU DECIDE THAT THIS LIFESTYLE IS NOT 
                                           FOR YOU, SO YOU RUN BACK HOME.
                                                   YOU STORED NOTHING.
                                                        GAME OVER!!!""",
                                        "Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                            Running);
                                
                            }
                        }
                    } else if (HwChoice.equals("Go home")) {
                        JOptionPane.showMessageDialog(frame, 
                                """
                                           BWAHAHAHA.....YOU RAN HOME IN FEAR.
                                           COWARD!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Running);
                        JOptionPane.showMessageDialog(frame, 
                                """
                                           YOU STORED NOTHING. 
                                           GAME OVER!!!""");
                        
                    }
                }
            }
        }
    }

    public void SecondBedtoMaster() {
        String BR2Choice = (String) JOptionPane.showInputDialog(
                frame, """
                You have three options in this room. You can:   
        Inspect doll house, Open the dresser, Open door to bathroom""", 
                "I SEE EVERYTHING!!!", JOptionPane.PLAIN_MESSAGE,
                Alert, secondBR2Choice,
                "Inspect doll house");
        
        if (BR2Choice.equals("Inspect doll house")) {
            JOptionPane.showMessageDialog(frame,
                    "THE DOLLS START DANCING, DOING THE STANKY LEG!!"
            ,"Haunted House",
                                   JOptionPane.INFORMATION_MESSAGE,
                                            DollHouse);
            JOptionPane.showMessageDialog(frame, """
                        YOU RUN AS FAST AS USAIN BOLT ALL THE WAY HOME!!
                                    YOU STORED ZERO ITEMS.
                                          GAME OVER!!!!""","Haunted House",
                                          JOptionPane.INFORMATION_MESSAGE,
                                          Running);
            
        }
        if (BR2Choice.equals("Open the dresser")) {
            JOptionPane.showMessageDialog(frame, """
                                A GHOST FLIES OUT THE MOMENT
                                 YOU OPEN IT AND GOES RIGHT
                                    THROUGH YOUR BODY!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Ghost);
            JOptionPane.showMessageDialog(frame, """
                    YOU RUN OUT THE HOUSE AS FAST AS YOU CAN!!
                            YOU STORED ZERO ITEMS.
                                GAME OVER!!!!""","Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                          Running);
            
        }
        if (BR2Choice.equals("Open door to bathroom")) {
            JOptionPane.showMessageDialog(frame,
                    "You have now entered the bathroom."
            ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                            Bathroom);
            String BathRChoice2 = (String) JOptionPane.showInputDialog(
                    frame, """
                    You have three options in this room. You can:   
        Look at the mirror, Inspect the shower, Open door to the front bedroom""",
            "HOW MANY GHOST DOES IT TAKE TO BRING YOU TO THE AFTERLIFE?",
            JOptionPane.PLAIN_MESSAGE, Alert,
          secondBath1Choice, "Look at the mirror");

            if (BathRChoice2.equals("Look at the mirror")) {
                JOptionPane.showMessageDialog(frame, """
                        YOU SEE A BLOODY FACE LOOKING BACK AT YOU!
                                    IT TAKES YOUR SOUL.
                                    YOU STORED ZERO ITEMS.
                                        GAME OVER!!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            MirrorFace);
                
            }
            if (BathRChoice2.equals("Inspect the shower")) {
                JOptionPane.showMessageDialog(frame, """
            THE ROOM SUDDENLY STARTS TO STEAM UP, AND YOU FEEL SOMEONE'S FINGERS
                                TOUCH THE BACK OF YOUR NECK!
                                                """,
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            ScaryShower);
                JOptionPane.showMessageDialog(frame, """
                                YOU RUN HOME BACK TO MAMA!!
                                    YOU STORED ZERO ITEMS.
                                        GAME OVER!!!!""","Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                          Running);
                
            }
            if (BathRChoice2.equals("Open door to the front bedroom")) {
                JOptionPane.showMessageDialog(frame,
                        "You are now in the front bedroom.",
                        "Haunted House",
                                   JOptionPane.INFORMATION_MESSAGE,
                                          Bed1);
                String FrontBRChoice2 = (String) JOptionPane.showInputDialog(
                        frame, """
                You have three options in this room. You can:   
Inspect the rocking chair, Look through the window, or Open door to the hallway""",
                        "WOULD YOU LIKE TO SELL ME YOUR SOUL?",
                        JOptionPane.PLAIN_MESSAGE, Alert, 
                        secondBR1Choice, 
                        "Inspect the rocking chair");

                if (FrontBRChoice2.equals("Inspect the rocking chair")) {
                    JOptionPane.showMessageDialog(frame,
                 "The chair starts rocking backing and forth by itself!"
                    ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                            Chair);
                    JOptionPane.showMessageDialog(frame, """
                                You quickly run out the house scared!! 
                                    You stored no items!
                                          GAME OVER!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Running);
                   
                }
                if (FrontBRChoice2.equals("Look through the window")) {
                    JOptionPane.showMessageDialog(frame, """
                    You see a child on a swingset just swinging back and forth!! 
                                Then he suddenly disappears!
                                            """
                    ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                            SwingSet);
                    JOptionPane.showMessageDialog(frame, """
                                You high tail it out of the house in FEAR!! 
                                    You stored no items!
                                          GAME OVER!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Running);
                    
                }
                if (FrontBRChoice2.equals("Open door to the hallway")) {
                    JOptionPane.showMessageDialog(frame,
                            "Welcome back to the hallway.",
                            "Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                          Hall);
                    String HwChoice2 = (String) JOptionPane.showInputDialog(
                            frame, """
                    You've almost reached the end of the tour....HAHA....
                                HOW DO YOU FEEL? You can choose to:   
Continue exploring by going down the hallway and opening up the door to the Master bedroom, or Go home.""",
                            "THEY SAY YOU SHOULD FEAR EVIL!!",
                            JOptionPane.PLAIN_MESSAGE, Alert, 
                            hallwayChoice2, 
         "Go back down the hall and open Master bedroom door");

                    if (HwChoice2.equals("Go back down the hall and "
                            + "open Master bedroom door")) {
                        JOptionPane.showMessageDialog(frame,
                              "You have now entered the Master bedroom.",
                              "Haunted House",
                                     JOptionPane.INFORMATION_MESSAGE,
                                          MasterBed);
                        String MBedChoice = (String) JOptionPane.showInputDialog(
                                frame, """
                            You have two options in this room. You can:   
                          Open jewelry box, Open door to Master bathroom""",
                                "YOU WON'T LIKE ME WHEN I'M MAD!!!",
                                JOptionPane.PLAIN_MESSAGE, Alert,
                                masterBRchoice,
                                "Open jewelry box");
                        
                        if (MBedChoice.equals("Open jewelry box")) {
                            JOptionPane.showMessageDialog(frame, 
                                    """
                                YOU FOUND THE CURSED HOPE DIAMOND!!""",
                                    "Haunted House",
                                     JOptionPane.INFORMATION_MESSAGE,
                                            Cursed);
                            JOptionPane.showMessageDialog(frame,
                                    """
         SUDDENLY YOU BEGIN TO SEE DEMONS COMING TO CARRY YOU TO THE AFTERLIFE!!
                                YOU STORED ZERO ITEMS.
                                    GAME OVER!!!!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    Demon);
                            
                        }
                        if (MBedChoice.equals("Open door to Master "
                                + "bathroom")) {
                            JOptionPane.showMessageDialog(frame,
                                    "You have now entered the Master "
                                            + "bathroom."
                            ,"Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                            MasterBath);
                            String MBathChoice = (String) JOptionPane.showInputDialog(
                                    frame, """
                            You have two options in this room. You can:   
                                Investigate lamp, Check the shower""", 
                                    "HAVE YOU EVER SEEN A DEAD BODY?",
                                  JOptionPane.PLAIN_MESSAGE, Alert,
                                  masterBathChoice, 
                                  "Investigate lamp");

                            if (MBathChoice.equals("Investigate lamp")) {
                                JOptionPane.showMessageDialog(frame,
                                        """
                                                         YOU RUB THE LAMP AND A
                                                         GENIE POPS OUT WHO SAYS
                                                         HE WILL GRANT YOU THREE
                                                         WISHES."""
                                ,"Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                            Genie);
                                String YesNoChoice = (String) JOptionPane.showInputDialog(
                                        frame, """
                             Would you like to store the lamp in your backpack?   
                                                                             """,
                                        "HOW DARE YOU FIND THAT!!!",
                                        JOptionPane.PLAIN_MESSAGE,
                                        Lamp, YesNoOption,
                                        "Yes");
                                if (YesNoChoice.equals("Yes")) {
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                           CONGRADULATIONS! YOU'VE FOUND A RARE
                                           GENIE LAMP AND CHOSE TO STORE IT. """);
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                                         YOU WENT HOME WITH A
                                                         MYSTICAL TREASURE.
                                                         LAMP STORED.
                                                         YOU WIN!!!!!""");
                                    
                                }
                                if (YesNoChoice.equals("No")) {
                                    JOptionPane.showMessageDialog(
                                            frame,
                                            "Ok, instead you chose to "
                                                    + "check the shower.");
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                           YOU SUDDENLY HEAR SINGING IN THE 
                                           SHOWER, BUT NO ONE IS THERE.""",
                                            "Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    EmptyShower);
                                    JOptionPane.showMessageDialog(
                                            frame, """
                                           YOU DECIDE THAT THIS LIFESTYLE IS NOT 
                                           FOR YOU, SO YOU RUN BACK HOME.
                                                   YOU STORED NOTHING.
                                                        GAME OVER!!!""",
                                            "Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                          Running);
                                   
                                }
                            }
                            if (MBathChoice.equals("Check the shower")) {
                                JOptionPane.showMessageDialog(frame,
                                        """
                                           YOU SUDDENLY HEAR SINGING IN THE 
                                           SHOWER, BUT NO ONE IS THERE."""
                                ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    EmptyShower);
                                JOptionPane.showMessageDialog(frame,
                                        """
                                           YOU DECIDE THAT THIS LIFESTYLE IS NOT 
                                           FOR YOU, SO YOU RUN BACK HOME.
                                                   YOU STORED NOTHING.
                                                        GAME OVER!!!""",
                                        "Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                          Running);
                                
                            }
                        }
                    } else if (HwChoice2.equals("Go home")) {
                        JOptionPane.showMessageDialog(frame, 
                                """
                                           BWAHAHAHA.....YOU RAN HOME IN FEAR.
                                           COWARD!!!""","Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                          Running);
                        JOptionPane.showMessageDialog(frame, 
                                """
                                           YOU STORED NOTHING. 
                                           GAME OVER!!!""");
                        

                    }
                }
            }
        }

    }

    public void MasterBed() {
        String MBedChoice = (String) JOptionPane.showInputDialog(
                frame, """
            You have two options in this room. You can:   
          Open jewelry box, Open door to Master bathroom""",
                "YOU WON'T LIKE ME WHEN I'M MAD!!!",
                JOptionPane.PLAIN_MESSAGE, Alert,
                masterBRchoice, "Open jewelry box");
        
        if (MBedChoice.equals("Open jewelry box")) {
            JOptionPane.showMessageDialog(frame, """
                        YOU FOUND THE CURSED HOPE DIAMOND!!"""
            ,"Haunted House",
                              JOptionPane.INFORMATION_MESSAGE,
                                            Cursed);
            JOptionPane.showMessageDialog(frame, """
    SUDDENLY YOU BEGIN TO SEE DEMONS COMING TO CARRY YOU TO THE AFTERLIFE!!
                            YOU STORED ZERO ITEMS.
                                GAME OVER!!!!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    Demon);
            
        }
        if (MBedChoice.equals("Open door to Master bathroom")) {
            JOptionPane.showMessageDialog(frame,
                    "You have now entered the Master bathroom.",
                    "Haunted House",
                                JOptionPane.INFORMATION_MESSAGE,
                                          MasterBath);
            String MBathChoice = (String) JOptionPane.showInputDialog(
                    frame, """
                        You have two options in this room. You can:   
                            Investigate lamp, Check the shower""", 
                    "HAVE YOU EVER SEEN A DEAD BODY?", 
                    JOptionPane.PLAIN_MESSAGE, Alert, 
                    masterBathChoice, 
                    "Investigate lamp");

            if (MBathChoice.equals("Investigate lamp")) {
                JOptionPane.showMessageDialog(frame, """
                                                         YOU RUB THE LAMP AND A
                                                         GENIE POPS OUT WHO SAYS
                                                         HE WILL GRANT YOU THREE
                                                         WISHES."""
                ,"Haunted House",
                                      JOptionPane.INFORMATION_MESSAGE,
                                            Genie);
                String YesNoChoice = (String) JOptionPane.showInputDialog(
                        frame, """
                        Would you like to store the lamp in your backpack?   
                                                                             """, 
                        "HOW DARE YOU FIND THAT!!!", 
                        JOptionPane.PLAIN_MESSAGE, Lamp, 
                        YesNoOption, "Yes");
                if (YesNoChoice.equals("Yes")) {
                    JOptionPane.showMessageDialog(frame, """
                                           CONGRADULATIONS! YOU'VE FOUND A RARE
                                           GENIE LAMP AND CHOSE TO STORE IT. """);
                    JOptionPane.showMessageDialog(frame, """
                                                         YOU WENT HOME WITH A
                                                         MYSTICAL TREASURE.
                                                         LAMP STORED.
                                                         YOU WIN!!!!!""");
                    
                }
                if (YesNoChoice.equals("No")) {
                    JOptionPane.showMessageDialog(frame,
                            "Ok, instead you chose to check the shower.");
                    JOptionPane.showMessageDialog(frame, """
                                           YOU SUDDENLY HEAR SINGING IN THE 
                                           SHOWER, BUT NO ONE IS THERE."""
                    ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    EmptyShower);
                    JOptionPane.showMessageDialog(frame, """
                                           YOU DECIDE THAT THIS LIFESTYLE IS NOT 
                                           FOR YOU, SO YOU RUN BACK HOME.
                                                   YOU STORED NOTHING.
                                                        GAME OVER!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Running);
                    
                }
            }
            if (MBathChoice.equals("Check the shower")) {
                JOptionPane.showMessageDialog(frame, """
                                           YOU SUDDENLY HEAR SINGING IN THE 
                                           SHOWER, BUT NO ONE IS THERE."""
                ,"Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    EmptyShower);
                JOptionPane.showMessageDialog(frame, """
                                           YOU DECIDE THAT THIS LIFESTYLE IS NOT 
                                           FOR YOU, SO YOU RUN BACK HOME.
                                                   YOU STORED NOTHING.
                                                        GAME OVER!!!""",
                            "Haunted House",
                            JOptionPane.INFORMATION_MESSAGE, 
                            Running);
                
            }
        }
    }
}
