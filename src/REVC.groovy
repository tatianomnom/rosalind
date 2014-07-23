/**
 * Complementing a Strand of DNA
 */

def sampleDataset = 'AAAACCCGGT'
def sampleOutput = 'ACCGGGTTTT'

def reverseComplement(String input) {

    def complements = ['A': 'T', 'T': 'A', 'C': 'G', 'G': 'C']

    StringBuilder sb = new StringBuilder()

    input.reverse().each { it ->
        sb.append(complements[it])
    }

    return sb.toString()

}

assert reverseComplement(sampleDataset) == sampleOutput

println reverseComplement('your_string')