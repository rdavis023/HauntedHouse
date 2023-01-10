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
public class Floor1Rooms {
    Object[] objectOptions = {"Open", "Move forward"};
    Object[] objectOptions2 = {"Investigate Mirror", "Investigate Shower"};
    Object[] kitchenOptions = {"Look in refrigerator", "Look in cabinet", 
            "Open door to new room"};
    Object[] StoringItems = {"Yes", "No"};
    Object[] kitchenOptions2 = {"Look in cabinet", 
            "Open door to new room"};
    Object[] pantryOptions = {"Open dusty recipe box", "Inspect broom"};
    Component frame = null;
     
    ImageIcon Door = new ImageIcon("Creepy Door.jpeg");
    ImageIcon DoorChest = new ImageIcon("DoorChest.jpeg");
    ImageIcon Ghost = new ImageIcon("Ghost.jpeg");
    ImageIcon Bathroom = new ImageIcon("bathroom.jpeg");
    ImageIcon Alert = new ImageIcon("alert.jpeg");
    ImageIcon MirrorFace = new ImageIcon("MirrorFace.jpeg");
    ImageIcon ScaryShower = new ImageIcon("ScaryShower.jpeg");
    ImageIcon Running = new ImageIcon("Running away.jpeg .jpg");
    ImageIcon Refrigerator = new ImageIcon("Refrigerator.jpeg");
    ImageIcon SoulFood = new ImageIcon("SoulFood.jpeg");
    ImageIcon Dishes = new ImageIcon("Dishes.jpeg");
    ImageIcon Pantry = new ImageIcon("Pantry.jpeg");
    ImageIcon Recipe = new ImageIcon("Devilrecipe.jpeg");
    ImageIcon Broom = new ImageIcon("broom.jpeg");
    ImageIcon Box = new ImageIcon("Recipe box.jpeg");
    
    
    
    
    
    
    public void LRtoBRSelect(){
        String objectChoice = (String) JOptionPane.showInputDialog(
                frame, """
                                There is a chest in here.
                Would you like to open it or move forward through the door?""",
                "Fear is all around you!",
                JOptionPane.INFORMATION_MESSAGE,
                DoorChest, objectOptions, "Open");
        if (objectChoice.equals("Open")) {
                JOptionPane.showMessageDialog(frame, """
                                OH NO!
                A GHOST HAS ESCAPED AND SCARED YOU TO DEATH!
                              GAME OVER!!!!""","Haunted House",
                              JOptionPane.INFORMATION_MESSAGE,Ghost);
            }

        if (objectChoice.equals("Move forward")) {
            JOptionPane.showMessageDialog(frame,
                    "You have entered the Bathroom.","Haunted House",
                    JOptionPane.INFORMATION_MESSAGE,Bathroom);
            String objectChoice2 = (String) JOptionPane.showInputDialog(
                    frame, """
                            There is a Mirror and a Shower.
            Would you like to Investigate the Mirror or the Shower?""",
                    "You say your aren't nervous, I DISAGREE!",
                    JOptionPane.PLAIN_MESSAGE, Alert,
                    objectOptions2,
                    "Investigate Mirror");

            if (objectChoice2.equals("Investigate Mirror")) {
                JOptionPane.showMessageDialog(frame, """
                        YOU SEE A BLOODY FACE LOOKING BACK AT YOU!
                                    IT TAKES YOUR SOUL.
                                    YOU STORED ZERO ITEMS.    
                                        GAME OVER!!!!""","Haunted House",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        MirrorFace);
                    
                }

            if (objectChoice2.equals("Investigate Shower")) {
                JOptionPane.showMessageDialog(frame, """
                THE ROOM SUDDENLY STARTS TO STEAM UP, AND YOU FEEL SOMEONE'S 
                            FINGERS TOUCH THE BACK OF YOUR NECK!""","Haunted House",
                            JOptionPane.INFORMATION_MESSAGE,
                            ScaryShower);
                JOptionPane.showMessageDialog(frame, """
                            YOU RUN HOME BACK TO MAMA!!
                                YOU STORED NO ITEMS.                          
                                    GAME OVER!!!!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    Running);
                    
                }
         
     }
           
}
    
    
    
    public void KitchenToPantrySelect(){
        String kitchenChoice = (String) JOptionPane.showInputDialog(
                 frame, """
            There are two items in here, the refrigerator and the cabinet.
        Would you like to check one of them or move forward through the door?""",
                 "Who knows what will happen....",
                 JOptionPane.PLAIN_MESSAGE, Alert,
                 kitchenOptions,
                 "Look in refrigerator" );
                
        if(kitchenChoice.equals("Look in refrigerator")){
            String YesNo = (String) JOptionPane.showInputDialog(
                    frame, """
                There is some delicious soul food in here.
            Would you like to store it in your backpack?""",
                    "Yummy Food, I Bet it taste good!!",
                    JOptionPane.PLAIN_MESSAGE,Refrigerator,
                    StoringItems,"Yes");
                
            if(YesNo.equals("Yes")){
                JOptionPane.showMessageDialog(frame, """
                    You have store some delicious soul food!
                        Now you go home with a full belly!""","Haunted House",
                        JOptionPane.INFORMATION_MESSAGE,
                        SoulFood);
                JOptionPane.showMessageDialog(frame, """
                    You have survived the Haunted House leaving with soul food!
                                        You Win!""");
        }
            else if(YesNo.equals("No")){
                String kitchenChoice2 = (String) JOptionPane.showInputDialog(
                        frame, """
                        Item not stored.
        Would you like to check the cabinet or move forward through the door?""",
                        "Is someone behind you....",
                        JOptionPane.PLAIN_MESSAGE, Alert,
                        kitchenOptions2,
                        "Look in cabinet" );
                    
                if(kitchenChoice2.equals("Look in cabinet")){
                    JOptionPane.showMessageDialog(frame, """
    OH NO! THE DISHES START FLYING EVERYWHERE, YOU GET HIT IN THE HEAD AND 
                        SLOWLY START MOVING TOWARD THE LIGHT!!
                                    YOU STORED NOTHING.
                                        GAME OVER! 
                                        YOU DIED!""","Haunted House",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        Dishes);
                                
                }
                if(kitchenChoice2.equals("Open door to new room")){
                    String pantryChoice = (String) JOptionPane.showInputDialog(
                            frame, """
                            You have entered the pantry.
                Two items are in here, a dusty recipe box and a broom.
                            What would you like to do?""",
                            "Be careful where you step....",
                            JOptionPane.PLAIN_MESSAGE, Pantry,
                            pantryOptions,
                            "Open dusty recipe box" );
                    if(pantryChoice.equals("Open dusty recipe box")){
                        String YesNoChoice2 = (String) JOptionPane.showInputDialog(
                                frame, """
                You open it up and a recipe for chocolate devils food cake 
                                 appears out of no where.
                            Would you like to store the recipe?""",
                            "HMMM Chocolate devils sound good....", 
                            JOptionPane.PLAIN_MESSAGE, Box,
                            StoringItems,"Yes" );
                        if(YesNoChoice2.equals("Yes")){
                            JOptionPane.showMessageDialog(frame,
                                    """
                                You have stored the recipe.
                        You go home happy to bake some chocolate devils. 
                                Game over. You survived!""","Haunted House",
                                JOptionPane.INFORMATION_MESSAGE,
                                Recipe);
                    }
                        if(YesNoChoice2.equals("No")){
                            JOptionPane.showMessageDialog(frame,
                                    """
                                YOU DECIDED TO INSPECT THE BROOM.
                        IT FLIES UP IN THE AIR THE MOMENT YOU TOUCH IT.
                                YOU RUNAWAY QUICKLY OUT THE HOUSE!
                                    YOU STORED NOTHING.             
                                        GAME OVER!""","Haunted House",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        Broom);
                                         
                    }
                } 
                            
                    else if (pantryChoice.equals("Inspect broom")){
                        JOptionPane.showMessageDialog(frame,
                                """
                        IT FLIES UP IN THE AIR THE MOMENT YOU TOUCH IT.
                                YOU RUNAWAY QUICKLY OUT THE HOUSE!
                                        YOU STORED NOTHING.             
                                            GAME OVER!""","Haunted House",
                                            JOptionPane.INFORMATION_MESSAGE,
                                            Broom);
                                    
                            
                            
                   }
                }
            }
        }
        if (kitchenChoice.equals("Look in cabinet")){
            JOptionPane.showMessageDialog(frame, """
        OH NO! THE DISHES START FLYING EVERYWHERE, YOU GET HIT IN THE HEAD AND 
                        SLOWLY START MOVING TOWARD THE LIGHT!!
                                YOU STORED NOTHING.
                                    GAME OVER. 
                                    YOU DIED!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    Dishes);
           
        }
        else if (kitchenChoice.equals("Open door to new room")){
            String pantryChoice = (String) JOptionPane.showInputDialog(
                    frame, """
                                You have entered the pantry.
                    Two items are in here, a dusty recipe box and a broom.
                                What would you like to do?""",
                    "Be careful where you step....",
                    JOptionPane.PLAIN_MESSAGE, Pantry,
                    pantryOptions,
                    "Open dusty recipe box" );
            if(pantryChoice.equals("Open dusty recipe box")){
                String YesNoChoice2 = (String) JOptionPane.showInputDialog(
                        frame, """
            You open it up and a recipe for chocolate devils food cake appears 
                               out of no where.
                    Would you like to store the recipe?""",
           "HMMM Chocolate devils sound good....",
           JOptionPane.PLAIN_MESSAGE, Box,
           StoringItems,"Yes" );
                
                if(YesNoChoice2.equals("Yes")){
                    JOptionPane.showMessageDialog(frame, """
                            You have stored the recipe.
                    You go home happy to bake some chocolate devils. 
                            Game over. You survived!""","Haunted House",
                            JOptionPane.INFORMATION_MESSAGE,
                            Recipe);
                                        
                }
                if(YesNoChoice2.equals("No")){
                    JOptionPane.showMessageDialog(frame, """
                            YOU DECIDED TO INSPECT THE BROOM.
                    IT FLIES UP IN THE AIR THE MOMENT YOU TOUCH IT.
                            YOU RUNAWAY QUICKLY OUT THE HOUSE!
                                    YOU STORED NOTHING.             
                                        GAME OVER!""","Haunted House",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        Broom);
                                         
                }
            }
            else if (pantryChoice.equals("Inspect broom")){
                JOptionPane.showMessageDialog(frame, """
                        YOU DECIDED TO INSPECT THE BROOM.
                IT FLIES UP IN THE AIR THE MOMENT YOU TOUCH IT.
                        YOU RUNAWAY QUICKLY OUT THE HOUSE!
                                YOU STORED NOTHING.             
                                    GAME OVER!""","Haunted House",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    Broom);
                                    
            }
     
        }
    }
}

