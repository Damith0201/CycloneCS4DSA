
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

 
    
}
