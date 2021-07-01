package com.huanghy.scaff;

import com.huanghy.scaff.domain.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO
 *
 * @author HuangHy
 * @date 2021/3/28 11:48 下午
 */

public class Jdk8Test {

    @Test
    public void test() throws InterruptedException {
        //2
//        Iterator<User> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            this.get(next);
////            next.setName("add");
//        }
//        System.out.println(list);
//        list.stream().forEach(s -> System.out.println(s.getName()));
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        testRunnable testRunnable = new testRunnable(list);
//
//        executorService.execute(testRunnable);
        Thread.sleep(1000);
    }


    class testRunnable implements Runnable {

        private List<User> list;

        testRunnable(List<User> list) {
            this.list = list;
        }


        @Override
        public void run() {


            Iterator<User> iterator = list.iterator();
            while (iterator.hasNext()) {
                User next = iterator.next();
                get(next);
            }

            list.stream().forEach(s -> System.out.println(s.getName()));




        }

        private  void get(User User) {
            User.setName("hahaha");
        }



    }




}
