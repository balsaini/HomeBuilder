import com.bal.Floor;
import com.bal.House;
import com.bal.Paint;
import com.bal.Room;

/**
 * Created by localadmin on 7/27/16.
 */
public class Main {
    public static void main(String[] args) {
        Room r1 = new Room("b1", Floor.BAMBOO, 12, 15, 9, Paint.Glossy);
        Room r2 = new Room("b2", Floor.BAMBOO, 10, 8, 9, Paint.Glossy);
        Room r3 = new Room("b3", Floor.BAMBOO, 9, 7, 9, Paint.Glossy);
        Room r4 = new Room("kitchen", Floor.BAMBOO, 12, 11, 9, Paint.Glossy);
        Room r5 = new Room("bathroom", Floor.TILE, 6, 7, 8, Paint.Matte);
        House h = new House("big");
        System.out.println("rooms should be 0 " + h.getRooms().size());
        h.addRoom(r1);
        h.addRoom(r2);
        h.addRoom(r3);
        h.addRoom(r4);
        h.addRoom(r5);
        System.out.println("rooms should be 5 " + h.getRooms().size());
        h.addRoom(r5);
        System.out.println("rooms should still be 5 " + h.getRooms().size());
        System.out.println("paint cost " + h.paintCost());
        System.out.println("floor cost " + h.floorCost());
        System.out.println("total cost " + h.totalCost());
    }
}
