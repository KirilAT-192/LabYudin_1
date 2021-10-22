package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Base Lvl
        Random r = new Random();
        Products products = new Products();
        int n = r.nextInt(5)+1;
        products.fillRandom(n);
        System.out.println(products);
        products.MaxNumber();

        /////////////////////////////////////

        //Medium Lvl
        Workers workers = new Workers();
        n = r.nextInt(5)+1;
        workers.fillRandom(n);
        System.out.println(workers);
        System.out.println("\n\n\nРаботники со стажем работы больше 10 лет:\n" + workers.Term_MoreThan_10Years());
    }
}
