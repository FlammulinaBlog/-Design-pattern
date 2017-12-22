package com.FlammulinaBlog.建造者模式;

import java.util.ArrayList;
import java.util.List;
import com.FlammulinaBlog.抽象工厂模式.MailSender;
import com.FlammulinaBlog.抽象工厂模式.Sender;
import com.FlammulinaBlog.抽象工厂模式.SmsSender;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {

		for (int i = 0; i < count; i++) {

			list.add(new MailSender());

		}

	}

	public void produceSmsSender(int count) {

		for (int i = 0; i < count; i++) {

			list.add(new SmsSender());

		}

	}
}
