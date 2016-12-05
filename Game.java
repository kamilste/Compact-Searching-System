/**
 * This class implements all the variables which will be used by GameCollection class.
 * It also stores all the setters and getters for each variable.
 * 
 * @author Kamil Stepien
 * @version 20/04/15
 */
public class Game
{
    //instance variables
    public String title;
    public int quantity;
    public int ageRating;
    public int releaseDate;
    public String pict; 
    
    /**
     * Constructor for objects of class Game.
     */
    public Game(String title, int quantity, int ageRating, int releaseDate, String pict)
    {
        //initialise instance variables
        this.title = title;
        this.quantity = quantity;
        this.ageRating = ageRating;
        this.releaseDate = releaseDate;
        this.pict = pict;
    }
    
    /**
     * Set title method
     * @param title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }
   
    /**
     * Set quantity method
     * @param quantity
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    /**
     * Set age rating method
     * @param ageRating
     */
    public void setAgeRating(int ageRating)
    {
        this.ageRating = ageRating;
    }
    
    /**
     * Set release date method
     * @param releaseDate
     */
    public void setReleaseDate(int releaseDate)
    {
        this.releaseDate = releaseDate;
    }
    
    /**
     * Set picture method
     * @param pict
     */
    public void setPict(String pict)
    {
        this.pict = pict;
    }

    /**
     * Get title method
     * @return title 
     */
    public String getTitle()
    {
        return title;
    }
  
    /**
     * Get quantity method
     * @return quantity 
     */
    public int getQuantity()
    {
        return quantity;
    }
    
    /**
     * Get age rating method
     * @return ageRating
     */
    public int getAgeRating()
    {
        return ageRating;
    }
    
    /**
     * Get release date method
     * @return releaseDate
     */
    public int getReleaseDate()
    {
        return releaseDate;
    }
    
    /**
     * Get picture method
     * @return pict 
     */
    public String getPict()
    {
        return pict;
    }
   
    /**
     * This is to string method used to get a String object representing the value of the Number Object.
     * @return title, quantity, ageRating, releaseDate, pict 
     */
    public String toString()
    {
        //return all the variables (contcatination)
        return "<html>Game Details:<br>"
        + "<br>Title:" + "&nbsp;"  + "&nbsp;"  + "&nbsp;"  + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;"  + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + title
        + "<br>Quantity:" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;"  + quantity
        + "<br>Age Rating:" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;"+ ageRating
        + "<br>Release Date:" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + "&nbsp;" + releaseDate
        + "<br>Picture:"+ pict;
    }
}