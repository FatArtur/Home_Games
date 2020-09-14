package Tasks.Module_1_5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Module_1_5_1 {
    public static void main(String[] args) {
        FooS fooS = new FooS();

        new Thread(()-> fooS.second()).start();
        new Thread(()-> fooS.first()).start();
        new Thread(()-> fooS.third()).start();

    }
}

class FooS{
    private int num = 0;
    ReentrantLock locker;
    Condition condition;

    FooS(){
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }
    public void first(){
        locker.lock();
        try {
            while (!(num == 0))
                condition.await();
            System.out.print("first");
            num++;
            condition.signalAll();
        } catch (InterruptedException e){
            System.out.println(e);
        } finally {
            locker.unlock();
        }
    }
    public void second(){
        locker.lock();
        try {
            while (!(num == 1))
                condition.await();
            System.out.print("second");
            num++;
            condition.signalAll();
        } catch (InterruptedException e){
            System.out.println(e);
        } finally {
            locker.unlock();
        }
    }
    public void third(){
        locker.lock();
        try {
            while (!(num == 2))
                condition.await();
            System.out.print("third");
            num = 0;
            condition.signalAll();
        } catch (InterruptedException e){
            System.out.println(e);
        } finally {
            locker.unlock();
        }
    }
}
