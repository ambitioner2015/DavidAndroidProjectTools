package davidandroidprojecttools.qq986945193.com.davidandroidprojecttools.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @交流Qq ：986945193
 * @GitHub: https://github.com/QQ986945193
 */

/**
 * 生成一个随机四位数以及包括字母的四位数
 */
public class GetRandomFourNumUtils {


    /**
     * 生成一个四位数，包括字母
     * @return
     */
    public static String getRandomFourNumString() {
        String[] beforeShuffle = new String[] { "2", "3", "4", "5", "6", "7",
                "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z" };
        List list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        String result = afterShuffle.substring(5, 9);
        return result;
    }
    /**
     * 生成一个四位数，
     * @return
     */
    public static String getRandomFourNum() {
        int num = (int) (Math.random()*9000+1000);
        return num+"";
    }
}
