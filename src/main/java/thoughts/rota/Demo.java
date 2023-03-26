package thoughts.rota;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo {
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        Queue<String> b = new LinkedList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
    }
}
