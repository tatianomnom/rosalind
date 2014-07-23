/**
 * Enumerating Gene Orders
 */

def sampleDataset = 3
def sampleOutput = '''6
1 2 3
1 3 2
2 1 3
2 3 1
3 1 2
3 2 1'''

def calculatePermutations(int n) {

    def permutations = (1..n).permutations()

    def result = new StringBuilder().append(permutations.size())

    permutations.collect { it -> it.join(' ') }
            .sort()
            .each { it -> result.append("\n${it}") }

    return result.toString()
}

assert calculatePermutations(sampleDataset) == sampleOutput

println calculatePermutations(5)



