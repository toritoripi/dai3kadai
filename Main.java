import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Main {
    static void main(String[] args) throws Exception {

        //選手情報を登録する
        Map<String, String> playerMap = new HashMap<>();
        playerMap.put("赤木", "北村");
        playerMap.put("小暮", "北村");
        playerMap.put("桜木", "和光");

        //標準入力で選手名を受け取る
        System.out.println("選手名を入力してください。");
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();

        //エラーメッセージを表示する
        if (playerMap.get(player) == null) {
            throw new Exception(player + "は存在しません。");
        }

        //登録されている場合
        System.out.println("出身は" + playerMap.get(player) + "中学校です。");
    }
}
