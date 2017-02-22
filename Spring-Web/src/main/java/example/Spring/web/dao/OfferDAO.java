package example.Spring.web.dao;

import java.util.List;

import example.Spring.web.model.Offer;

public interface OfferDAO {

	public static final String SELECT_ALL_OFFERS = "select * from offers";

	public static final String SELECT_AN_OFFER_NAME = "select * from offers where name = :name ";

	public static final String SELECT_AN_OFFER_ID = "select * from offers where id = :id";

	public static final String DELETE_AN_OFFER_ID = "delete from offers where id = :id";

	public static final String INSERT_AN_OFFER = "insert into offers (id, name, text, email) values(:id, :name, :text, :email)";

	public static final String UPDATE_AN_OFFER = "update offers set name=:name, text=:text, email=:email where id=:id";

	public abstract List<Offer> getOffers();

	public abstract List<Offer> getOffer(String name);

	public abstract Offer getOffer(int id);

	public abstract boolean deleteOffer(int id);

	public abstract boolean createOffer(Offer offer);

	public abstract boolean updateOffer(Offer offer);

	public abstract int[] createOffer(List<Offer> offers);
}
