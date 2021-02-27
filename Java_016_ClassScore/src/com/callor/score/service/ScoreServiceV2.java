package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {

	public int scoreSum(int intKor, int intEng, int intMath, int intMusic) {
		int sum = intKor + intEng + intMath + intMusic;
		return sum;
	}

	public int scoreSum(ScoreVO scoreVO) {

		int sum = scoreVO.intKor;
		sum += scoreVO.intEng;
		sum += scoreVO.intMath;
		sum += scoreVO.intMusic;
		sum += scoreVO.intHistory;
		return sum;
	}

}
