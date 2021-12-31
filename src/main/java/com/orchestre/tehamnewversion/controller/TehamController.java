package com.orchestre.tehamnewversion.controller;

import java.util.List;
import java.util.ListIterator;

import com.orchestre.tehamnewversion.model.Message;
import com.orchestre.tehamnewversion.model.TaskElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.HtmlUtils;

@Controller
public class TehamController {

	@Autowired
	private SimpMessagingTemplate template;


	public List<TaskElement> myList = XmlFileList.myList();
	public ListIterator<TaskElement> iter = myList.listIterator();




	@MessageMapping("/Teham")
	@SendTo("/topic/Teham")
	@GetMapping(value = "/callclienthello")
	public void teham(Message message) throws Exception {
		
		String data = HtmlUtils.htmlEscape(message.getName());


		//while(iter.hasNext()) {

		if(iter.hasNext()) {
			TaskElement next = iter.next();

			switch(next.getType()) {

				case "view":
					System.out.println("Response : " + next.getName());
					this.template.convertAndSend("/topic/Teham", next.getName());
					break;
				case "api":

					String uri = next.getUrl() + ":" + next.getPort() + next.getPfad();
					System.out.println(next.toString());
					RestTemplate rest = new RestTemplate();

					if (iter.hasNext()){
						next = iter.next();
						System.out.println("Next: "+ next.getName());
						this.template.convertAndSend("/topic/Teham",  next.getName());
					}else{
						this.template.convertAndSend("/topic/Teham",  "end");
						while(iter.hasPrevious()) {
							iter.previous();
						}
					}

					break;
			}
			Thread.sleep(1000); // simulated delay
		}else {
			this.template.convertAndSend("/topic/Teham",  "end");
		}

	}
}
