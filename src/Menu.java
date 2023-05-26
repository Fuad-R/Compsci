import java.util.ArrayList;

public class Menu {
    
    private ArrayList<dish>menuitems;

    Menu(ArrayList<dish>menuitems){
        this.menuitems = menuitems;
    }

    public void addmenuItem(dish item){
        menuitems.add(item);
    }

    public void removemenuItem(dish item){
        menuitems.remove(item);
    }

}
