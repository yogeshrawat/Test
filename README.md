package com.rbc.ClsConnect;

/**
 * Created by yorawat on 20/03/2017.
 */

import com.rbc.cmn.ClsLogger;
import com.rbc.cmn.ConfigReader;
import com.rbc.decrypt.Decryptor;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class PollingClientScheduler implements Runnable {

    private Date current, finish;



    ScheduledExecutorService executor;
    //private String url = "https://iosdownloadtest.cls-group.com/servlet/Participant/FX+SWP.txt?login.userid=rbcuser1&login.password=RBCpasswrd1";
    final DateFormat fmt = DateFormat.getTimeInstance(DateFormat.LONG);
    private CLSDownload clsDownload;
    private Map<Integer,String> clsFile  ;

    public Map<Integer, String> getClsFile() {
        return clsFile;
    }

    public void setExecutor(ScheduledExecutorService executor) {
        this.executor = executor;
    }
    public PollingClientScheduler(String pollingDelay, String finishTime, CLSDownload clsDownload) {
        Calendar cal = Calendar.getInstance();
        clsFile = null;
        this.clsDownload = clsDownload;
        ScheduledFuture<?> periodicFuture = null;
        System.out.println("in const");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(cal.getTime());

        try {
            current = (Date) sdf.parse(currentTime);
            finish = (Date) sdf.parse(finishTime);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.executor = Executors.newScheduledThreadPool(1);   //creating scheduler with 1 thread
        //configuring schedular for the fixed rate of polling delay
        this.executor.scheduleAtFixedRate(this, 2, Integer.valueOf(pollingDelay), TimeUnit.SECONDS); //needs to change Timeunit to seconds

    }

    @Override
    public void run() {
        System.out.println("\t periodicTask Execution Time: "
                + fmt.format(new Date()));
        if (current.before(finish)) {
            if ((clsFile = clsDownload.dlToMap()) != null) {
                System.out.println("scheduler terminated");
                this.executor.shutdown();
            }
        } else {
            ClsLogger.logger.warn("Finish Time reached ");
            this.executor.shutdown();

        }
        System.out.println("\t periodicTask End Time: "
                + fmt.format(new Date()));


    }




}



