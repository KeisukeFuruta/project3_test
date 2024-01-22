public class Goods {
    //field
    public int code;
    public String name;
    public int costPrice;
    public int sellingPrice;

    //コンストラクション
    public Goods(int code, String name, int costPrice, int sellingPrice) {
        this.code = code;
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    //getter
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
