class Calculo:
    def __init__(self, num1):
        self.num1 = num1

    def __str__(self):
        return(f"A incógnita vale: {self.num1}")

    def __add__(self, num):
        return (f"A soma entre {self.num1} e {num}: {self.num1 + num}")

    def __sub__(self, num):
        return (f"A subtração entre {self.num1} e {num} é: {self.num1 - num}")
    
    def __mul__(self, num):
        return (f"A multiplicação entre {self.num1} e {num} é: {self.num1 * num}")

    def __eq__(self, num):
        return f"O número {self.num1} e {num} são {"Iguais" if (self.num1 == num) else "Diferentes"}"

    @staticmethod
    def __call__(*args):
        for i in range(len(args)):
            print(args[i], end=" ")

incognita = Calculo(5)

print()
print(incognita)

print(incognita + 3)
print(incognita - 2)
print(incognita * 4)

print(incognita == 2)
print(incognita == 5)

incognita(3, 2, 1) # Gambiarra
print()