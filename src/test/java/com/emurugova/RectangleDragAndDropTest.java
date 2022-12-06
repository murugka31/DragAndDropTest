package com.emurugova;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactTextCaseSensitive;
import static com.codeborne.selenide.Selenide.*;

public class RectangleDragAndDropTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2100x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    @Test
    void dragAndDropAction(){
       open("/drag_and_drop");
       $("#column-a").shouldHave(exactTextCaseSensitive("A"));
       $("#column-a").dragAndDropTo("#column-b");
       $("#column-a").shouldHave(exactTextCaseSensitive("B"));
    }
}
