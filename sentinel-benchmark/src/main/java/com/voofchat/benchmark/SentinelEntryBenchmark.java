package com.voofchat.benchmark;

import java.util.concurrent.TimeUnit;

import com.voofchat.util.HttpUtil;
import org.openjdk.jmh.annotations.*;

/**
 * @author zhengzhixiong@baijiahulian.com
 * @date 2020/5/14
 * @time 1:31 PM
 * Description :
 */
// 预热相关参数配置
@Warmup(
        iterations = 1,
        time = 1
)
// 测量相关配置
@Measurement(
        iterations = 1,
        time = 30
//        batchSize = 100
)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Thread)
public class SentinelEntryBenchmark {

    @Setup
    public void before() {
        System.out.println("----- before ---- ");
    }

    @TearDown
    public void after() {
        System.out.println("----- after ---- ");
    }

    @Benchmark
    @Threads(3)
    public void test1(){

        String res = HttpUtil.sendGet("http://localhost:8081/test1");
        String info = String.format("Thread ID : %s," +
                "Method : test1 ," +
                "res: %s", Thread.currentThread().getId(), res);
        System.out.println(info);
    }

//    @Benchmark
//    @Threads(1)
//    public void test2(){
//
//        String res = HttpUtil.sendGet("http://localhost:8081/test2");
//        String info = String.format("Thread ID : %s," +
//                "Method : test2 ," +
//                "res: %s", Thread.currentThread().getId(), res);
//        System.out.println(info);
//    }

}
