
import java.util.Comparator;
// Sorting elements into descending order.
public class Descend implements Sort_USing_Comparator {
public int compare(Integer i1, Integer i2)
{
// For reverse comparison. 
     return i2.compareTo(i1);	
  }
}