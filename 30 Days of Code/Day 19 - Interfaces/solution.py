class AdvancedArithmetic(object):
    def divisorSum(n):
        raise NotImplementedError


class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        # Sum of divisors
        result = 1 # Since 1 is always a divisor
        i =2
       
        while i <= n:
            # Test for divisor
            if (n % i == 0):
                result = result + i
            i += 1
            
 
        return result


n = int(input())
my_calculator = Calculator()
s = my_calculator.divisorSum(n)
print("I implemented: " + type(my_calculator).__bases__[0].__name__)
print(s)