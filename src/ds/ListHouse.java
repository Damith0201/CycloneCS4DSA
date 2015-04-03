/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author aj
 */
public class ListHouse implements Listable {
    
      // House Information
    private int lotNumber;
    private int squareFeet;
    private int bedRooms;
    private int price;
    
    private String lastName;
    private String firstName;

    public ListHouse(int lotNumber, int squareFeet, int bedRooms, int price, String lastName, String firstName) {
        this.lotNumber = lotNumber;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
        this.price = price;
        this.lastName = lastName;
        this.firstName = firstName;
    }
   
    
     @Override // Return a copy of listHouse
    public Listable copy() 
    {
        ListHouse house = new ListHouse(lotNumber,squareFeet,bedRooms,price,lastName,firstName);
        return house;
    }
     
      @Override // House Compare
    public int compareTo(Listable otherList) 
    {
        ListHouse other = (ListHouse) otherList;
        return(this.lotNumber-other.lotNumber);
      //  return other.lotNumber;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public int getPrice() {
        return price;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    
}
