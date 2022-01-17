package com.example.slack;

import com.slack.api.bolt.App;
import com.slack.api.bolt.jetty.SlackAppServer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        var app = new App();
        app.command("/hello", (req, ctx) -> {
            String text = req.getPayload().getText();
            if (text != null && !text.isEmpty()) {
                return ctx.ack(
                    ":tada: Yeah! Nice to meet you, " + text + "! :tada:"
                );
            } else {
                return ctx.ack("Please type your name. :sob:");
            }
        });
        var server = new SlackAppServer(app);
        server.start();
    }
}
