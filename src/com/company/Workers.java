package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Workers {
    private final List<Worker> workers;

    public Workers(){
        workers = new ArrayList<>();
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void add(Worker worker) {
        this.workers.add(worker);
    }

    public void remove(Worker worker) {
        this.workers.remove(worker);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            workers.add(Worker.generate());
        }
    }

    public Workers Term_MoreThan_10Years(){
        Workers term_ten = new Workers();
        for (Worker worker : this.workers){
            if (Duration.between(worker.getDate(), LocalDateTime.now()).toDays() > 3650) {
                term_ten.add(worker);
            }
        }
        return term_ten;
    }

    @Override
    public String toString() {
        return "\n\n\nРаботники" + workers + "; ";
    }
}
