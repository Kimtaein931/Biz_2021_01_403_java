package com.callor.score;

import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx {

	public static void main(String[] args) {

		ScoreService ss = new ScoreServiceImplV1();
		ss.inputScore();
		ss.scoreSumFloat();
		ss.saveScoreToFile();
		ss.outputScore();

	}

}
