package codes;

public class KnapsackGA {
  public static final int KNAP_MAX = 6;
  public static final int ITEM_NUM = 5;

  public static final int IND_NUM = 8;
  public static final double MUTATE_RATE = 0.1;	// 突然変異する確率（10％）

  public static char[] itemName = { 'A', 'B', 'C', 'D', 'E' };	// 品物の名称
  public static int[] itemWeight = { 1, 2, 3, 4, 5 };
  public static int[] itemValue = { 100, 300, 350, 500, 650 };	// 品物の価値

  public static int indGeneration;
  public static int[][] indGene = new int[IND_NUM][ITEM_NUM];	// 個体の遺伝子
  public static int[] indWeight = new int[IND_NUM];
  public static int[] indValue = new int[IND_NUM];
  public static int[] indFitness = new int[IND_NUM];

  // 個体をランダムに生成するメソッド
  public static void createIndividual() {
    int ind, item;	// ループカウンタ

    // 0か1をランダムに格納する
    for (ind = 0; ind < IND_NUM; ind++) {
      for (item = 0; item < ITEM_NUM; item++) {
        indGene[ind][item] = Math.random() > 0.5 ? 0 : 1;
      }
    }
  }

  // 個体の重量、価値、適応度を計算するメソッド
  public static void calcIndividual() {
    int ind, item;	// ループカウンタ

    for (ind = 0; ind < IND_NUM; ind++) {
      // 重量と価値を計算する
      indWeight[ind] = 0;
      indValue[ind] = 0;
      for (item = 0; item < ITEM_NUM; item++) {
        if (indGene[ind][item] == 1) {
          indWeight[ind] += itemWeight[item];
          indValue[ind] += itemValue[item];
        }
      }

      // 適応度を計算する
      if (indWeight[ind] <= KNAP_MAX) {
        // 耐重量以下なら、価値をそのまま適応度とする
        indFitness[ind] = indValue[ind];
      }
      else {
        // 耐重量を超えているなら、適応度を0とする
        indFitness[ind] = 0;
      }
    }
  }

  // 個体の情報を表示するメソッド
  public static void showIndividual() {
    int ind, item;	// ループカウンタ

    // 世代を表示する
    System.out.printf("\n＜第%d世代＞\n", indGeneration);

    // 遺伝子、重量、価値、適応度を表示する
    System.out.printf("遺伝子\t\t重量\t価値\t適応度\n");
    for (ind = 0; ind < IND_NUM; ind++) {
      for (item = 0; item < ITEM_NUM; item++) {
        System.out.printf("[%d]", indGene[ind][item]);
      }
      System.out.printf("\t%2dkg\t%4d円\t%4d\n", indWeight[ind], indValue[ind], indFitness[ind]);
    }
    System.out.printf("\n");
  }

  // 個体を適応度の大きい順にソートするメソッド
  public static void sortIndividual() {
    int pos;	// 挿入する要素
    int ins;	// 挿入する位置
    int item;	// ループカウンタ
    int tmp;	// 一時的に値を逃がす変数

    // 挿入法でソートする
    for (pos = 1; pos < IND_NUM; pos++) {
      ins = pos;
      while (ins >= 1 && indFitness[ins - 1] < indFitness[ins]) {
        for (item = 0; item < ITEM_NUM; item++) {
          tmp = indGene[ins - 1][item];
          indGene[ins - 1][item] = indGene[ins][item];
          indGene[ins][item] = tmp;
        }

        tmp = indWeight[ins - 1];
        indWeight[ins - 1] = indWeight[ins];
        indWeight[ins] = tmp;

        tmp =  indValue[ins - 1];
        indValue[ins - 1] = indValue[ins];
        indValue[ins] = tmp;

        tmp = indFitness[ins - 1];
        indFitness[ins - 1] = indFitness[ins];
        indFitness[ins] = tmp;

        ins--;
      }
    }
  }

  // 淘汰するメソッド
  public static void selectIndividual() {
    int ind, item;	// ループカウンタ

    // 適応度の上位50％を下位50％にコピーする（下位50％を淘汰する）
    for (ind = 0; ind < IND_NUM / 2; ind++) {
      for (item = 0; item < ITEM_NUM; item++) {
        indGene[ind + IND_NUM / 2][item] = indGene[ind][item];
      }
    }
    System.out.printf("下位50％を淘汰しました。\n");
  }

  // 交叉するメソッド
  public static void crossoverIndividual() {
    int ind, item;	// ループカウンタ
    int crossoverPoint;	// 交叉する位置
    int tmp;

    // 下位50％にコピーした個体を対象とする
    for (ind = IND_NUM / 2; ind < (IND_NUM - 1); ind += 2) {
      // 交叉する位置をランダムに決める
      crossoverPoint = (int)(Math.random() * 10000) % (ITEM_NUM - 1) + 1;
      for (item = crossoverPoint; item < ITEM_NUM; item++) {
        // 隣の個体と交差する
        tmp = indGene[ind][item];
        indGene[ind][item] = indGene[ind + 1][item];
        indGene[ind + 1][item] = tmp;
      }
      System.out.printf("個体%dと個体%dを%dの位置で交叉しました。\n", ind, ind + 1, crossoverPoint);
    }
  }

  // 突然変異するメソッド
  public static void mutateIndividual() {
    int ind, item;	// ループカウンタ

    // 下位50％にコピーした個体を対象とする
    for (ind = IND_NUM / 2; ind < IND_NUM; ind++) {
      for (item = 0; item < ITEM_NUM; item++) {
        // あらかじめ決められた確率で突然変異する
        if (Math.random() <= MUTATE_RATE) {
          // 反転する
          indGene[ind][item] ^= 1;
          System.out.printf("個体%dの%dの位置で突然変異しました。\n", ind, item);
        }
      }
    }
  }

  // プログラムの実行開始位置となるmainメソッド
  public static void main(String[] args) {
    int genMax;	// 最大の世代
    int item;	// ループカウンタ

    // 最大の世代をキー入力する
    Scanner scn = new Scanner(System.in);
    System.out.printf("最大の世代 = ");
    genMax = scn.nextInt();

    // 第1世代の個体を生成する
    indGeneration = 1;
    createIndividual();

    // 適応度を計算する
    calcIndividual();

    // 適応度が大きい順にソートする
    sortIndividual();

    // 個体を表示する
    showIndividual();

    // 1世代ずつ進化させる
    indGeneration++;
    while (indGeneration <= genMax) {
      // 適応度が大きい順にソートする
      sortIndividual();

      // 淘汰する
      selectIndividual();

      // 交叉する
      crossoverIndividual();

      // 突然変異する
      mutateIndividual();

      // 適応度を計算する
      calcIndividual();

      // 適応度が大きい順にソートする
      sortIndividual();

      // 個体を表示する
      showIndividual();

      // 世代を進める
      indGeneration++;
    }

    // 最も適応度の高い個体を解として表示する
    System.out.printf("＜ナップサックに入っている品物を表示する＞\n");
    for (item = 0; item < ITEM_NUM; item++) {
      if (indGene[0][item] == 1) {
        System.out.printf("%c, %dkg, %d円\n", itemName[item], itemWeight[item], itemValue[item]);
      }
    }
    System.out.printf("\n＜解を表示する＞\n");
    System.out.printf("重量の合計値 = %dkg\n", indWeight[0]);
    System.out.printf("価値の最大値 = %d円\n", indValue[0]);
  }
}
