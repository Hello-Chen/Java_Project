/*九九乘法表
* 分析: 一个for控制行，一个for控制列
* 变量: 列：int column, 行：int row
*/
package Exercise_while.work;

public class Multiplication_Ninety_nine_table {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + "*" + row + "=" + (row * column) + " ");
            }
            System.out.println();
        }
    }
}
