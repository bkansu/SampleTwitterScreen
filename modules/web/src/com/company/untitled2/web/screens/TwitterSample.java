//package com.company.untitled2.web.screens;
//
//import com.haulmont.cuba.gui.screen.Screen;
//import com.haulmont.cuba.gui.screen.UiController;
//import com.haulmont.cuba.gui.screen.UiDescriptor;
//
//@UiController("TwitterSample")
//@UiDescriptor("twitter-sample.xml")
//public class TwitterSample extends Screen {
//}


package com.company.untitled2.web.screens;

import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
//import com.haulmont.cuba.gui.screen.Subscribe;
//import com.haulmont.cuba.gui.screen.UiController;
//import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.vaadin.ui.Video;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.net.URL;

@UiController("TwitterSample")
@UiDescriptor("twitter-sample.xml")
public class TwitterSample extends Screen {
    @Inject
    private BrowserFrame vbox_video_browser;
    private static final String HTML = "<strong>Uğur Dündar</strong>";
    private static final String HTML2 = "<b style=\"font-size: 20px\">İzmir-Tepecik Romanlarında, Darbukatör Baryam <br> coşkusu...</b>";
    private static final String HTML3 = "<b style=\"font-size: 14px\">412</b>" + "<i>Retweet</i>&emsp";
    private static final String HTML4 = "<b style=\"font-size: 14px\">31</b>" + "<i>Alıntı Tweetler</i>&emsp";
    private static final String HTML5 = "<b style=\"font-size: 14px\">9.812</b>" + "<i>Beğeni</i>";
    private static final String HTML6 = "<hr size=\"6\" width=\"50%\" align=\"left\" color=\"green\">";
    private static final String HTML7 = "<hr>";

    @Inject
    private Label<String> htmlLabel;
    @Inject
    private Label<String> htmlLabel2;
    @Inject
    private Label<String> htmlLabel3;
    @Inject
    private Label<String> htmlLabel4;
    @Inject
    private Label<String> htmlLabel5;
    @Inject
    private Label<String> htmlLabel6;
    @Inject
    private Label<String> htmlLabel7;

    @Subscribe
    public void onInit(InitEvent event) throws MalformedURLException {
        Video video = new Video();
        htmlLabel.setValue(HTML);
        htmlLabel2.setValue(HTML2);
        htmlLabel3.setValue(HTML3);
        htmlLabel4.setValue(HTML4);
        htmlLabel5.setValue(HTML5);
        htmlLabel6.setValue(HTML6);
        htmlLabel7.setValue(HTML7);
        vbox_video_browser.setSource(UrlResource.class)
                .setUrl(new URL("https://video.twimg.com/ext_tw_video/1494318858139701252/pu/vid/640x352/PUQaCig4Hvi5p8Za.mp4?tag=12"));
        video.setSizeFull();


    }
}