/**
 * Counting DNA Nucleotides
 */

def sampleDataset = 'AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC'
def sampleOutput = '20 12 17 21'

def countNucleotides(String input) {
    "${input.count('A')} ${input.count('C')} ${input.count('G')} ${input.count('T')}"
}

assert countNucleotides(sampleDataset) == sampleOutput

println countNucleotides('your_string')