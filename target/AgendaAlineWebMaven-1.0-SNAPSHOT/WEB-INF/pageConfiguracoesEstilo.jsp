<%-- 
    Document   : pageConfiguracoesEstilo
    Created on : 29/08/2024, 18:24:54
    Author     : Utilizador
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Agenda Aline - Clientes</title>
        <script src="https://unpkg.com/@phosphor-icons/web"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
                integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
                integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>

        <link rel="stylesheet" href="css/style.css">
        <style>
            .col-md-11 {
                max-width: 90%;

            }

            #tb-funcoes {
                width: 8%;
            }

            .container-thitem {
                width: 28.6%;
                text-align: center;
            }

            .profile-card{
                height: 85%;
                width: 25%;
            }



        </style>
    </head>

    <body class="d-flex flex-column">
        <div id="container-menu">
            <nav class="navbar navbar-expand-lg navbar-light  mx-auto">
                <a class="navbar-brand " href="index.html">
                    <img src="imgs/img-aline-simao.jpg " alt="logotipo do site Aline Simão" id="img-logo">
                </a>
                <!-- <button style="color: black;" class="navbar-toggler" type="button" data-toggle="collapse"
                    data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
                    <span class="navbar-toggler-icon"></span>
                </button>
                colocar a classe collapse e o navbar-collapse na div abaixo-->
                <div class="  " id="navbarNav">
                    <ul class="navbar-nav d-flex justify-content-around">
                        <li class="nav-item li-nav">
                            <a class="nav-link text-link text-dark" href="${caminhoContexto}/cadastrar-cliente">Cliente</a>
                        </li>
                        <li class="nav-item li-nav">
                            <a class="nav-link text-link text-dark" href="${caminhoContexto}/cadastrar-procedimento">Serviços</a> 
                        </li>
                        <li class="nav-item li-nav">
                            <a class="nav-link text-link text-dark" href="${caminhoContexto}/cadastrar-agendamento">Agendamento</a>
                        </li>
                        <li class="nav-item li-nav">
                            <a class="nav-link text-link text-dark" href="${caminhoContexto}/gerenciamento-negocio">Meu negócio</a>
                        </li>
                        <div class="dropdown">
                            <button class="btn  dropdown-toggle" type="button" id="dropdownMenuButton"
                                    data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="ph ph-user-check"></i>
                            </button>

                            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                <a class="dropdown-item" href="#">Configurações</a>
                                <a class="dropdown-item" href="#">Sair</a>
                            </div>
                        </div>
                    </ul>


                </div>
            </nav>

        </div>

        <div class="container d-flex mt-3">
            <div class="profile-card d-flex flex-column mr-3">
                <div id="circ-cor-primaria" class="mx-auto"></div>
                <div id="circ-cor-secundaria" class=""></div>
                <button class="btn mx-auto" id="btn-config-estilo">Configurações de estilo</button>
            </div>

            <div class="settings-card d-flex flex-column">
                <div class="header">
                    <h2>Configurações de estilo</h2>

                </div> 
                <form method="POST" action="editar-estilo" enctype="multipart/form-data">
                    <div class="settings-item">

                        <div class="value">
                            <i class="ph ph-eyedropper"></i>
                            <span>Cor primaria</span>
                        </div>
                        <input name="corPrimaria" type="color" value="#DEBDC6">
                    </div>
                    <div class="settings-item">

                        <div class="value">
                            <i class="ph ph-eyedropper"></i>
                            <span>Cor secundaria</span>
                        </div>
                        <input name="corSecundaria" type="color" value="#B7044A">
                    </div>
                    <div class="settings-item">

                        <div class="value">
                            <i class="ph ph-cloud-arrow-up"></i>
                            <span>Logo</span>

                        </div>
                        <input type="file" accept="image/*" name="logo">
                    </div>
                    <div class="settings-item">

                        <div class="value">
                            <i class="ph ph-cloud-arrow-up"></i>
                            <span>Fundo</span>
                        </div>
                        <input type="file" accept="image/*" name="fundo">
                    </div>

                    <div class="settings-item">

                        <div class="value">
                            <i class="ph ph-cloud-arrow-up"></i>
                            <span>Login</span>
                        </div>
                        <input type="file" accept="image/*" name="imgLogin">
                    </div>


                    <button type="submit" class="button">Salvar alterações</button>
                </form>
            </div>
        </div>

        <div id="footer" class="fixed-bottom text-center py-3">
            <span class=" mx-auto">www.alinesimao.pt</span>
        </div>

    </body>

</html>