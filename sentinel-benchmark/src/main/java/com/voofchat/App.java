package com.voofchat;

import com.voofchat.benchmark.SentinelEntryBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @author zhengzhixiong@baijiahulian.com
 * @date 2020/5/14
 * @time 2:25 PM
 * Description :
 */
public class App {

    public static void main(String[] args) throws RunnerException {
        Options options =
                new OptionsBuilder()
                        .include(SentinelEntryBenchmark.class.getName())
                        .forks(1)
                        .build();
        new Runner(options).run();
    }
}
