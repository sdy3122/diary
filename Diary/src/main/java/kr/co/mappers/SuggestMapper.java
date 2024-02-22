package kr.co.mappers;

import java.util.ArrayList;
import java.util.List;

import kr.co.domain.Criteria;
import kr.co.domain.SuggestVo;

public interface SuggestMapper {
	boolean insertSuggest(SuggestVo vo);
	int countSuggest();
	List<SuggestVo> selectSuggestLimit(Criteria cri);
	ArrayList<SuggestVo> selectSuggestLikeBtnDesc();
}
