package example.Spring.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import example.Spring.dao.OfferDAO;
import example.Spring.manager.OfferManager;
import example.Spring.model.Offer;


@Component(value="offerManager")
public class OfferManagerImpl implements OfferManager {

	@Resource(name="offerDAO")
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
}
