package example.Spring.security.manager;

import java.util.List;

import example.Spring.security.model.Offer;

public interface OfferManager {

	public abstract List<Offer> getOffers();
	
	public abstract Offer getOffer(int id);
	
	public abstract boolean deleteOffer(int id);

	public abstract boolean createOffer(Offer offer);
	
	public abstract boolean updateOffer(Offer offer);

	public abstract int[] createOffer(List<Offer> offerList);

	public abstract void throwException() throws Exception;
}
