
package ds;

/**
 *
 * @author bn
 */
public class SortedList extends List {
    
    
    public SortedList(int maxItems) 
    {
        super(maxItems);
    }

    public SortedList()
    {
       super(100);
    }

    @Override
    public boolean isThere(Listable item)
    {
        int compareResult;
        int midPoint;
        int first = 0;
        int last = numItems-1;
        boolean moreToSearch = (first<=last);
        boolean found = false;
        
          System.out.println("Before While : "+item.toString());
          
        while(moreToSearch && !found)
        {
            midPoint = (first+last)/2;
            compareResult = item.compareTo(list[midPoint]);
            
            if(compareResult==0)
            {
                found=true;
            }
            else if(compareResult<0)
            {
                last = midPoint-1;
                moreToSearch = (first<=last);
            }
            else
            {
                 first = midPoint+1;
                 moreToSearch = (first<=last);
            }
            
              System.out.println("Is THERE : "+found);
        }
        
         System.out.println("Is THERE : "+found);
         
        return found;
    }

    @Override
    public Listable retrieve(Listable item) 
    {
        int compareResult;       
        int first = 0;
        int last = numItems-1;
        int midPoint = first+last;
        boolean found = false;
        
        while(!found)
        {
           midPoint = (first+last)/2 ;
           compareResult = item.compareTo(list[midPoint]);
         
            if(compareResult==0)
            {
                found=true;
            }
            else if(compareResult<0)
            {
                last = midPoint-1;
               
            }
            else
            {
                 last = midPoint+1;
                 
            }
        }
        return list[midPoint].copy();
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
