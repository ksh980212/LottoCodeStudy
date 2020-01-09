package dto;

import domain.lotto.Lotto;
import domain.lotto.LottoPrize;
import java.util.ArrayList;
import java.util.List;

public class LottoPrizeDto {

  private List<LottoPrize> lottoPrizeList;

  private LottoPrizeDto(List<Lotto> lottoList) {
    lottoPrizeList = new ArrayList<>();
    for(int i = 0, end= lottoList.size() ; i < end ; i++ ) {
      lottoPrizeList.add(lottoList.get(i).getPrize());
    }
  }

  public static LottoPrizeDto of(List<Lotto> lottoList) {
    return new LottoPrizeDto(lottoList);
  }

  public void showPrizeStatus() {
    System.out.println("Winning statistics");
    System.out.println("-------------------");

    //생각해 봅시다 어떻게 보여주면 좋을지
  }
}