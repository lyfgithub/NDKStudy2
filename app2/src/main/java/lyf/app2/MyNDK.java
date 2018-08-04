package lyf.app2;

/**
 * Author LYF
 * Created by Administrator on 2016/9/24.
 */
public class MyNDK {
    public static native int Add();

    static {
        System.loadLibrary("myso");
    }

}
