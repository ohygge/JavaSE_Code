package com.a1ExceptionHanding;

/**
 * @className: ScoreException
 * @description: 分数异常类之自定义异常类
 * @author: hotel
 * @date: 2026/3/11 12:04
 */
public class ScoreException extends Exception {
    public ScoreException() {}
    public ScoreException(String message) {
        super(message);
    }
}
