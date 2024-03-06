Uma empresa possui varios funcionarios.
A empresa deseja calcular o valor por todos os funcionarios

SalarioLiq = Salario base - 13% inss + 10% se for gerente
    -3% se usar vale transporte +50 por filho, ate 3 filhos 
    se trabalhar a noite tem adicional noturno, 2%
    se for vendedor recebe 2% das vendas realizadas.


Ao final mostre o funcionario com maior salario de empresa

1º passo - identifcar as classes
Funcionario
Empresa
Main

2º passo - atributos
Funcionario - salario, nome, funcao, noturno, filhos, valetrans, totalVendas
Empresa - nome, listaFuncionarios

3º passo responsabilidade
Funcionario - salario liquido
Empresa - FuncionariosMaiorSalario, somaSalario