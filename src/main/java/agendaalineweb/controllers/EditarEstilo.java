/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package agendaalineweb.controllers;
import agendaalineweb.entities.Estilo;
import agendaalineweb.entities.Usuario;
import agendaalineweb.models.EstiloModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


/**
 *
 * @author Utilizador
 */
@WebServlet(name = "EditarEstilo", urlPatterns = {"/editar-estilo"})
public class EditarEstilo extends HttpServlet {
    private static final String UPLOAD_DIRECTORY = "resources/imagens";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Verifica se o formulário é multipart (necessário para upload)
        //if (!ServletFileUpload.isMultipartContent(request)) {
            //response.getWriter().println("Erro: Formulário não suporta envio de arquivos!");
            //return;
        //}
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioLogado");
        String caminhoAbsoluto = getServletContext().getRealPath("/resources/imagens");
        Path pasta = Path.of(caminhoAbsoluto);
        if (!Files.exists(pasta)) {
            Files.createDirectories(pasta); // Cria a pasta caso não exista
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        String corPrimaria = null;
        String corSecundaria = null;
        String caminhoLogo = null;
        String caminhoFundo = null;
        

        try {
            // Processa os itens do formulário
            List<FileItem> itensFormulario = upload.parseRequest(request);

            for (FileItem item : itensFormulario) {
                if (item.isFormField()) {
                    // Processa os campos de texto
                    if ("corPrimaria".equals(item.getFieldName())) {
                        corPrimaria = item.getString();
                    } else if ("corSecundaria".equals(item.getFieldName())) {
                        corSecundaria = item.getString();
                    }
                } else {
                    // Processa os arquivos enviados
                    String nomeArquivo = new File(item.getName()).getName();
                    String caminhoSalvar = caminhoAbsoluto + File.separator + System.currentTimeMillis() + "_" + nomeArquivo;
                    System.out.println("===================================== Caminho salvar: " + caminhoSalvar);
                    File arquivo = new File(caminhoSalvar);
                    item.write(arquivo); // Salva o arquivo

                    if ("logo".equals(item.getFieldName())) {
                        caminhoLogo = caminhoSalvar;
                    } else if ("fundo".equals(item.getFieldName())) {
                        caminhoFundo = caminhoSalvar;
                    }
                }
            }

            // Cria o objeto Estilo
            Estilo estilo = new Estilo(corPrimaria, corSecundaria, caminhoLogo, caminhoFundo, usuario.getIdNegocio() );

            // Salva o estilo (a lógica de salvar depende da sua aplicação)
            EstiloModel estiloModel = new EstiloModel();
            estiloModel.insert(estilo);

            response.getWriter().println("Upload realizado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Erro ao processar o upload: " + e.getMessage());
        }
        
    }
}
