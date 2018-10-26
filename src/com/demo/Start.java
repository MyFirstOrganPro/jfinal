package com.demo;

import com.jfinal.core.JFinal;

public class Start {
/**
 * 改了提交，测试单独push
 * @param args
 */
	public static void main(String[] args) {
		JFinal.start("WebContent", 8082, "/", 5);
	}

}

