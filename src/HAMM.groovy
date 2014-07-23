/**
 * Counting Point Mutations
 */

def sampleDataset = ['GAGCCTACTAACGGGAT', 'CATCGTAATGACGGCCT']
def sampleOutput = 7

def hammingDistance(String first, String second) {

    def distance = 0

    (0..<first.length()).each { it ->
        if (first[it] != second[it]) distance++
    }

    return distance

}

assert hammingDistance(sampleDataset[0], sampleDataset[1]) == sampleOutput

println hammingDistance('your_string_one', 'your_string_two')