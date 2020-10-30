<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.project.beans.PerguntaCategoria"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="en">
<%
	ArrayList<PerguntaCategoria> listCategory = (ArrayList<PerguntaCategoria>) request.getAttribute("listCategory");
%>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="css/main.css">
<link rel="icon" href="imagens/favicon.webp" type="image/x-icon">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

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
					<a href="index.jsp"><img src="imagens/movida-white.png"></a>
				</div>
			</div>
			<div class="menu-right">
				<div class="contact">
					<a href="#"> <i class="contact-icon"></i>
						<p>Contato</p>
					</a>
				</div>
				<div class="reserve">
					<a href="#"> <i class="reserve-icon"></i>
						<p>Minhas reservas</p>
					</a>
				</div>
				<div class="login">
					<a href="#"> <i class="user-icon"></i>
						<p>Entrar</p>
					</a>
				</div>
			</div>
		</div>
	</header>
	<main class="container">
		<div class="action-bot">
			<h2>Gerenciamento de perguntas e respostas</h2>
			<p>${message}</p>
			<div class="add-question-btn">
				<button class="add-question">Adicionar</button>
			</div>

			<div class="table-all">
				<div class="table-container">
					<div class="table-header">
						<div class="question">
							<p>Pergunta:</p>
						</div>
						<div class="question-response">
							<p>Resposta:</p>
						</div>
						<div class="actions">
							<p>Ações:</p>
						</div>
					</div>
							<% 
							try {	
							
							Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm86441","021001");
							PreparedStatement stmt = conn.prepareStatement("select * from perguntas");
							ResultSet rs = stmt.executeQuery();
							while(rs.next()) {
								%>
								<div class="table-content">
									<div class="question-content">
										<p><%= rs.getString("PERGUNTA") %></p> 
										<p><%= rs.getString("RESPOSTA") %></p>
										<div class="bot-actions">
											<img src="imagens/delete.png">
										</div>
									</div>
								</div>
								<%
							}
							
							}catch (Exception e) {
								e.printStackTrace();
							}
							%>

				</div>
			</div>
		</div>
		<div class="category-actions">
			<button class="add-category">Adicionar Categoria</button>
		</div>
		<div class="hidden answer-modal">
			<div class="overlay">
				<div class="overlay-header">
					<h3>Insira sua pergunta:</h3>
					<span class="close-modal-overlay">X</span>
				</div>
				<form method="POST"
					action="${pageContext.request.contextPath}/registrapergunta">
					<label>Titulo</label> <input type="text" name="titulo"> <label>Pergunta</label>

					<input type="text" name="pergunta"> <label>Resposta</label>

					<input type="text" name="resposta">
					<label>Selecione sua categoria</label>
					<select name="category" class="category-select">
					<% 
					try {	
					
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm86441","021001");
					PreparedStatement stmt = conn.prepareStatement("select * from pergunta_categoria");
					ResultSet rs = stmt.executeQuery();
					while(rs.next()) {
						%>
						<option value="<%= rs.getInt("ID") %>"><%= rs.getString("NOME") %></option> 
						<%
					}
					}catch (Exception e) {
						e.printStackTrace();
					}
					%>
					</select>


					<button class="overlay-btn">Salvar</button>

				</form>
			</div>
		</div>

		<div class="hidden category-modal">
			<div class="overlay">
				<div class="overlay-header">
					<h3>Insira sua Categoria:</h3>
					<span class="close-modal-overlay-category">X</span>
				</div>
				<form method="POST"
					action="${pageContext.request.contextPath}/RegistraCategoria">

					<label>Nome da Categoria</label> <input type="text"
						name="nomeCategoria">

					<button class="overlay-btn">Salvar</button>

				</form>
			</div>
		</div>

	</main>
	<footer>
		<section class="footer-site">
			<div class="content">
				<div class="footer-content">
					<span> © 2020 Movida Aluguel de Carros | Todos os direitos
						reservados. </span>
					<div class="divider-footer"></div>
					<ul>
						<li><a href="https://www.facebook.com/MovidaRentaCar/"
							title="Facebook" target="_blank"><img
								src="imagens/facebook-icon-footer.svg" alt="Facebook icon"></a></li>
						<li><a
							href="https://www.instagram.com/movidaalugueldecarros/"
							title="Instagram" target="_blank"><img
								src="imagens/instagram-icon-footer.svg" alt="Instagram icon"></a>
						</li>
						<li><a
							href="https://www.youtube.com/channel/UCIzg278bDtVvX7krOHawA2g"
							title="Youtube" target="_blank"><img
								src="imagens/youtube-icon-footer.svg" alt="Youtube icon"></a></li>
						<li><a href="https://twitter.com/movidarentacar?lang=pt"
							title="Twitter" target="_blank"><img
								src="imagens/twitter-icon-footer.svg" alt="Twitter icon"></a></li>
						<li><a
							href="https://www.linkedin.com/company/movida-aluguel-de-carros"
							title="Linkedin" target="_blank"><img
								src="imagens/linkedin-icon-footer.svg" alt="Linkedin icon"></a>
						</li>
					</ul>
				</div>
			</div>
		</section>
	</footer>
</body>

</html>