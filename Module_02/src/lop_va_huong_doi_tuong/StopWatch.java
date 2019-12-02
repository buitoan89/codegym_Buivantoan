package lop_va_huong_doi_tuong;

import java.time.LocalTime;

public class StopWatch {
    //creat properti
    private long starTime;
    private long endTime;
    private long ElapsedTime;



    public double getStarTime() {
        return starTime;
    }

    public double getEndTime() {
        return endTime;
    }

    //contructor

    public void starTime() {

    }

    public void star() {
        this.starTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        ElapsedTime = this.endTime - this.starTime;
        return ElapsedTime;
    }

    public StopWatch() {
        this.starTime = System.currentTimeMillis();
    }

    public static void main(String[] args) {
       // int [] array = new int[1000];
       // long total = 0;
        StopWatch stopWatch = new StopWatch();
        int total = 0;
        for (int i=0;i<100000000;i++){
            total+=i;
        }
         stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());
    }

}
