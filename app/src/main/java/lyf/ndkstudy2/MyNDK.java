package lyf.ndkstudy2;

/**
 * 编写本地native方法
 * 并使用javah -jni 全类名(也就是包名+类名)生成头文件**.h
 */
public class MyNDK {
    public static native int add(int a,int b);
    static {
        //加载我们生成的so库文件，(实际上在生成**.h之前可以不用写，生成**.h之后在写上)
        System.loadLibrary("myso");
    }
}
