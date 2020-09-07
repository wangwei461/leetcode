package util;

public class TimerUtil {
    private long start;
    private long end;

    public TimerUtil() {
        this.start = System.currentTimeMillis();
    }

    public void end() {
        System.out.println(System.currentTimeMillis() - this.start);
    }
}
