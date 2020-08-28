package Tasks;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class Foo{
    public void first(){
        System.out.print("first");
    }
    public void second(){
        System.out.print("second");
    }
    public void third(){
        System.out.print("third");
    }
}

class FooCount{
    public static AtomicInteger count = new AtomicInteger(0);
}
class ThreadFoo_1 implements Runnable{
    Semaphore sem;
    Foo foo;
    Thread thread;

    ThreadFoo_1(Semaphore s, Foo foo, String name){
        sem = s;
        this.foo = foo;
        thread = new Thread(this);
        thread.setName(name);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (!((FooCount.count.get()) == 1)){Thread.sleep(10);}
            sem.acquire();
            foo.second();
            FooCount.count.incrementAndGet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } sem.release();
    }
}
class ThreadFoo_2 implements Runnable{
    Semaphore sem;
    Foo foo;
    Thread thread;

    ThreadFoo_2(Semaphore s, Foo foo, String name){
        sem = s;
        this.foo = foo;
        thread = new Thread(this);
        thread.setName(name);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (!((FooCount.count.get()) == 0)){Thread.sleep(10);}
            sem.acquire();
            foo.first();
            FooCount.count.incrementAndGet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } sem.release();
    }
}
class ThreadFoo_3 implements Runnable{
    static Semaphore sem;
    Foo foo;
    Thread thread;

    ThreadFoo_3(Semaphore s, Foo foo, String name){
        sem = s;
        this.foo = foo;
        thread = new Thread(this);
        thread.setName(name);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (!((FooCount.count.get()) == 2)){Thread.sleep(10);}
            sem.acquire();
            foo.third();
            FooCount.count.incrementAndGet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } sem.release();
    }
}


public class Module_1_5 {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Semaphore semaphore = new Semaphore(1);

        new ThreadFoo_1(semaphore,foo, "B");
        new ThreadFoo_2(semaphore,foo, "A");
        new ThreadFoo_3(semaphore,foo, "C");
    }
}

