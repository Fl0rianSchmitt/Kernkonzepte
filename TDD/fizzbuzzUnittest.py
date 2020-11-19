import unittest
from fizzbuzz import *

class TestFizzBuzz(unittest.TestCase):

    def test_fizzbuzz(self):
        self.assertEqual(fizzbuzz(15), 'fizzbuzz')
    
    def test_fizz(self):
        self.assertEqual(fizzbuzz(21), 'fizz')

    def test_buzz(self):
        self.assertEqual(fizzbuzz(55), 'buzz')

    def test_number(self):
        self.assertEqual(fizzbuzz(11), 11)

if __name__ == '__main__':
    unittest.main()
