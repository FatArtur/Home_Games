package Tasks.Module_1_5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Module_1_5_2 {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        new Thread(()-> {while (fizzBuzz.n < fizzBuzz.max) fizzBuzz.buzz();}).start();
        new Thread(()-> {while (fizzBuzz.n < fizzBuzz.max) fizzBuzz.fizz();}).start();
        new Thread(()-> {while (fizzBuzz.n < fizzBuzz.max) fizzBuzz.fizzbuzz();}).start();
        new Thread(()-> {while (fizzBuzz.n < fizzBuzz.max) fizzBuzz.number();}).start();
    }
}
class FizzBuzz{
    public int n;
    public int max;
    private ReentrantLock locker;
    private Condition condition;

    public FizzBuzz(int x){
        n = 1;
        max = x;
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }
    public void fizz(){
        locker.lock();
        try {
            while (!((n%3==0)&&(n%5!=0))){
                condition.await();
                if (n > max) Thread.currentThread().interrupt();
            }
            System.out.print("fizz, ");
            n++;
            condition.signalAll();

        } catch (InterruptedException e){

        } finally {
            locker.unlock();
        }
    }

    public void buzz(){
        locker.lock();
        try {
            while (!((n%3!=0)&&(n%5==0))){
                condition.await();
                if (n > max) Thread.currentThread().interrupt();
            }
            System.out.print("buzz, ");
            n++;
            condition.signalAll();

        } catch (InterruptedException e){

        } finally {
            locker.unlock();
        }
    }
    public void fizzbuzz(){
        locker.lock();
        try {
            while (!((n%3==0)&&(n%5==0))){
                condition.await();
                if (n > max) Thread.currentThread().interrupt();
            }
            System.out.print("fizzbuzz, ");
            n++;
            condition.signalAll();

        } catch (InterruptedException e){

        } finally {
            locker.unlock();
        }
    }
    public void number(){
        locker.lock();
        try {
            while (!((n%3!=0)&&(n%5!=0))){
                condition.await();
                if (n > max) Thread.currentThread().interrupt();
            }
            System.out.print(n + ", ");
            n++;
            condition.signalAll();

        } catch (InterruptedException e){

        } finally {
            locker.unlock();
        }
    }
}
