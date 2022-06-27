<H1> DTO - DATA TRANSFER OBJECT</H1>

>**O que é um dto?**
> > é um transformador de dados que vem do banco, ou vão para ele, em objeto.

>**Por que isso é importante?**
> > Em sua grande maioria, objeto que salvamos no banco de dados tem muitas informações desnecessarias para o saber do usuario,
> como por exemplo: data de inclusão, de alteração, identificador, coisas importantes para o banco que não são para o usuario final.
> Sabendo disso criamos o DTO para salvar no banco de dados todas informações necessarias e exibir para o usuario somente as que ele precisa.

>**Como fazemos essa conversão do banco para o usuario?**
> > Podemos usar alguns artificios como mostrei no service, lá, eu usei conversores, aqueles são basicos, por isso não recomendo, mas já da para trabalhar.

> **Como tudo isso acontece?**
> > pegamos dados do banco, transformamos ele para que o usuario entenda e seja legal para ele. Ou pode ser o inverso, pegamos as informações que precisamos do usuario e transformamos de maneira que o banco de dados aceite.

<h3>O que utilizamos no projeto:</h3>

<p> Tudo que foi utilizado aqui é pensando em programadores iniciantes, que estão começando agora na area da programação.</p>
<p>O projeto foi separado em alguns arquivos, dentre eles:</p>

>**Controller:**
> estes são responsaveis pela chamada do front end, ou seja, o controlador e gerente do projeto, é ele que vai dizer onde buscar.

>**Service:**
> Onde estão localizadas as logicas e toda funcionalidade do nosso projeto.

>**Entity:**
>São as entidades do projeto, aqui são os dados explicitos que vão ser inseridos no banco de dados.

>**Repository:**
> é o que vamos chamar para acessar nosso banco de dados.

>**DTO:**
>Classes responsavel por fragmentar o Entity, objeto que o usuario final precisa conhecer.

<h3> Coisas que não precisa entender:</h3>
<p> os transformadores que utilizamos com map no Cliente Service. É algo que precisa ter um pouco mais de conhecimento em Java.</p>