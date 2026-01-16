# verificador de CPF

class Pessoa:
    def __init__(self, nome):
        self.nome = nome

    def adicionar_CPF(self, numeros):
        self.CPF = CPF(numeros)
        
    def verificar_CPF(self):
            if (self.CPF.validar_CPF()):
                print(f"\n - O CPF \"{self.CPF}\" de {self.nome} é valido! \n")
            else:
                print(f" - O CPF \"{self.CPF}\" de {self.nome} está incorreto. \n")

class CPF:
    def __init__(self, numeros):
        self.numeros = str(numeros)

    def validar_CPF(self):
        digito_1 = self.conta(10)
        digito_2 = self.conta(11)

        if (digito_1 == int(self.numeros[9])) and (digito_2 == int(self.numeros[10])):
            return True
        else:
            return False

    def conta(self, inicio):
        cont, soma = 0, 0  
        for peso in range(inicio, 1, -1):
            multiplicacao = int(self.numeros[cont]) * peso
            soma += multiplicacao
            cont += 1    
        resto = soma % 11

        if (resto < 2):
            return (0)
        else:
            return (11 - resto)

    def __str__(self):
        return (    
            f"{self.numeros[:3]}."
            f"{self.numeros[3:6]}."
            f"{self.numeros[6:9]}-"
            f"{self.numeros[9:]}"
        )


pessoa_1 = Pessoa("Bernardo")
pessoa_1.adicionar_CPF("02853091961")

pessoa_2 = Pessoa("Amanda")
pessoa_2.adicionar_CPF("92652543970")

Pessoa.verificar_CPF(pessoa_1)
Pessoa.verificar_CPF(pessoa_2)