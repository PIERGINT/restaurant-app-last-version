package dev.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dev.entite.Plat;


public class PlatDaoMapper implements RowMapper<Plat> {

	@Override
	public Plat mapRow(ResultSet rs, int numligne) throws SQLException {
		// TODO Auto-generated method stub
		Plat plat = new Plat();
		plat.setId(rs.getInt("ID"));
		plat.setNom(rs.getString("NOM_PLAT"));
		plat.setPrixEnCentimesEuros(rs.getInt("PRIX_PLAT"));
		return plat;
	}

}
