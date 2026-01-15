from random import randint

class Loja:
    produtos = [] # Atributo de classe

    def __init__(self, nome, preco, estoque): # Método construtor
        self.nome = nome        # Atributo de objeto
        self.preco = preco      # Atributo de objeto
        self.estoque = estoque  # Atributo de objeto
        Loja.produtos.append(self) # Processamento entre objeto e classe

    def produto_disp(self): # Método de objeto (atua sobrem quem chamou)
        if (self.estoque == True):
            print(f" - O produto \"{self.nome}\" está em estoque! \n")
        elif (self.estoque == False):
            print(f" - O produto \"{self.nome}\" não possui estoque atualmente, desculpe. \n")

    @classmethod
    def maior(cls): # Método de classe (atua sobre os atributos da classe)
        precos = [] # Variável local
        for i in range(len(cls.produtos)):
            precos.append(cls.produtos[i].preco)
        maior_p = max(precos)
        maior_n = cls.produtos[precos.index(maior_p)].nome

        print(f"\n - O produto de nome \"{maior_n}\" tem o maior preço, sendo: R${maior_p} \n")

    @staticmethod
    def gerar_loteria():
        num_sorte = randint(100000, 999999)
        return num_sorte

p1 = Loja("Esponja", 5.0, True)     # Cria um objeto na classe Loja
p2 = Loja("Carrinho", 99.8, False)  # Cria um objeto na classe Loja

Loja.maior()      # Chama o método de classe - "maior"
p1.produto_disp() # Chama o método de objeto - "produto_disp"
num_sorte = Loja.gerar_loteria() # Chama o método estático - "gerar_loteria"
print(f" - Seu número da sorte é: {num_sorte} \n")
