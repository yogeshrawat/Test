# Test
package subsequence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

/**
 * Schedule a task that executes once every second.
 */

public class TestTimer {
    Toolkit toolkit;
    Timer timer;

    public TestTimer() {
	toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(),
	               0,        //initial delay
	               CLSConnect.getPollingDelay());  //subsequent rate
    }

    class RemindTask extends TimerTask {
	int numWarningBeeps = 3;
	Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    String currentTime = sdf.format(cal.getTime());
    
    String finishTime = CLSConnect.getFinishTime();


        public void run() {
        	Date current = null;
        	Date finish = null;
        	 try {
        		 current = (Date)sdf.parse(currentTime);
        		 finish = (Date)sdf.parse(finishTime);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    if ( current.before(finish)) {
	        toolkit.beep();
		System.out.format("Beep!%n");
		numWarningBeeps--;
	    } else {
	        //toolkit.beep(); 
                System.out.format("Time's up!%n");
	        timer.cancel(); //Not necessary because we call System.exit
	        //System.exit(0);   //Stops the AWT thread (and everything else)
	    }
        }
    }

    public static void main(String args[]) {
	System.out.format("About to schedule task.%n");
        new TestTimer();
	System.out.format("Task scheduled.%n");
    }
}
