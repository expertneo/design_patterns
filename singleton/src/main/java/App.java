/*
 * Copyright (c) 2019 - Papp Bence. All Rights Reserved.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

  private static final Logger logger = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    SingletonLogger singleton1 = SingletonLogger.getInstance();
    SingletonLogger singleton2 = SingletonLogger.getInstance();
    logger.info("singletonLogger1={}", singleton1);
    logger.info("singletonLogger2={}", singleton2);

    SingletonLogger singleton3 = SingletonLogger.getINSTANCE();
    SingletonLogger singleton4 = SingletonLogger.getINSTANCE();
    logger.info("singletonLogger3={}", singleton3);
    logger.info("singletonLogger4={}", singleton4);
  }

}
