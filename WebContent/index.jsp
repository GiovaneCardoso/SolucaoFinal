<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="css/main.css">
    <link rel="icon" href="imagens/favicon.webp" type="image/x-icon">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="js/jquery.mask.min.js"></script>
    <script src="js/main.js"></script>

</head>

<body>
    <header>
        <div class="shell">
            <div class="menu-left">
                <div class="menu">
                    <a href="#"><img src="imagens/hamb-menu-white.png"></a>
                </div>
                <div class="logo">
                    <a href="#"><img src="imagens/movida-white.png"></a>
                </div>
            </div>
            <div class="menu-right">
                <div class="contact">
                    <a href="#">
                        <i class="contact-icon"></i>
                        <p>Contato</p>
                    </a>
                </div>
                <div class="reserve">
                    <a href="#">
                        <i class="reserve-icon"></i>
                        <p>Minhas reservas</p>
                    </a>
                </div>
                <div class="login">
                    <a href="#">
                        <i class="user-icon"></i>
                        <p>Entrar</p>
                    </a>
                </div>
            </div>
        </div>
    </header>
    <main class="home">
        <div class="main-banner">
            <img src="imagens/bannerhome.png">
        </div>
        <div class="infos-container">
            <div class="bot-infos">
                <h1>Entenda mais sobre o CHATBOT</h1>
                <p>O chatbot � uma solu��o que complementa o SAC, sendo assim, juntamente ao SAC, tem como objetivo
                    sanar
                    todas as d�vidas do usuario unicamente na plataforma digital, atrav�s de perguntas e respostas pr�
                    cadastradas, � criado um sistema automatico, facil e r�pido de atendimento ao cliente</p>
            </div>
            <div class="bot-other-infos">
                <h2>E se o usu�rio n�o encontrar sua d�vida pelo CHATBOT?</h2>
                <p>� aqui que entramos em a��o! respondendo suas d�vidas atrav�s do chat online.</p>
                <p>O chat online tem como fun��o ter um chat ao vivo, onde um atendente pode atender um chamado de um
                    cliente que teve uma d�vida n�o sanada. A partir da�, teremos profissionais reais que conseguem
                    resolver
                    esses problemas
                    <a href="perguntas.jsp" class="control-link"><button class="control-btn">Ir ao painel de controle</button></a>
            </div>
            <div class="platform-infos">
                <h2>Entendendo a plataforma</h2>
                <h3>Administra��o - ChatBot</h3>
                <div class="img-bot">
                    <img src="imagens/answer.png">
                    <p>Na pagina de gest�o do bot, voc� pode consultar todas as perguntas j� cadastradas e suas
                        respectivas
                        respostas. E atrav�s das a��es do canto direito, pode alterar essas informa��es ou at� mesmo
                        deletar, caso necess�rio</p>
                </div>
                <h3>Administra��o - Live chat</h3>
                <div class="img-attendance">
                    <img src="imagens/atendimento-sala.png">
                    <p>Na pagina de gest�o de atendimento, voc� pode consultar todas as pessoas que naquele momento
                        est�o
                        precisando de sua ajuda, e clicando no bot�o "IR" ao lado da pessoa, voc� ser� redirecionado
                        para um
                        chat com aquela pessoa</p>

                </div>
            </div>
        </div>

    </main>
    <div class="bot-container">
        <i class="close-modal">X</i>
        <div class="bot-header">
            <img src="imagens/bot.jpg" /><h3>Bot Movida</h3>
        </div>
        <div class="chat-container">
            <div class="bot-answer-item">
                <p class="bot-answer">Ol�, para podermos te ajudar melhor, selecione abaixo a op��o sobre o que est� buscando!</p>
                <div class="bot-options">
                    <button id="option1" class="option1" >Op��o 1</button>
                    <button>Op��o 2</button>
                </div>
            </div>
            <div class="bot-answer-item hidden">
                <p class="bot-answer">Certo, agora selecione o tipo de problema que encontrou</p>
                <div class="bot-options">
                    <button id="option1" class="option1" >Op��o 1</button>
                    <button>Op��o 2</button>
                    <button>Op��o 3</button>
                </div>
            </div>
            <div class="chat-questions">
                <input type="text" class="sendMessage"><i class="submit-question">></i></input>

            </div>
        </div>
    </div>
    <footer>
        <section class="footer-site">
            <div class="content">
                <div class="footer-content">
                    <span>
                        � 2020 Movida Aluguel de Carros | Todos os direitos reservados.
                    </span>
                    <div class="divider-footer"></div>
                    <ul>
                        <li><a href="https://www.facebook.com/MovidaRentaCar/" title="Facebook" target="_blank"><img
                                    src="imagens/facebook-icon-footer.svg" alt="Facebook icon"></a></li>
                        <li><a href="https://www.instagram.com/movidaalugueldecarros/" title="Instagram"
                                target="_blank"><img src="imagens/instagram-icon-footer.svg" alt="Instagram icon"></a>
                        </li>
                        <li><a href="https://www.youtube.com/channel/UCIzg278bDtVvX7krOHawA2g" title="Youtube"
                                target="_blank"><img src="imagens/youtube-icon-footer.svg" alt="Youtube icon"></a></li>
                        <li><a href="https://twitter.com/movidarentacar?lang=pt" title="Twitter" target="_blank"><img
                                    src="imagens/twitter-icon-footer.svg" alt="Twitter icon"></a></li>
                        <li><a href="https://www.linkedin.com/company/movida-aluguel-de-carros" title="Linkedin"
                                target="_blank"><img src="imagens/linkedin-icon-footer.svg" alt="Linkedin icon"></a>
                        </li>
                    </ul>
                </div>
            </div>
        </section>
    </footer>
</body>

</html>