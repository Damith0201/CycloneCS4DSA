/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author ng
 */
public  abstract  class List {
    
    
    protected Listable list[];
    protected int numItems;
    protected int currentPos;
    
    public List(int maxItems)
    {
        numItems = 0;
        list = new Listable[maxItems];
    }
    
    public boolean isFull()
    {
        return(list.length == numItems);
    }
    
    public int lengthIs()
    {
        return numItems;
    }
    
    public abstract boolean isThere(Listable item);
    
    public abstract Listable retrieve(Listable item);
    
    public abstract void insert(Listable item);
    
    public abstract void delete(Listable item);
    
    public void reset()
    {
        currentPos = 0;
        
    }
    
    public Listable getNextItem()
    {
        Listable next = list[currentPos];
        
        if(currentPos==numItems-1)
        {
            currentPos =0;
        }
        else
        {
            currentPos++;
        }
        return next.copy();
    }
       @Override
    public void insert(Listable item) 
    {
        int location =0;
        boolean moreToSearch = (location<numItems);
        
        while(moreToSearch)
        {
            if(item.compareTo(list[location])<0)
            {
                moreToSearch = false;
            }
            else
            {
                location++;
                moreToSearch = (location<=numItems);
            }
        }
        System.out.println("Sortd List!"+item.toString());
        for(int index=numItems;index>location;index--)
        {
            list[index]=list[index-1];
        }
        
        list[location] = item.copy();
        numItems++;
        
        
    }

    @Override
    public void delete(Listable item) 
    {
        int location =0;
        
        while(item.compareTo(list[location])!=0)
        {
            location++;
        }
        
        for(int index=location+1;index<numItems;index++)
        {
            list[index-1] = list[index];
        }
        
        numItems--;
    }
    
}
