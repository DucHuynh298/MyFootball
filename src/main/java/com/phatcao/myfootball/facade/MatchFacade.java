package com.phatcao.myfootball.facade;

import com.phatcao.myfootball.dto.common.ResponseData;
import org.springframework.http.ResponseEntity;


public interface MatchFacade
{
	ResponseData getMatchInfoByMatchId(long id);
}