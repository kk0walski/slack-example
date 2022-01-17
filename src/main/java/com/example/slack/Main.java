package com.example.slack;

import com.slack.api.Slack;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Slack slack = Slack.getInstance();
        String token = System.getenv("SLACK_BOT_TOKEN");
        // Build a request object
        ChatPostMessageResponse response = slack.methods(token).chatPostMessage(req -> req.channel("#random").text(":wave: Hi from a bot written in Java!"));
      }
}
