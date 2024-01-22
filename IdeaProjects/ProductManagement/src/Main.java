import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Goodsクラスに格納するリストに商品を追加
        List<Goods> goodsList = List.of(new Goods(80009001, "カヌレ", 100, 150),
                new Goods(80009002, "ディアマンクッキー", 200, 300),
                new Goods(80009003, "クッキー缶", 2000, 3000));


        //数値をキーボードから入力
        Scanner sc = new Scanner(System.in);
        System.out.println("商品コードを入力してください。＞");
        int inputCode = sc.nextInt();

        for (Goods goods : goodsList) {
            if (inputCode == goods.getCode()) {
                System.out.printf("商品名は「%s」%n", goods.getName());
                System.out.println("数量を入力してください。＞");

                int inputNum = sc.nextInt();
                int sellingPrice = goods.getSellingPrice() * inputNum;
                int costPrice = goods.getCostPrice() * inputNum;
                System.out.println(inputNum + "個売れたら" + String.format("%,d", sellingPrice) + "円(税抜)の売り上げ");
                System.out.println("利益は" + String.format("%,d", costPrice) + "円(税抜)");
            }
        }



        /*if (inputcode == goodsList.get(i).getCode()) {
            System.out.println("商品名は「" + goodsList.get(i).getName() + "」");
            System.out.println("数量を入力してください。＞");
            int inputnum = sc.nextInt();
            //入力した個数分売上と利益を計算するコード
            for (int i1 = 0; i1 <= inputnum; i1++) {
                int i2 = goodsList.get(i).getSellingprice() * i1;
                int i3 = goodsList.get(i).getCostprice() * i1;
                sum2 = i2 - i3;
                sum1 = i2;
            }
            System.out.println(inputnum + "個売れたら" + String.format("%,d", sum1) + "円(税抜)の売り上げ");
            System.out.println("利益は" + String.format("%,d", sum2) + "円(税抜)");

        } else if (inputcode == goodsList.get(i++).getCode()) {
            System.out.println("商品名は「" + goodsList.get(i).getName() + "」");
            System.out.println("数量を入力してください。＞");
            int inputnum = sc.nextInt();
            //入力した個数分売上と利益を計算するコード
            for (int i1 = 0; i1 <= inputnum; i1++) {
                int i2 = goodsList.get(i).getSellingprice() * i1;
                int i3 = goodsList.get(i).getCostprice() * i1;
                sum2 = i2 - i3;
                sum1 = i2;
            }
            System.out.println(inputnum + "個売れたら" + String.format("%,d", sum1) + "円(税抜)の売り上げ");
            System.out.println("利益は" + String.format("%,d", sum2) + "円(税抜)");

        } else if (inputcode == goodsList.get(i = +2).getCode()) {
            System.out.println("商品名は「" + goodsList.get(i).getName() + "」");
            System.out.println("数量を入力してください。＞");
            int inputnum = sc.nextInt();
            //入力した個数分売上と利益を計算するコード
            for (int i1 = 0; i1 <= inputnum; i1++) {
                int i2 = goodsList.get(i).getSellingprice() * i1;
                int i3 = goodsList.get(i).getCostprice() * i1;
                sum2 = i2 - i3;
                sum1 = i2;
            }
            System.out.println(inputnum + "個売れたら" + String.format("%,d", sum1) + "円(税抜)の売り上げ");
            System.out.println("利益は" + String.format("%,d", sum2) + "円(税抜)");

        } else {
            System.out.println("商品コードが正しくありません。");
        }*/
    }
}
