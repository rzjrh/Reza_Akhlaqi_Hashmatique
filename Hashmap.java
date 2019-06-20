//Author: Reza Akhlaqi        6-19-2019
/*in this program I try to practice the HashMap method and following objects:
    create my first HashMap
    Iterate over a HashMap
  */  
package hashmatique.map;


//these two library needed for running this program
import java.util.HashMap;
import java.util.Set;

public class Hashmap {

    public static void main(String[] args) {
        
        HashMap <String, String> TrackList = new HashMap<> ();
        
        
        TrackList.put("Ain't it Funny" , 
                "\n It seemed to be like the perfect thing for you and me"+ 
                "\n It's so ironic you're what I had pictured you to be \n");
        
        TrackList.put("On The Floor" , "\n If you go hard, you gotta get on the floor" +
                "\n If you're a party freak then step on the floor \n");
        
        TrackList.put("Waiting for tonight" , "\n Like a movie scene"+ 
                "\n In the sweetest dreams"+ 
                "\n I have pictured us together \n");

        TrackList.put("Love Don't Cost A Thing", "\n You think you gotta keep me iced (You don't)" +
                 "\n You think I'm gonna spend your cash (I won't)" +
                 "\n Even if you were broke" +
                 "\n My love don't cost a thing \n");


        String TrackName = TrackList.get("Ain't it Funny");
        System.out.println("The Best Lyric of JLO is:" + TrackName);
        
        
        System.out.println("Here is list of all song's title and lyrics:\n");
        
        
        Set < String > list = TrackList.keySet();
        list.forEach((key) -> {                 //for (String key: list) {  (coding dojo's way)
            System.out.println(key + ": " + TrackList.get(key));
        });
    }
}
        
    
    


    
    

