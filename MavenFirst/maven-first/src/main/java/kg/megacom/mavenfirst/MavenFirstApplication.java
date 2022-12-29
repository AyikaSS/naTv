package kg.megacom.mavenfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MavenFirstApplication {

	public static void main(String[] args) {


		try {
			Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:5432/Shop18112022", "postgres", "aika96aika" );
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}



	}

}
