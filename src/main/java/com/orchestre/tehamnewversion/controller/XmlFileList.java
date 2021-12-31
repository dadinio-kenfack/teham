package com.orchestre.tehamnewversion.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import com.orchestre.tehamnewversion.model.ProcessData;
import com.orchestre.tehamnewversion.model.TaskElement;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlFileList {

	static List<String> map = new ArrayList<>();

	public static List<TaskElement> myList(){
		try {

			//File charge the xml fiile to file variable
			File file = new File("patient.xml");

			//Create a new instance of Document Factory
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			//Convert to DocumentBuilder
			DocumentBuilder db = dbf.newDocumentBuilder();

			//Parse the file with document librairie
			Document document = db.parse(file);

			//Normalize the document
			document.getDocumentElement().normalize();
			ProcessData processData = null;
			JAXBContext jaxbContext = JAXBContext.newInstance(ProcessData.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			processData = (ProcessData) unmarshaller.unmarshal(document);
			return processData.getTaskElements();
//			//print the root element
//			System.out.println(processData);
//
//			//Create a Node list of tagName event
//			//NodeList event = document.getElementsByTagName("event");
//			//NodeList connector = document.getElementsByTagName("connector");
//
//			//Create a Node list of tagName task
//			NodeList task = document.getElementsByTagName("task");
//
//			//Create a gateways of tagName gateways
//			//NodeList gateways = document.getElementsByTagName("gateways");
//
//			//Print a separator
//			System.out.println("----------------------------");
//
//
//			//Create a loop element until task length
//			for (int temp = 0; temp < task.getLength(); temp++) {
//
//				//Create a node item
//				Node nNode = task.item(temp);
//
//				//Print a current element of type task
//				//System.out.println("\nCurrent Element :" + nNode.getNodeName());
//
//				//verify if a node is in a node type element
//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//
//					//Then create a node element
//					Element eElement = (Element) nNode;
//
//					map.add(eElement.getAttribute("type"));
//					map.add(eElement.getAttribute("name"));
//					map.add(eElement.getAttribute("url"));
//					map.add(eElement.getAttribute("pfad"));
//					map.add(eElement.getAttribute("port"));
//
//
//				}
//
//			}
//
		}catch(IOException | ParserConfigurationException | SAXException | JAXBException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}


}
