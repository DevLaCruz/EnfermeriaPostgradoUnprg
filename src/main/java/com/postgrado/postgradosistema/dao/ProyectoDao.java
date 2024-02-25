package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Especialidad;
import com.postgrado.postgradosistema.modelo.Proyecto;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProyectoDao {
    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarProyecto(Proyecto proyecto) {
        String sql = "INSERT INTO proyecto (titulo, asesora, jurado, res_designacion, res_ejecucion, res_cambioJurado, res_sustentacion, res_cambioTitulo, otros, especialidad_id) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, proyecto.getTitulo());
            ps.setString(2, proyecto.getAsesora());
            ps.setString(3, proyecto.getJurado());
            ps.setString(4, proyecto.getRes_designacion());
            ps.setString(5, proyecto.getRes_ejecucion());
            ps.setString(6, proyecto.getRes_cambioJurado());
            ps.setString(7, proyecto.getRes_sustentacion());
            ps.setString(8, proyecto.getRes_cambioTitulo());
            ps.setString(9, proyecto.getOtros());
            ps.setInt(10, proyecto.getEspecialidad().getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    /*comentario*/
    public boolean modificarProyecto(Proyecto proyecto) {
        String sql = "UPDATE proyecto SET titulo = ?, asesora = ?, jurado = ?, res_designacion = ?, res_ejecucion = ?, res_cambioJurado = ?, res_sustentacion = ?, res_cambioTitulo = ?, otros = ?, especialidad_id= ? WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, proyecto.getTitulo());
            ps.setString(2, proyecto.getAsesora());
            ps.setString(3, proyecto.getJurado());
            ps.setString(4, proyecto.getRes_designacion());
            ps.setString(5, proyecto.getRes_ejecucion());
            ps.setString(6, proyecto.getRes_cambioJurado());
            ps.setString(7, proyecto.getRes_sustentacion());
            ps.setString(8, proyecto.getRes_cambioTitulo());
            ps.setString(9, proyecto.getOtros());
            ps.setInt(10, proyecto.getEspecialidad().getId());
            ps.setInt(11, proyecto.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }


    public boolean eliminarProyecto(Proyecto proyecto) {
        String sql = "UPDATE proyecto SET es_proyecto = 'I'  WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, proyecto.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }


   public List<Proyecto> listaProyectos() {
    List<Proyecto> proyectos = new ArrayList<>();
    String sql = "SELECT proyecto.id," +
            " proyecto.titulo," +
            " proyecto.asesora," +
            " proyecto.jurado," +
            " proyecto.res_designacion," +
            " proyecto.res_ejecucion," +
            " proyecto.res_cambioJurado," +
            " proyecto.res_sustentacion," +
            " proyecto.res_cambioTitulo," +
            " proyecto.otros," +
            " proyecto.especialidad_id," +
            " especialidad.nombre AS nombre_especialidad," +
            " proyecto.es_proyecto," +
            " ingresante1.nombre AS nombre_student1," +
            " ingresante2.nombre AS nombre_student2," +
            " ingresante3.nombre AS nombre_student3" +
            " FROM proyecto" +
            " INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id" +
            " LEFT JOIN ingresante AS ingresante1 ON proyecto.id_student = ingresante1.id" +
            " LEFT JOIN ingresante AS ingresante2 ON proyecto.id_student2 = ingresante2.id" +
            " LEFT JOIN ingresante AS ingresante3 ON proyecto.id_student3 = ingresante3.id";

    try (Connection cntn = cnxn.getConnection();
         PreparedStatement ps = cntn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Proyecto proyecto = new Proyecto();
            proyecto.setId(rs.getInt("id"));
            proyecto.setTitulo(rs.getString("titulo"));
            proyecto.setAsesora(rs.getString("asesora"));
            proyecto.setJurado(rs.getString("jurado"));
            proyecto.setRes_designacion(rs.getString("res_designacion"));
            proyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
            proyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
            proyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
            proyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
            proyecto.setOtros(rs.getString("otros"));
            proyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
            proyecto.setStudent1(new Ingresante(rs.getString("nombre_student1")));
            proyecto.setStudent2(new Ingresante(rs.getString("nombre_student2")));
            proyecto.setStudent3(new Ingresante(rs.getString("nombre_student3")));
            proyecto.setEs_proyecto(rs.getString("es_proyecto"));

            proyectos.add(proyecto);
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
    return proyectos;
}



   public List<Proyecto> buscarProyectoPorTitulo(String titulo) {
    List<Proyecto> proyectos = new ArrayList<>();
    String sql = "SELECT proyecto.id, " +
        "proyecto.titulo, " +
        "proyecto.asesora, " +
        "proyecto.jurado, " +
        "proyecto.res_designacion, " +
        "proyecto.res_ejecucion, " +
        "proyecto.res_cambioJurado, " +
        "proyecto.res_sustentacion, " +
        "proyecto.res_cambioTitulo, " +
        "proyecto.otros, " +
        "especialidad.nombre AS nombre_especialidad, " +
        "proyecto.es_proyecto, " +
        "ingresante1.nombre AS nombre_student1," +
        "ingresante2.nombre AS nombre_student2," +
        "ingresante3.nombre AS nombre_student3 " +
        "FROM proyecto " +
        "INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id " +
        "LEFT JOIN ingresante AS ingresante1 ON proyecto.id_student = ingresante1.id " +
        "LEFT JOIN ingresante AS ingresante2 ON proyecto.id_student2 = ingresante2.id " +
        "LEFT JOIN ingresante AS ingresante3 ON proyecto.id_student3 = ingresante3.id " +
        
        "WHERE proyecto.titulo LIKE ? OR ingresante1.nombre LIKE ? OR ingresante2.nombre LIKE ? OR ingresante3.nombre LIKE ?";

    try {
        cntn = cnxn.getConnection();
        ps = cntn.prepareStatement(sql);
        // Aquí establecemos el valor de búsqueda tanto para el título del proyecto como para los nombres de los estudiantes
        String searchTerm = "%" + titulo + "%";
        ps.setString(1, searchTerm);
        ps.setString(2, searchTerm);
        ps.setString(3, searchTerm);
        ps.setString(4, searchTerm);
        rs = ps.executeQuery();
        while (rs.next()) {
            Proyecto proyecto = new Proyecto();
            proyecto.setId(rs.getInt("id"));
            proyecto.setTitulo(rs.getString("titulo"));
            proyecto.setAsesora(rs.getString("asesora"));
            proyecto.setJurado(rs.getString("jurado"));
            proyecto.setRes_designacion(rs.getString("res_designacion"));
            proyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
            proyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
            proyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
            proyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
            proyecto.setStudent1(new Ingresante(rs.getString("nombre_student1")));
            proyecto.setStudent2(new Ingresante(rs.getString("nombre_student2")));
            proyecto.setStudent3(new Ingresante(rs.getString("nombre_student3")));
            proyecto.setOtros(rs.getString("otros"));
            proyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
            proyecto.setEs_proyecto(rs.getString("es_proyecto"));
            proyectos.add(proyecto);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
        System.out.println(e);
    }
    return proyectos;
}

    public List<Proyecto> buscarProyectoPorAño(String año) {
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT proyecto.id, " +
                "proyecto.titulo, " +
                "proyecto.asesora, " +
                "proyecto.jurado, " +
                "proyecto.res_designacion, " +
                "proyecto.res_ejecucion, " +
                "proyecto.res_cambioJurado, " +
                "proyecto.res_sustentacion, " +
                "proyecto.res_cambioTitulo, " +
                "proyecto.otros, " +
                "especialidad.nombre AS nombre_especialidad, " +
                "proyecto.es_proyecto " +
                "FROM proyecto " +
                "INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id" +
                " WHERE proyecto.res_designacion LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + año + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setId(rs.getInt("id"));
                proyecto.setTitulo(rs.getString("titulo"));
                proyecto.setAsesora(rs.getString("asesora"));
                proyecto.setJurado(rs.getString("jurado"));
                proyecto.setRes_designacion(rs.getString("res_designacion"));
                proyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
                proyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
                proyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
                proyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
                proyecto.setOtros(rs.getString("otros"));
                proyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                proyecto.setEs_proyecto(rs.getString("es_proyecto"));
                proyectos.add(proyecto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return proyectos;
    }

    public List<Proyecto> buscarProyectoPorId(int id) throws SQLException {
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT proyecto.id, " +
                " proyecto.titulo," +
                " proyecto.asesora," +
                " proyecto.jurado," +
                " proyecto.res_designacion," +
                " proyecto.res_ejecucion," +
                " proyecto.res_cambioJurado," +
                " proyecto.res_sustentacion," +
                " proyecto.res_cambioTitulo," +
                " proyecto.otros," +
                " especialidad.nombre AS nombre_especialidad," +
                " proyecto.es_proyecto" +
                " FROM proyecto " +
                " INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id" +
                " WHERE proyecto.id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto newProyecto = new Proyecto();
                newProyecto.setId(rs.getInt("id"));
                newProyecto.setTitulo(rs.getString("titulo"));
                newProyecto.setAsesora(rs.getString("asesora"));
                newProyecto.setJurado(rs.getString("jurado"));
                newProyecto.setRes_designacion(rs.getString("res_designacion"));
                newProyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
                newProyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
                newProyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
                newProyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
                newProyecto.setOtros(rs.getString("otros"));
                newProyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                newProyecto.setEs_proyecto(rs.getString("es_proyecto"));
                proyectos.add(newProyecto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return proyectos;
    }


}
