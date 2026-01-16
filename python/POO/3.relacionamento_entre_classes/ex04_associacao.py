class Cliente:
    def __init__(self, nome, saldo):
        self.nome = nome
        self.saldo = saldo
    
    def comer(self, comida):
        self.saldo -= comida.preco
        comida.venda()

class Comida:
    def __init__(self, prato, preco, estoque):
        self.prato = prato
        self.preco = preco
        self.estoque = estoque

    def venda(self):
        self.estoque -= 1

cliente_1 = Cliente("Thiago", 3000)
comida_1 = Comida("Feijoada", 34.90, 2)

print(f"\nSaldo do cliente (antes de comer): {cliente_1.saldo}")
print(f"Estoque da comida (antes de comer): {comida_1.estoque}\n")

cliente_1.comer(comida_1)

print(f"Saldo do cliente (depois de comer): {cliente_1.saldo}")
print(f"Estoque da comida (depois de comer): {comida_1.estoque}\n")