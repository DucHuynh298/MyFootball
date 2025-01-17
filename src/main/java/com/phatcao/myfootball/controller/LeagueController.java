package com.phatcao.myfootball.controller;

import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.facade.LeagueFacade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/league")
public class LeagueController
{

	@Resource
	LeagueFacade leagueFacade;

	@GetMapping ("/leagues/{customerId}")
	public ResponseEntity<?> getLeagueByCustomerId(@PathVariable String customerId)
	{
		try{
			ResponseData result = leagueFacade.getLeaguesByUsername(customerId);
			return new ResponseEntity<>(result , HttpStatus.OK);
		}
		catch (NullPointerException e)
		{
			return new ResponseEntity<>(new ResponseData(true,e.getMessage() , null), HttpStatus.TEMPORARY_REDIRECT);
		}
	}

	@GetMapping ("/league/{leagueId}/info")
	public ResponseData getLeagueInfo(@PathVariable Integer leagueId)
	{
		return leagueFacade.getInfoLeagueById(leagueId);
	}

	@GetMapping ("leagues/{idLeague}/matches")
	public ResponseData getMatchInfoByLeagueId(@PathVariable Integer idLeague)
	{
		return leagueFacade.getMatchInfoByLeagueId(idLeague);
	}
}
