class Pessoa:
    def __init__(self, nome, idade="(idade não informada)"):
        self.nome = nome
        self.idade = idade

    def descansar(self):
        print(f"\n - {self.nome} foi descansar \n")

class Programador(Pessoa):
    def __init__(self, nome, linguagem):
        super().__init__(nome)
        self.linguagem = linguagem

class Escritor(Pessoa):
    def __init__(self, nome, idade, ferramenta):
        super().__init__(nome, idade)
        self.ferramenta = ferramenta


programador_1 = Programador("Pedro", "Python")
escritor_1 = Escritor("Shakespeare", 34, "caneta")

print("\n - \"{}\" tem {} e programa em \"{}\".". format(programador_1.nome, programador_1.idade, programador_1.linguagem))
print(" - \"{}\" tem \"{}\" anos de idade e escreve suas obras com \"{}\".".format(escritor_1.nome, escritor_1.idade, escritor_1.ferramenta))

programador_1.descansar()
