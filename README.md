# ExercPilhaLista
Exercícios aula 21/10/2019 de AED-I

PUCRS – Algoritmos e Estruturas de Dados I

Exercícios de Pilha e Fila

Professora Isabel Harb Manssour

1. Um *Deque* é uma estrutura de dados similar a uma fila que suporta inserção e remoção
tanto em seu final, quanto em seu início, e possui os métodos listados abaixo. Implemente
um deque usando duas pilhas como atributos para armazenar os seus elementos. Depois
teste se a sua implementação está correta instanciando e manipulando um deque.
* *addFirst(e)*: insere o elemento e no começo do deque.
* *addLast(e)*: insere o elemento e no final do deque.
* *removeFirst()*: remove e retorna o elemento e do início do deque, e ocorre um erro se o
deque estiver vazio.
* *removeLast()*: remove e retorna o elemento e do final do deque, e ocorre um erro se o deque
estiver vazio.
* *getFirst()*: retorna, mas não remove, o primeiro elemento do deque, e ocorre um erro se o
deque estiver vazio.
* *getLast()*: retorna, mas não remove, o último elemento do deque, e ocorre um erro se o deque
estiver vazio.
* *size()*: retorna o número de elementos da fila.
* *isEmpty()*: retorna true se a fila estiver vazia, e false caso contrário.

2. Expressões aritméticas podem conter vários pares de símbolos agrupados, e para cada
símbolo de abertura deve corresponder um símbolo de fechamento. Por exemplo:
( ) { [ ( ) ] } [ ( ) ( ) ]. Implemente um método que recebe uma string que contém um grupo
de símbolos e, usando uma pilha, verifica se o grupo contém apenas símbolos “casados”
corretamente, isto é, para cada abertura há um fechamento. Se houver apenas símbolos
“casados”, o método retorna *true*, senão retorna *false*. Depois teste se a sua
implementação está correta chamando o método implementado enviando diferentes
parâmetros de entrada.

3. Suponha que você tem duas pilhas não vazias S e T e um deque D. Descreva como usar
D de maneira que S armazene todos os elementos de T abaixo de seus elementos
originais, mantendo os dois conjuntos de elementos em sua ordem original.

4. Implemente um método chamado *furaFila* que recebe uma fila e um elemento por
parâmetro e coloca o elemento no início da Fila.

5. Implemente um método chamado *ehPalindromo* que recebe uma String por parâmetro e,
obrigatoriamente, usa uma pilha para verificar se esta String é um palíndromo. Se for, o
método retorna verdadeiro, caso contrário retorna falso.

**Desafio:** Suponha que você tenha uma pilha S contendo n elementos e uma fila Q que está
inicialmente vazia. Descreva como você pode usar Q para percorrer S para ver se ela
contém um certo elemento x, com a restrição adicional que seu algoritmo deve retornar
os elementos de volta para S em sua ordem original. Você não pode usar um arranjo ou
uma lista encadeada – apenas S e Q e um número fixo de variáveis de referência.
