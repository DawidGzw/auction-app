package org.dguzowski.actionplatform.cucumber.stepdefs;

import org.dguzowski.actionplatform.AuctionPlatformApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AuctionPlatformApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
