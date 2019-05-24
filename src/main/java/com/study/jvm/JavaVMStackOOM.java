package com.study.jvm;

/**
 * Created by J.zhu on 2019/3/25.
 */
public class JavaVMStackOOM {

    private void dontStop(){
        while (true){

        }
    }

    public void stackByThread(){
        while (true){
            new Thread(this::dontStop).start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackByThread();
    }
}
