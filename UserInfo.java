/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hauntedhouse;

/**
 *
 * @author Rahshann
 */
public class UserInfo {
    private String typedText = null;
    private String backpack = null;
    
    
    
    public void setUserInfo(String name){
        typedText = name;
    }
    
    public String getUserInfo() {
        return typedText;
    }
    
    public void setUserItem(String item){
        backpack = item;
    }
    
    public String getUserItem(){
        return backpack;
    }
}
