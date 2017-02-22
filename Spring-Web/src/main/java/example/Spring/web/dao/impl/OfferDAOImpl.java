package example.Spring.web.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

import example.Spring.web.dao.OfferDAO;
import example.Spring.web.model.Offer;


@Component
@Qualifier("offerDAO")
public class OfferDAOImpl implements OfferDAO {

	private static Logger logger = Logger.getLogger(OfferDAOImpl.class.getName());
	
	@Resource(name="dataSource")
	private DataSource dataSource;

	private NamedParameterJdbcTemplate jdbcTemplate;

	
	public DataSource getDataSource() {
		return dataSource;
	}

	// retrieve all records from table
	@Override
	public List<Offer> getOffers() {
		return jdbcTemplate.query(SELECT_ALL_OFFERS, new RowMapper<Offer>() {
			@Override
			public Offer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(resultSet.getInt("ID"));
				offer.setEmail(resultSet.getString("EMAIL"));
				offer.setName(resultSet.getString("NAME"));
				offer.setText(resultSet.getString("TEXT"));
				return offer;
			}
		});
	}

	
	//get a particular offer : Search parameter name
	@Override
	public List<Offer> getOffer(String name) {
		logger.info("SQL QUERY IS " + SELECT_AN_OFFER_NAME);
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("name", name);
		logger.info("PARAMETERS : name " + name);
		return jdbcTemplate.query(SELECT_AN_OFFER_NAME, parameters, new RowMapper<Offer>() {
			@Override
			public Offer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(resultSet.getInt("ID"));
				offer.setEmail(resultSet.getString("EMAIL"));
				offer.setName(resultSet.getString("NAME"));
				offer.setText(resultSet.getString("TEXT"));
				return offer;
			}
		});
	}

	
	//Query for Object
	@Override
	public Offer getOffer(int id) {
		logger.info("SQL QUERY IS " + SELECT_AN_OFFER_ID);
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		parameters.addValue("id", id);
		logger.info("PARAMETERS: id =" + id);
		return jdbcTemplate.queryForObject(SELECT_AN_OFFER_ID, parameters, new RowMapper<Offer>() {
			@Override
			public Offer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				Offer offer = new Offer();
				offer.setId(resultSet.getInt("ID"));
				offer.setEmail(resultSet.getString("EMAIL"));
				offer.setName(resultSet.getString("NAME"));
				offer.setText(resultSet.getString("TEXT"));
				return offer;
			}
		});	
	}

	
	//delete query with parameter
	@Override
	public boolean deleteOffer(int id) {
		logger.info("SQL QUERY IS " + DELETE_AN_OFFER_ID);
		MapSqlParameterSource parameters  = new MapSqlParameterSource();
		parameters.addValue("id", id);
		logger.info("PARAM : id= " + id);
		int rowsAffected = jdbcTemplate.update(DELETE_AN_OFFER_ID, parameters);
		return rowsAffected==1;
	}

	@Override
	public boolean createOffer(Offer offer) {
		logger.info("SQL QUERY IS " + INSERT_AN_OFFER);
		logger.info("PARAMS : offer= " + offer.toString());
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
		return jdbcTemplate.update(INSERT_AN_OFFER, params)==1;
	}

	@Override
	public boolean updateOffer(Offer offer) {
		logger.info("SQL QUERY IS " + UPDATE_AN_OFFER);
		logger.info("PARAMS : offer= " + offer.toString());
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
		return jdbcTemplate.update(UPDATE_AN_OFFER, params)==1;
	}
	
	
	@Override
//	@Transactional
	public int[] createOffer(List<Offer> offers){
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());
		return jdbcTemplate.batchUpdate(INSERT_AN_OFFER, params);
	}
	
	@PostConstruct
	public void init() {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

}
