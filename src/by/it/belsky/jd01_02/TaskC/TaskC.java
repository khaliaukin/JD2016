package by.it.belsky.jd01_02.TaskC;

/**
 * Created by misha on 27.04.2016.
 */
public class TaskC {
    public static void main(String[] args) {

        if (args.length > 0)
            System.out.println(args[0]);
        else {
            TaskC obj = new TaskC();
            obj.main();
        }
    }
            public static void main(){
            System.out.println("it's usual main method without String[] args!");

    }
}
