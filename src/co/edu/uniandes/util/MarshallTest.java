package co.edu.uniandes.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import co.edu.uniandes.generated.DocumentCanonical;

public class MarshallTest {

	public static void main(String[] args) throws JAXBException {
		DocumentCanonical document = new DocumentCanonical();
		document.setCategory("Registro");
		document.setCreatedDate(DateUtil.getXMLGregorianCalendarNow());
		document.setFileMD5("AABBCCDD123456");
		document.setFileName("CEDULA.pdf");
		document.setIssuer("Registraduria Nadional");
		document.setMimeType("application/pdf");
		document.setOriginName("origen");
		document.setReceiver("receptor");
		document.setSendedDate(DateUtil.getXMLGregorianCalendarNow());
		document.setUserID("userId");

		final Marshaller m = JAXBContext.newInstance(DocumentCanonical.class).createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		final StringWriter w = new StringWriter();
		m.marshal(document, w);
		System.out.println(w.toString());
	}

}
