import os
from functions import Aluno

while True:
    os.system("cls")
    try:
        print(f"{" ESCOLINHA DO JAGUNÇO ":=^50}")
        opcao = int(input('''
Escolha uma opção:                           
    [1] Cadastrar aluno
    [2] Editar cadastro de aluno
    [3] Remover cadastro de aluno
    [4] Listar alunos cadastrados
    [5] Calcular média da turma
    -> '''))
    except:
        input("\n ***Valor digitado incorreto. Tente novamente pressionando ENTER.")
        continue

    match (opcao):
        case 1:
            nome = input("\n - Digite o nome do aluno: ")
            media = float(input(" - Digite a média do aluno: "))
            Aluno(nome, media)
        case 2:
            identificador = input("\n - Digite o ID ou nome do aluno a ser editado: ")
            Aluno.editar(identificador)
        case 3:
            identificador = input("\n - Digite o ID ou nome do aluno a ser removido: ")
            try:
                identificador = int(identificador)
            except:
                pass
            finally:
                Aluno.remover(identificador) 
        case 4:
            Aluno.listar()
        case 5:
            pass
        case _:
            input("\n ***Valor incorreto digitado. Pressione ENTER para tentar novamente.")
            continue

    input("\n *Pressione ENTER para continuar.")
