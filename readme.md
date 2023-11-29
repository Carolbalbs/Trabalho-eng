Tipo de Usuário     Tempo de Empréstimo

Aluno Graduação    
Aluno Pós-Graduação 4 dias
Professor           7 dias
Tabela 1: Tempo de empréstimo de cada tipo de usuário
| Tipo de Usuário    |   Tempo de Empréstimo                           |
| :---------- |   :---------------------------------- |
| `Aluno Graduação` |  `3 dias` |
| `Aluno Pós-Graduação` |  ` 4 dias ` |
| `Professor` |  `7 dias` |

# Regra de Empréstimo para Aluno.
O empréstimo do livro só será concretizado para um aluno de graduação ou um aluno de
pós-graduação se:
- (i) houver a disponibilidade de algum exemplar daquele livro na biblioteca;
- (ii) o usuário não estiver “devedor” de um livro em atraso; 
- (iii) forem obedecidas as regras específicas daquele tipo de usuário no que se refere à quantidade máxima de empréstimos, de acordo com a Tabela 2; 
- (iv) a quantidade de reservas existentes do livro formenor do que a quantidade de exemplares disponíveis, caso o usuário não tenha reserva para ele; 
- (v) a quantidade de reservas for maior ou igual a de exemplares, mas uma das reservas é
do usuário; e 
- (vi) o usuário não tiver nenhum empréstimo em curso de um exemplar daquele mesmo livro.


Tipo de Usuário     Limite de Empréstimos em Aberto
Aluno Graduação       3 livros
Aluno Pós-Graduação   4 livros

| Tipo de Usuário    |   Tempo de Empréstimo                           |
| :---------- |   :---------------------------------- |
| `Aluno Graduação` |   `3 livros` |
| `Aluno Pós-Graduação` |   `4 livros` |

Tabela 2: Limites da quantidade de livros tomados como empréstimo

# Regra de Empréstimo para Professor.
O empréstimo do livro só será concretizado para um professor se: 
- (i) houver a disponibilidade de algum exemplar daquele livro na biblioteca; e
- (ii) o usuário não estiver “devedor” de um livro em atraso. Note que os professores não tem empréstimo negado caso haja reservas para aquele livro e não tem limite da quantidade de livros que pode pegar emprestado.
 
Além disso, podem surgir novos tipos de usuário para os quais as regras de empréstimo sejam
diferentes das já existentes para professor e alunos de graduação e de pós.

# Regras do Sistema


## Classe / metodo : EMPRESTAR
1. O sistema deve permitir o empréstimo de livros. Durante o empréstimo, o usuário informará o
comando “emp” seguido do código do usuário e do código do livro, separados por espaço em
branco. Ex.: “emp 123 100”. Caso o usuário tenha uma reserva feita previamente por ele para
o dado livro, a reserva deve ser excluída e o empréstimo efetivado. Ao final do procedimento
o sistema deve emitir uma mensagem de sucesso ou insucesso, que mencione o nome do
usuário e o título do livro. Se for uma mensagem de insucesso, ela deve também mencionar o
motivo do insucesso.


## Classe / metodo : DEVOLVER
2. O sistema deve permitir a devolução de um dado livro. Durante a devolução, o usuário deve
digitar o comando “dev” seguido do código de identificação do usuário e do código de
identificação do livro emprestado.


Ao final, o sistema deve emitir uma mensagem de sucesso ou insucesso da devolução, que mencione o nome do usuário e o título do livro. A mensagem de insucesso deve dizer o motivo. Nesse caso, o insucesso só ocorre se não houver empréstimo em aberto daquele livro para aquele usuário.

## Classe / metodo : REVERSAR
3. O sistema deve permitir a reserva de um livro. Durante esse processo de reserva, o usuário
deve digitar o comando “res”, o código de identificação do usuário e o código de identificação
do livro que o usuário deseja reservar. Será permitida a reserva de apenas 3 livros por usuário.
Ao final, o sistema deve emitir uma mensagem de sucesso ou insucesso da reserva, que
mencione o nome do usuário e o título do livro. A mensagem de insucesso deve dizer o
motivo.

## Classe / metodo : OBSERVAR
4. O sistema deve permitir que professores registrem que querem observar toda vez que
determinado livro tiver mais de duas reservas simultâneas. O professor se registra como
“observador” do livro que desejar. Toda vez que o livro tiver mais de duas reservas
simultâneas, o livro deve “avisar” aos “observadores”. 

O observador deve simplesmente registrar internamente quantas vezes ele foi notificado. No futuro, o sistema pode ser evoluído de forma que permita outros tipos de usuários, por exemplo, coordenadores, que também possam observar a reserva de livros. Implemente essa funcionalidade usando um padrão quepermita facilmente essa evolução no futuro. 
Para registrar um professor como observador de um livro, o usuário deve digitar o comando “obs” seguido do código do usuário e do código do livro. Não há necessidade de checar se o código do usuário se refere realmente a um professor.


## Classe / metodo : CONSULTA LIVRO
5. O sistema deve fornecer as seguintes consultas:
a. Dado o código de um livro, o sistema deve apresentar suas informações da seguinte forma: 
- (i) título, 
- (ii) quantidade de reservas para aquele livro, e, se diferente de zero,
devem ser também apresentados o nome dos usuários que realizaram cada reserva, 
- (iii)para cada exemplar, deve ser apresentado seu código, seu status (disponível ou
emprestado), e em caso do exemplar estar emprestado deverá ser exibido:
 - o nome do usuário que realizou o empréstimo, 
 - a data de empréstimo e
 - a data prevista para devolução. 

Para solicitar tal consulta, o usuário deverá digitar o comando “liv”, seguido do código do livro.

## Classe / metodo : HISTORICO DE EMPRESTIMO
b. Dado um usuário, o sistema deverá apresentar a lista de todos os seus empréstimos
correntes e passados, assim como de suas reservas. A listagem de cada empréstimo deverá
apresentar:
o título do livro, a data do empréstimo, o status atual daquele empréstimo (em
curso ou finalizado) e a data da devolução já realizada ou prevista. 

A listagem das reservas deverá apresentar o título do livro reservado e a data da solicitação da reserva.
Para solicitar tal consulta, o usuário deverá digitar o comando “usu”, seguido do código do usuário.

## Classe / metodo : NOTIFICACAO
c. Dado um professor, o sistema deve retornar a quantidade de vezes que ele foi notificado sobre mais de duas reservas simultâneas em livros observados por ele. Para solicitar tal consulta, o usuário deverá digitar o comando “ntf”, seguido do código do usuário. Não há necessidade de checar se o código se refere realmente a um professor.

6. O usuário deve ter a opção de sair do sistema. Para isso, basta digitar o comando “sai”.
