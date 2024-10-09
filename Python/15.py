class SaldoInsuficienteException(Exception):
    def __init__(self, saldo, valor_saque):
        super().__init__(f"Saque de valor {valor_saque} não liberado. Saldo disponível para saque é de: {saldo}")

class ContaBancaria:
    def __init__(self, saldo):
        self.saldo = saldo

    def sacar(self, valor):
        if valor > self.saldo:
            raise SaldoInsuficienteException(self.saldo, valor)
        self.saldo -= valor
        print(f"Saque realizado com sucesso. Saldo atual é de : {self.saldo}")

# Exemplo de uso
conta = ContaBancaria(1000)

try:
    conta.sacar(1500)
except SaldoInsuficienteException as e:
    print(e)  