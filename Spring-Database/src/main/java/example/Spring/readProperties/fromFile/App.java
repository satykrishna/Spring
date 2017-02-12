package example.Spring.readProperties.fromFile;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import example.Spring.manager.OfferManager;
import example.Spring.model.Offer;

public class App {

	private static ApplicationContext app;
	private static Logger logger = Logger.getLogger(App.class.getName());
	private static OfferManager manager;

	public static void start() {
		app = new ClassPathXmlApplicationContext("database-configure.xml");
		manager = (OfferManager) app.getBean("offerManager");
	}

	public static void close() {
		ClassPathXmlApplicationContext classApp = (ClassPathXmlApplicationContext) app;
		classApp.close();
	}

	public static void main(String[] args) {
		start();
		try {
			createOffers();
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		close();
	}

	/*
	 * Demonstrate Spring transactions as well as spring batch
	 */
	public static void createOffers() {
		List<Offer> offersList = new ArrayList<Offer>();
		offersList.add(new Offer(1, "A1", "A1@GMAIL.COM", "A1TEXT"));
		offersList.add(new Offer(2, "A2", "A2@GMAIL.COM", "A2TEXT"));
		offersList.add(new Offer(3, "A3", "A3@GMAIL.COM", "A3TEXT"));
		offersList.add(new Offer(4, "A4", "A4@GMAIL.COM", "A4TEXT"));
		offersList.add(new Offer(1, "A5", "A5@GMAIL.COM", "A5TEXT"));

		int[] operationResult = manager.createOffer(offersList);
		for (int value : operationResult) {
			System.out.println("Updated " + value + " rows");
		}
	}

	public static void getOffers() {
		List<Offer> offers = manager.getOffers();
		logger.info(offers + "");
	}

	public static void getOffer(int id) {
		Offer offer = manager.getOffer(118);
		logger.info(offer.toString());
	}

	public void deleteOffer(int id) {
		boolean deleted = manager.deleteOffer(118);
		logger.info(deleted == true ? "yes deleted" : "no...Not deleted");
	}

	public static void createOffer(int id, String name, String email, String text) {
		Offer offer = new Offer(name, email, text);
		offer.setId(id);
		boolean created = manager.createOffer(offer);
		if (created) {
			logger.info("offer: " + created);
		}
	}

	public static void updateOffer(int existingID, String name, String email, String text) {
		Offer offer = new Offer(name, email, text);
		offer.setId(existingID);
		boolean update = manager.updateOffer(offer);
		if (update) {
			logger.info("offer " + offer + " is updated");
		}
	}
}
