package com.github.clagomess.mobileresource;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.*;

import java.io.IOException;

@Slf4j
public class Main {
    public static void main(String[] args){
        Options opt = options();
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(opt, args);

            Core core = new Core();
            core.setImageSource(cmd.getOptionValue("source"));
            core.build(ResourceEnum.valueOf(cmd.getOptionValue("option")));
        } catch (ParseException e) {
            log.info(e.getMessage());
            formatter.printHelp("mobile-resource", opt);
        } catch (IOException e) {
            log.error(Main.class.getName(), e);
        }
    }

    private static Options options(){
        Options options = new Options();
        Option option;

        option = new Option("source", true, "icon.png");
        option.setRequired(true);
        options.addOption(option);

        option = new Option("option", true, "{ANDROID_ICON, IOS_ICON ...}");
        option.setRequired(true);
        options.addOption(option);

        return options;
    }
}
