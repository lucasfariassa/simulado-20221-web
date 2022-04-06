<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projeto Condominio</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>

<main class="container">
<div class="px-4 py-5 my-5 ">
    <h1 class="display-5 fw-bold">Projeto Condominio</h1>
    <div class="col-lg-6 mx-auto">
    
    
      <p class="lead m-4">
      	PARTE 1
      </p>
      
      <p>
       Aqui vamos nós! Um cliente nos solicitou um sistema de gestão de condomínios e para começar a validar 
       as necessidades do cliente resolvemos fazer um prototipo funcional do sistema.
      </p>
      
      <p>
      A primeira funcionalidade seria uma tela de login. Para facilitar, vocês já tem uma Classe Usuario.java e uma classe 
      UsuarioDAO.java que vão representar o nosso Modelo de dados e o nosso repositorio respectivamente.
            <ul>
       <li> Edite o LoginController que recebe os dados do login e senha do usuário 
       <li> Verifica se o usuário existe e testa se a senha está correta.
       <li> Se estiver correta redireciona para o servlet que vai exibir a lista de usuários.
       <li> Se estiver errada redireciona de volta para o login.jsp.
      </ul>
      </p>
      <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
        <a href="login.jsp" class="btn btn-primary btn-lg px-4 gap-3">PARTE 1</a>
      </div>
    </div>
    
     <div class="col-lg-6 mx-auto">
      <p class="lead m-4">
      PARTE 2
      </p>
      <p>
Exiba a lista de usuários. 
      <ul>
       <li> Edite o UsuarioListController que deve pesquiasr a lista de usuário e repassar ao lista.jsp 
       <li> Edite o lista.jsp que exibe a lista de usuários.
      </ul>
      </p>
      <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
        <a href="/lista" class="btn btn-primary btn-lg px-4 gap-3">PARTE 2</a>
      </div>
    </div>

   <div class="col-lg-6 mx-auto">
      <p class="lead m-4">
      PARTE 3
      </p>
      <p>
			Formulario para adicionar Usuários. 
      <ul>
     	<li> Crie o jsp com o formulário para coletar os dados do usuário.
       	<li> Crie um Controller que recebe os dados do usuário e salva no "UsuarioDAO". 
      </ul>
      </p>
      <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
        <a href="/novo" class="btn btn-primary btn-lg px-4 gap-3">PARTE 3</a>
      </div>
    </div>
  </div>
</div>
</main>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>