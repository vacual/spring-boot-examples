package xyz.v.web;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.v.aspect.PrometheusMetrics;

@RestController
public class HomeController {
     private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
 
     @RequestMapping("/endpointA")
     @PrometheusMetrics
     public void handlerA() throws InterruptedException {
          logger.info("/endpointA");
          Thread.sleep(RandomUtils.nextLong(0, 100));
     }
 
     @RequestMapping("/endpointB")
     @PrometheusMetrics
     public void handlerB() throws InterruptedException {
          logger.info("/endpointB");
          Thread.sleep(RandomUtils.nextLong(0, 100));
     }
}