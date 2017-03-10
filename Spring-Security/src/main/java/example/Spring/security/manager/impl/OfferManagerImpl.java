package example.Spring.security.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import example.Spring.security.dao.OfferDAO;
import example.Spring.security.manager.OfferManager;
import example.Spring.security.model.Offer;

@Service
@Qualifier(value="offerManager")
public class OfferManagerImpl implements OfferManager {

	@Autowired
	@Qualifier("offerDAO")
	private OfferDAO offerDAO;
	
	@Override
	public List<Offer> getOffers() {
		return offerDAO.getOffers();
	}

	@Override
	public Offer getOffer(int id) {
		return offerDAO.getOffer(id);
	}

	@Override
	public boolean deleteOffer(int id) {
		return offerDAO.deleteOffer(id);
	}

	@Override
	public boolean createOffer(Offer offer) {
		return offerDAO.createOffer(offer);
	}

	@Override
	public boolean updateOffer(Offer offer) {
		return offerDAO.updateOffer(offer);
	}
	
	@Override
	public int[] createOffer(List<Offer> offerList) {
		return offerDAO.createOffer(offerList);
	}

	@Override
	public void throwException() throws Exception {
		throw new Exception("Unable to access database");
	}

}
