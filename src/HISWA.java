import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Rick on 5-10-2016.
 */
public class HISWA {

    private final int amountOfVsitors = 10;
    private final int amountOfBuyers = 3;
    private final int maxVisitors = 10;
    private final int maxBuyers = 1;

    private int buyerTurns;
    private int maxBuyerTurns = 4;

    private ArrayList<Buyer> buyers;
    private ArrayList<Visitor> visitors;
    private ArrayList<People> peopleInRoom;

    //locks
//    private Object lockBuyer = new Object();
//    private Object lockVisitor = new Object();
    private Lock lock;

    //conditions
    private Condition thing;

    public static void main(String[] args) {
        new HISWA().run();
    }

    private void run(){

        lock = new ReentrantLock();
        thing = lock.newCondition();

        buyerTurns = 0;
        //
        for (int i = 0; i < amountOfVsitors; i++){//create visitors
            Visitor newVisitor = new Visitor();
            visitors.add(newVisitor);
            //TODO newVisitor.doSomething();
        }
        for (int i = 0; i < amountOfBuyers; i++){//create buyers
            Buyer newBuyer = new Buyer();
            buyers.add(newBuyer);
            //TODO newBuyer.doSomething();
        }


    }


    public void getVisitorEntrance(){

    }

    public void visitorLeaving(){

    }

    public void getBuyerEntrance(){
        if (buyerTurns < maxBuyerTurns){

        }
    }

    public void buyerLeaving(){

    }


}
