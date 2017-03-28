package com.lte.discovery.reconciliation.managed.element;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;

public class TestGetManagedElementRequest {

	@Test
	public void testGetAllManagedElementsRequest() {

		String fileName = "/home/sunil/workspace/DiscoveryAndReconciliationEngine/src/test/resource/ManageResourceInventory/IIS/xsd/ManagedElementRetrievalMessages.xml";

		File file = new File(fileName);

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext
					.newInstance(GetAllManagedElementsRequest.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			GetAllManagedElementsRequest getAllManagedElementsRequest = (GetAllManagedElementsRequest) unmarshaller
					.unmarshal(file);
			System.out.println(getAllManagedElementsRequest
					.getMdOrMlsnRef_0020().getRdn() == null);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testMultipleMeObjectsResponseType() {
		String fileName = "/home/sunil/workspace/DiscoveryAndReconciliationEngine/src/test/resource/ManageResourceInventory/IIS/xsd/ManagedElementRetrievalMessages_getAllManagedElementsResponse.xml";

		File file = new File(fileName);

		try {

			JAXBContext jaxbContext = JAXBContext
					.newInstance(MultipleMeObjectsResponseType.class);

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			JAXBElement<MultipleMeObjectsResponseType> obj = (JAXBElement<MultipleMeObjectsResponseType>) unmarshaller
					.unmarshal(file);

			System.out.println("obj.getValue().getMeList().getMe().size(): "
					+ obj.getValue().getMeList().getMe().size());

			System.out
					.println("obj.getValue().getMeList().getMe().get(0).getDiscoveredName(): "
							+ obj.getValue().getMeList().getMe().get(0)
									.getDiscoveredName());
			System.out
					.println("obj.getValue().getMeList().getMe().get(0).getLocation(): "
							+ obj.getValue().getMeList().getMe().get(0)
									.getLocation().getValue());
			System.out
					.println("obj.getValue().getMeList().getMe().get(0).getManufacturer(): "
							+ obj.getValue().getMeList().getMe().get(0)
									.getManufacturer().getValue());

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		String fileName = "/home/sunil/workspace/DiscoveryAndReconciliationEngine/src/test/resource/ManageResourceInventory/IIS/xsd/ManagedElementRetrievalMessages_getManagedElementRequest.xml";

		File file = new File(fileName);

		try {

			JAXBContext jaxbContext = JAXBContext
					.newInstance(GetManagedElementRequest.class);

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			GetManagedElementRequest getManagedElementRequest = (GetManagedElementRequest) unmarshaller
					.unmarshal(file);

			System.out.println("getManagedElementRequest.getMeRef().getRdn().size(): " + getManagedElementRequest.getMeRef().getRdn().size());
			System.out.println("Type: " + getManagedElementRequest.getMeRef().getRdn().get(0).getType());
			System.out.println("Value: " + getManagedElementRequest.getMeRef().getRdn().get(0).getValue());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
