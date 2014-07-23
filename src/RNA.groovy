/**
 * Transcribing DNA into RNA
 */

def sampleDataset = 'GATGGAACTTGACTACGTAAATT'
def sampleOutput = 'GAUGGAACUUGACUACGUAAAUU'

def transcribe(String input) {
    return input.replaceAll('T', 'U')
}

assert transcribe(sampleDataset) == sampleOutput

println transcribe('your_string')