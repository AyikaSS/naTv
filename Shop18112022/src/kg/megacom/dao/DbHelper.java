package kg.megacom.dao;

import java.sql.PreparedStatement;

public interface DbHelper {
    PreparedStatement getStatement (String sql);
}
