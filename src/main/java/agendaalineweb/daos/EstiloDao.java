package agendaalineweb.daos;

import agendaalineweb.conect.Conexao;
import agendaalineweb.entities.Estilo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstiloDao {

    public void insert(Estilo estilo) throws SQLException {
        String sql = "INSERT INTO Estilo (corPrimaria, corSecundaria, imgLogo, imgFundo, idNegocio) values (?, ?, ?, ?, ?) ";
        Connection con = new Conexao().getConnection();
        PreparedStatement estadoPreparado = con.prepareStatement(sql);
        estadoPreparado.setString(1, estilo.getCorPrimaria());
        estadoPreparado.setString(2, estilo.getCorSecundaria());
        estadoPreparado.setString(3, estilo.getLogo());
        estadoPreparado.setString(4, estilo.getImagemFundo());
        estadoPreparado.setInt(5, estilo.getIdNegocio());

        estadoPreparado.execute();
        estadoPreparado.close();
        con.close();

    }

    public Estilo getEstiloByIdNegocio(int idNegocio) {
        String sql = "SELECT * FROM estilo where idNegocio = ?";
        Estilo estilo = null;
        try {
            Connection con = new Conexao().getConnection();
            PreparedStatement estadoPreparado;
            estadoPreparado = con.prepareStatement(sql);
            estadoPreparado.setInt(1, idNegocio);
            ResultSet rs = estadoPreparado.executeQuery();
            
            if(rs.next()){
                estilo = new Estilo(rs.getInt("id"), rs.getString("corPrimaria"), rs.getString("corSecundaria"), rs.getString("imgLogo"), rs.getString("imgFundo"), rs.getInt("idNegocio"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return estilo;

    }

}
