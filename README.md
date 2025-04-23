# Dijkstra Manual (Implementação sem Estruturas Prontas)

## Descrição

Este projeto implementa o algoritmo de **Dijkstra** de forma manual, utilizando apenas estruturas de dados básicas como listas encadeadas, sem o uso de classes prontas como `LinkedList` ou `PriorityQueue` do Java.

O algoritmo de Dijkstra é utilizado para encontrar o caminho mais curto a partir de um vértice de origem até todos os outros vértices em um grafo ponderado.

## Estruturas de Dados

- **Node**: Representa um nó no grafo, com um identificador (id), distância e um ponteiro para o próximo nó.
- **Edge**: Representa uma aresta direcionada entre dois nós, com um peso associado.
- **EdgeList**: Lista encadeada que armazena as arestas de um nó.
- **Graph**: Representa o grafo, com métodos para adicionar arestas e executar o algoritmo de Dijkstra.

## Como Funciona

1. **Inicialização**:
   - O grafo é criado com um número de vértices.
   - As arestas são adicionadas ao grafo utilizando o método `addEdge`.

2. **Execução do Algoritmo de Dijkstra**:
   - A partir de um vértice de origem, o algoritmo calcula as distâncias mínimas até todos os outros vértices.
   - O processo continua até que todos os vértices tenham sido visitados.

3. **Saída**:
   - O algoritmo imprime as distâncias mínimas a partir do vértice de origem até os demais vértices.

## Estrutura do Código

### Classes:
- **Node**: Representa os nós do grafo.
- **Edge**: Representa as arestas do grafo.
- **EdgeList**: Gerencia as arestas de cada nó utilizando uma lista encadeada.
- **Graph**: Contém a lógica para a construção do grafo e a execução do algoritmo de Dijkstra.

## Como Rodar o Projeto

1. Clone o repositório para o seu computador:
   ```bash
   git clone https://github.com/luix-hr/dijkstra-manual.git

2. Compile e execute o código:

  ```bash
$ javac DijkstraManual.java
$ java DijkstraManual
```
3. O algoritmo exibirá as distâncias mínimas a partir do vértice de origem.

## Exemplo de Saída
| Vértice | Distância da origem |
|---------|---------------------|
| 0       | 0                   |
| 1       | 8                   |
| 2       | 9                   |
| 3       | 7                   |
| 4       | 5                   |

## Contribuições
Sinta-se à vontade para fazer um fork deste projeto, melhorar o código ou sugerir novas funcionalidades. Se você encontrar algum erro, por favor, abra uma issue para que possamos corrigir.

## Licença
Este projeto é de código aberto, licenciado sob a licença MIT. Veja o arquivo LICENSE para mais informações.
