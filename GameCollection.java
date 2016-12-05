import java.util.*;

/**
 * This class is storing all the records of a game collection.
 * It also implements binary search algorithm to find specific record.
 * 
 * @author Kamil Stepien
 * @version 20/04/15
 */
public class GameCollection
{
    //arraylist called gameCollection based on game class
    private ArrayList<Game> gameCollection = new ArrayList<Game>();

    /**
     * Constructor for objects of class GameCollection
     */
    public GameCollection()
    {
        setGameCollection();
    }
    
    /**
     * Set up the array with appropiroate format
     * Add records to the array
     */
    public void setGameCollection()
    {
        Game g1 = new Game("Little Big Planet", 34, 7, 2014, "");
        Game g2 = new Game("Grand Theft Auto 4", 23, 3, 2013, "");
        Game g3 = new Game("Last Of Us", 23, 18, 2011, "");
        Game g4 = new Game("Metal Gear Rising Revengeance", 76, 7, 2010, "");
        Game g5 = new Game("Don't Starve Console Edition", 5, 3, 2014, "");
        Game g6 = new Game("Grand Theft Auto 5", 34, 12, 2008, "");
        Game g7 = new Game("KickBeat", 23, 18, 2007, "");
        Game g8 = new Game("Tomb Raider Definitive Edition", 87, 15, 2006, "");
        Game g9 = new Game("NaissanceE", 34, 7, 2014, "");
        Game g10 = new Game("LocoCycle", 4, 3, 2013, "");
        Game g11 = new Game("Assassin's Creed IV Black Flag - Freedom Cry", 10, 18, 2011, "");
        Game g12 = new Game("Basement Crawl", 34, 3, 2009, "");
        Game g13 = new Game("Castlevania Lords of Shadow 2", 22, 12, 2008, "");
        Game g14 = new Game("Dead Nation Apocalypse Edition", 43, 3, 2005, "");
        Game g15 = new Game("South Park The Stick of Truth", 52, 12, 2004, "");
        Game g16 = new Game("Atelier Escha & Logy Alchemists of the Dusk Sky", 15, 18, 2001, "");
        Game g17 = new Game("Outlast", 5, 7, 2000, "");
        Game g18 = new Game("Fable Anniversary", 12, 3, 2012, "");
        Game g19 = new Game("Nidhogg", 21, 12, 2011, "");
        Game g20 = new Game("Uncharted 2 Among Thieves", 11, 18, 2010, "");
        Game g21 = new Game("Uncharted Drake's Fortune", 45, 15, 2009, "");
        Game g22 = new Game("Gran Turismo 6", 11, 3, 2008, "");
        Game g23 = new Game("Call of Duty Black Ops", 22, 12, 2007, "");
        Game g24 = new Game("Call of Duty Black Ops 2", 20, 18, 2006, "");
        Game g25 = new Game("Call of Duty World at War", 15, 15, 2005, "");
        Game g26 = new Game("Call of Duty Advanced Warfare", 41, 3, 2003, "");
        Game g27 = new Game("Call of Duty Ghosts", 23, 12, 2002, "");
        Game g28 = new Game("Uncharted 3 Drake's Deception", 18, 3, 2000, "");
        Game g29 = new Game("Fifa 15", 17, 7, 2004, "");
        Game g30 = new Game("Fifa 14", 2, 3, 2003, "");
        Game g31 = new Game("Fifa 10", 6, 18, 2001, "");
        Game g32 = new Game("Fifa 12", 19, 15, 2000, "");        
       
        gameCollection.add(g1);
        gameCollection.add(g2);
        gameCollection.add(g3);
        gameCollection.add(g4);
        gameCollection.add(g5);
        gameCollection.add(g6);
        gameCollection.add(g7);
        gameCollection.add(g8);
        gameCollection.add(g9);
        gameCollection.add(g10);
        gameCollection.add(g11);
        gameCollection.add(g12);
        gameCollection.add(g13);
        gameCollection.add(g14);
        gameCollection.add(g15);
        gameCollection.add(g16);
        gameCollection.add(g17);
        gameCollection.add(g18);
        gameCollection.add(g19);
        gameCollection.add(g20);
        gameCollection.add(g21);
        gameCollection.add(g22);
        gameCollection.add(g23);
        gameCollection.add(g24);
        gameCollection.add(g25);
        gameCollection.add(g26);
        gameCollection.add(g27);
        gameCollection.add(g28);
        gameCollection.add(g29);
        gameCollection.add(g30);
        gameCollection.add(g31);
        gameCollection.add(g32);
        
        //System.out.println("Before sorting");
        //sorting algorithm to the game collection in alphabetical order
        showAllData();
        Collections.sort(gameCollection, new Comparator<Game>()
        {
            @Override
            public int compare(Game g1, Game g2)
            {
                return g1.title.compareTo(g2.title);            
            }
        }
        );
        showAllData();
        //System.out.println("After sorting");
        //ArrayList.sort(gameCollection);
        //this collection must be in alfabetical order
    }
    
    /**
     * applying the binary algorithm
     * declaring lowes and highest points
     * and getting the middle value
     */
    public Game searchGame(String title)
    {
        if (gameCollection.size() == 0)
        {
            return null;
        }
        
        int low = 0;
        int high = gameCollection.size()-1;
        
        //big o notation start time
        long sTime = System.currentTimeMillis();
        
        while(low <= high)
        {
            int middle = (low + high) / 2;
            if (title.compareToIgnoreCase(gameCollection.get(middle).getTitle()) > 0)
            {
                low = middle + 1;
            }
            else if (title.compareToIgnoreCase(gameCollection.get(middle).getTitle()) <0)
            {
                high = middle - 1;
            }
            else
            {     
                //big o notation to check the performance of the program
                long fTime = System.currentTimeMillis();
                long time = fTime - sTime;
        
                System.out.println("time needed to run algorithm" + time);
                
                return gameCollection.get(middle);
            }
        }
        return null;
    }
    
    /**
     * apply testing the sorting algorithm
     */
    public void showAllData () {
        Iterator iterator = gameCollection.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            i++;
            Game g = (Game)iterator.next();
            
            //System.out.println(g.getTitle() + "--" + i);
        }
    }
}