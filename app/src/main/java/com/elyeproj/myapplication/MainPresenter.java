package com.elyeproj.myapplication;

import com.elyeproj.proto.Card;
import com.elyeproj.proto.Heart;
import com.elyeproj.proto.Result;
import com.elyeproj.proto.Spade;

public class MainPresenter {

    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void fetchData() {
        Card card1 = Card.newBuilder().setHeart(Heart.newBuilder().build()).build();
        Card card2 = Card.newBuilder().setSpade(Spade.newBuilder().build()).build();
        Result result = Result.newBuilder().addCards(card1).addCards(card2).build();
        mainView.showResult(result.toString());

    }
}
