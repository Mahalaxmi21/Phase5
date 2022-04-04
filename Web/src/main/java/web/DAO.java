package web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
	public int insert(RegisterBean rb) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConnection();
		String sql="insert into RegisterBean values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,rb.getUser());
		ps.setString(2,rb.getEmail());
		return ps.executeUpdate();
	}


}
