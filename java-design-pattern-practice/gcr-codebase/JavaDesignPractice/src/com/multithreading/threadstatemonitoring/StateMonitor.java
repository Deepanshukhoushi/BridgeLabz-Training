package com.multithreading.threadstatemonitoring;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

class StateMonitor extends Thread {

    private final Thread[] threads;
    private final Set<Thread.State>[] observedStates;

    @SuppressWarnings("unchecked")
    public StateMonitor(Thread... threads) {
        this.threads = threads;
        this.observedStates = new HashSet[threads.length];

        for (int i = 0; i < threads.length; i++) {
            observedStates[i] = new HashSet<>();
        }
    }

    @Override
    public void run() {
        boolean allTerminated;

        do {
            allTerminated = true;

            for (int i = 0; i < threads.length; i++) {
                Thread t = threads[i];
                Thread.State state = t.getState();
                observedStates[i].add(state);

                System.out.println("[Monitor] " + t.getName() +
                        " is in " + state +
                        " state at " + LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (!allTerminated);

        System.out.println("\n===== SUMMARY =====");
        for (int i = 0; i < threads.length; i++) {
            System.out.println(threads[i].getName() +
                    " went through " + observedStates[i].size() + " states");
        }
    }
}
