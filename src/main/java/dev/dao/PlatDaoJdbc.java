package dev.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dev.entite.Plat;

@Repository
public class PlatDaoJdbc implements IPlatDao {

	//private List<Plat> listeplats =  new ArrayList<>();
	
	// outil JdbcTemplate fourni par Spring JDBC
	private JdbcTemplate jdbcTemplate;
	
	// injection de la source de données
	public PlatDaoJdbc(DataSource datasource) {
	this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public List<Plat> listerPlats() {
		String sql = "SELECT * FROM Plat";
		List<Plat> plats = jdbcTemplate.query(sql,  new PlatDaoMapper());
		return plats;
	}

	@Override
	public void ajouterPlat(String nomPlat, Integer prixPlat) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Plat (NOM_PLAT, PRIX_PLAT) VALUES(?,?)";
		jdbcTemplate.update(sql, nomPlat, prixPlat);
	}

}
