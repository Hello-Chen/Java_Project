/*百鸡问题
* 分析: 1.要满足问题条件需用三重嵌套for循环来做遍历判断
*      2.要满足三种种类的鸡都有则：for循环初始值为1且所有鸡总数不得超过100
*      3.要满足总金额等于100
*      4.小鸡必需为整数
* 变量: 母鸡:hen, 公鸡:cock, 小鸡:chick
*/
package Exercise_while.work;

public class Hundred_chicken {
    public static void main(String[] args) {
        for (int hen = 1; hen <= 100; hen++) {
            for (int cock = 1; cock <= 100; cock++) {
                for (int chick = 1; chick <= 100; chick++) {
                    if ((5 * hen + 3 * cock + chick / 3 == 100) && (hen + cock + chick == 100)
                           && (chick % 3 == 0)) {
                        System.out.println(" hen:" + hen + " cock:"
                                + cock+ " chick:" + chick);
                    }
                }
            }
        }
    }
}
