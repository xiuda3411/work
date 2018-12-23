
public class MyDate {

    long totalMilliSeconds = System.currentTimeMillis();

    long totalSeconds = totalMilliSeconds / 1000;

    //求出现在的秒
    long currentSecond = totalSeconds % 60;

    //求出现在的分
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;

    //求出现在的小时
    long totalHour = (totalMinutes / 60) + 8;
    long currentHour = totalHour % 24;

     MyDate(String timeZone){

         switch (timeZone){

             case "Beijing": {
                     currentHour = currentHour + 8;
                 System.out.println("北京时间" + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT+8");
                 break;
                 }

             case "Greenwich":{
                 System.out.println("格林威治时间" + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
                 break;
             }
             default: {
                 System.out.println("暂无此时区");
             }
         }

     }


    public static void main(String[] args) {

        MyDate myDate = new MyDate("Greenwich");



    }
}