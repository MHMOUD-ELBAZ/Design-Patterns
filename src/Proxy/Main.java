package Proxy;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args)  {
        DataRepoProxy dataRepoProxy = new DataRepoProxy();

        System.out.println(dataRepoProxy.getCitizenData("1234567890"));

        System.out.println(dataRepoProxy.getCitizenData("1234567890"));

        try{
            TimeUnit.MINUTES.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(dataRepoProxy.getCitizenData("1234567890"));
    }
}
