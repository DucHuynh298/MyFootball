package com.phatcao.myfootball.controller;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.phatcao.myfootball.dto.common.ResponseData;
import com.phatcao.myfootball.dto.leauge.LeagueData;
import com.phatcao.myfootball.facade.FavoriteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FavoriteController {

    @Autowired
    FavoriteFacade favoriteFacade;

    @PostMapping("/add-favorite-league")
    public ResponseEntity<?> addFavoriteLeague(@RequestBody List<LeagueData> leagueData)
    {
        try{
            ResponseData result = favoriteFacade.addFavoriteLeague(leagueData);
            return new ResponseEntity<>(result, HttpStatus.OK);}
        catch (Exception e){
            return new ResponseEntity<>(new ResponseData(true,e.getMessage() , null), HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
