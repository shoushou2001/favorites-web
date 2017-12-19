package com.favorites.utils;

public class MessageUtil {

	public static String getMessage(String template, String... keys) {
		int count = 0;
		for (String key : keys) {
			template = template.replace("{" + count++ + "}", key);
		}
		return template;
	}

	public static void main(String a[]) {
		String template = "Hello {0}, this is {1} who I mentioned in our {2} meeting";
		String[] key = { "John", "Mike", "3" };
		String msg = getMessage(template, key);
		System.out.println(msg);

	}
}
