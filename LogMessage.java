import java.util.List;
import java.util.ArrayList;
public class LogMessage{
    private String machineID;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message){
        /* to be implemented in part(a) */
        String description = message.substring(message.indexOf(":"));
        return description;
      
    }

    /** Returns true if the description in this log message properlyn contains keyword;
     *          false otherwise.
     */
    public boolean containsWord(String keyword){
        /* to be implemented in part(b) */
        if(description.indexOf(" "+ keyword+ " ")!==-1){
            return true;   
        }
        else if(description.indexOf(" "+keyword)=0){
         return true    
        }
        else return false;
    }
    public String getMachineID(){
        return description;
    }
    
   ** Removes from the system log all entries whose descriptions properly contain keyword,
   public List<LogMessage> removeMessages(String keyword)
and returns a list (possibly empty) containing the removed entries. Postcondition:
*
*
* - Entries in the returned list properly contain keyword and
* are in the order in which they appeared in the system log.
* - The remaining entries in the system log do not properly contain keyword and * are in their original order.
* - The returned list is empty if no messages properly contain keyword.
*/
      public List<LogMessage> removeMessages(String keyword){
        for(int i=0; i<LogMessage.size();i++){
        if(!LogMessage.get(i).containsWord(keyword)){
            LogMessage.remove(i);
            i--;
        }
        }
        return LogMessage;
    
    }
    
    
    
    
    
    //test
    public static void main(String[] args){
        
    }
}
