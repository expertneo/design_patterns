/*
 * Copyright (c) 2019 - Papp Bence. All Rights Reserved.
 */

public final class SingletonLogger {

  private SingletonLogger() {
  }

  private static final SingletonLogger INSTANCE = new SingletonLogger();

  /**
   * @return instance of the singleton.
   */
  public static SingletonLogger getINSTANCE() {
    return INSTANCE;
  }

  // Or you can also do this..
  public static SingletonLogger getInstance() {
    return SingletonLogger.INSTANCE;
  }

}
