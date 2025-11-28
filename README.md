# Árvores Binárias de Busca (BST)
Implementação em Java realizada por **Mario Cadena** e **Lívia Maria**  
Projeto da disciplina **Estruturas de Dados II (ED2)**

## Sobre o Projeto
Este repositório contém uma implementação didática de uma **Árvore Binária de Busca (Binary Search Tree — BST)** em Java.  
Aqui são demonstradas as operações fundamentais da estrutura:
- Inserção de valores  
- Busca por elementos  
- Travessias da árvore (in-order, pré-order e pós-order)

O projeto tem finalidade **educacional**, ideal para reforçar o entendimento sobre árvores binárias e seus métodos principais.

## Resumo do Conteúdo do Vídeo
No vídeo, apresentamos:

- O conceito de uma BST e suas regras.  
- A construção passo a passo da árvore.  
- Como funcionam as operações de inserção e busca.  
- Como interpretar os resultados das travessias.  
- Demonstração da execução do código em Java e análise dos resultados.

## Funcionalidades Implementadas
- Inserção de nós na Árvores Binária de Busca.
- Busca por valores.
- Travessia da árvore nos métodos:
  - **In-order** (esquerda, raiz, direita)
  - **Pré-order** (raiz, esquerda, direita) 
  - **Pós-order** (esquerda, direita, raiz)
- Estrutura clara e organizada, ideal para aprendizado.

## Como Executar o Código

### 1. Pré-requisitos
- Ter **Java JDK** instalado (qualquer versão recente funciona — 8+ recomendado).  
- Uma IDE de sua preferência (Eclipse, IntelliJ, NetBeans, VS Code)  
  *ou* um compilador Java em linha de comando.

### 2. Execução passo a passo

1. Baixe/clique em “Code > Download ZIP” ou clone este repositório.  
2. Abra a pasta na sua IDE.  
3. Abra os arquivos `.java`.  
4. Compile os arquivos.  
5. Execute a classe de teste que deseja:
   - `INSERCAO.java`
   - `BUSCA.java`
   - `TRAVESSIA.java`

## Exemplo de Uso
- Inserindo valores na árvore  
- Buscando um número específico  
- Exibindo as travessias

Isso ajuda a entender como a árvore se comporta ao longo das operações.

### Inserção (exemplo simples)
```
ArvoreBST arvore = new ArvoreBST();
arvore.inserir(10);
arvore.inserir(5);
arvore.inserir(20);
```
### Travessia In-Order (saída esperada)
```
5 10 20
```

### Busca
```
arvore.buscar(10);   // encontrado
arvore.buscar(7);    // não encontrado
```






